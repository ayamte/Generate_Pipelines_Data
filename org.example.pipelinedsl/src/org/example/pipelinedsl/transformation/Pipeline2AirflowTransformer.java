package org.example.pipelinedsl.transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

// Import PipelineDefinition (source)
import org.example.pipelinedefinition.*;

// Import AirflowPipeline (target)
import org.example.airflowpipeline.*;

/**
 * Transforme un modèle PipelineDefinition en modèle AirflowPipeline
 * Alternative Java à la transformation ATL
 */
public class Pipeline2AirflowTransformer {
    
    private AirflowpipelineFactory factory = AirflowpipelineFactory.eINSTANCE;
    
    /**
     * Transforme un modèle PipelineDefinition complet en DAG Airflow
     */
    public DAG transform(PipelineDefinition pipelineDef) {
        
        // Pour l'instant, on transforme le premier pipeline
        // Vous pouvez adapter pour créer plusieurs DAGs
        if (pipelineDef.getPipelines().isEmpty()) {
            return null;
        }
        
        Pipeline pipeline = pipelineDef.getPipelines().get(0);
        return transformPipeline(pipeline);
    }
    
    /**
     * Transforme un Pipeline en DAG Airflow
     */
    private DAG transformPipeline(Pipeline pipeline) {
        
        DAG dag = factory.createDAG();
        dag.setDagId(pipeline.getName());
        dag.setDescription(pipeline.getDescription());
        dag.setScheduleInterval(pipeline.getSchedule());
        dag.setStartDate("2024-01-01"); // Date par défaut
        
        // Créer les opérateurs
        PythonOperator sourceOp = createSourceOperator(pipeline.getName() + "_extract", pipeline.getSource());
        PythonOperator transformOp = createTransformOperator(pipeline.getName() + "_transform", pipeline.getTransformations());
        PythonOperator sinkOp = createSinkOperator(pipeline.getName() + "_load", pipeline.getSink());
        
        // Ajouter les opérateurs au DAG
        dag.getOperators().add(sourceOp);
        dag.getOperators().add(transformOp);
        dag.getOperators().add(sinkOp);
        
        // Créer les dépendances
        TaskDependency dep1 = factory.createTaskDependency();
        dep1.setUpstreamTaskId(sourceOp.getTaskId());
        dep1.setDownstreamTaskId(transformOp.getTaskId());
        
        TaskDependency dep2 = factory.createTaskDependency();
        dep2.setUpstreamTaskId(transformOp.getTaskId());
        dep2.setDownstreamTaskId(sinkOp.getTaskId());
        
        dag.getDependencies().add(dep1);
        dag.getDependencies().add(dep2);
        
        // Créer les connexions si nécessaire
        if (pipeline.getSource() instanceof PostgreSQLSource) {
            PostgreSQLSource pgSource = (PostgreSQLSource) pipeline.getSource();
            Connection conn = createConnection(
                "postgres_" + pgSource.getHost(),
                "postgres",
                pgSource.getHost(),
                pgSource.getPort(),
                pgSource.getUsername(),
                pgSource.getPassword(),
                pgSource.getDatabase()
            );
            dag.getConnections().add(conn);
            sourceOp.setConnection(conn);
        }
        else if (pipeline.getSource() instanceof MongoDBSource) {
            MongoDBSource mongoSource = (MongoDBSource) pipeline.getSource();
            Connection conn = createConnection(
                "mongo_" + mongoSource.getHost(),
                "mongo",
                mongoSource.getHost(),
                mongoSource.getPort(),
                mongoSource.getUsername(),
                mongoSource.getPassword(),
                mongoSource.getDatabase()
            );
            dag.getConnections().add(conn);
            sourceOp.setConnection(conn);
        }
        
        if (pipeline.getSink() instanceof DataWarehouseSink) {
            DataWarehouseSink dwSink = (DataWarehouseSink) pipeline.getSink();
            Connection conn = createConnection(
                "warehouse_" + dwSink.getHost(),
                "postgres",
                dwSink.getHost(),
                dwSink.getPort(),
                dwSink.getUsername(),
                dwSink.getPassword(),
                dwSink.getDatabase()
            );
            dag.getConnections().add(conn);
            sinkOp.setConnection(conn);
        }
        
        return dag;
    }
    
    /**
     * Crée un opérateur Python pour la source
     */
    private PythonOperator createSourceOperator(String taskId, DataSource source) {
        
        PythonOperator operator = factory.createPythonOperator();
        operator.setTaskId(taskId);
        operator.setDescription("Extract data from source");
        operator.setOpcode("extract");
        operator.setRetry(3);
        operator.setTimeout(300);
        
        if (source instanceof PostgreSQLSource) {
            PostgreSQLSource pgSource = (PostgreSQLSource) source;
            operator.setPythonCallable("extract_postgres");
            String params = String.format(
                "{\"table\": \"%s\", \"database\": \"%s\"}",
                pgSource.getTable(),
                pgSource.getDatabase()
            );
            operator.setParameters(params);
        }
        else if (source instanceof MongoDBSource) {
            MongoDBSource mongoSource = (MongoDBSource) source;
            operator.setPythonCallable("extract_mongodb");
            String params = String.format(
                "{\"collection\": \"%s\", \"database\": \"%s\"}",
                mongoSource.getCollection(),
                mongoSource.getDatabase()
            );
            operator.setParameters(params);
        }
        else if (source instanceof RestAPISource) {
            RestAPISource apiSource = (RestAPISource) source;
            operator.setPythonCallable("extract_api");
            String params = String.format(
                "{\"url\": \"%s\", \"method\": \"%s\", \"headers\": \"%s\"}",
                apiSource.getUrl(),
                apiSource.getMethod(),
                apiSource.getHeaders() != null ? apiSource.getHeaders() : ""
            );
            operator.setParameters(params);
        }
        
        return operator;
    }
    
    /**
     * Crée un opérateur Python pour les transformations
     */
    private PythonOperator createTransformOperator(String taskId, java.util.List<Transformation> transformations) {
        
        PythonOperator operator = factory.createPythonOperator();
        operator.setTaskId(taskId);
        operator.setDescription("Transform data");
        operator.setRetry(3);
        operator.setTimeout(600);
        
        if (!transformations.isEmpty()) {
            Transformation firstTransform = transformations.get(0);
            
            if (firstTransform instanceof CleanTransform) {
                CleanTransform cleanTransform = (CleanTransform) firstTransform;
                operator.setPythonCallable("transform_clean");
                operator.setOpcode("transform_clean");
                String params = String.format(
                    "{\"remove_nulls\": %b, \"trim\": %b, \"deduplicate\": %b}",
                    cleanTransform.isRemoveNulls(),
                    cleanTransform.isTrim(),
                    cleanTransform.isDeduplicate()
                );
                operator.setParameters(params);
            }
            else if (firstTransform instanceof FilterTransform) {
                FilterTransform filterTransform = (FilterTransform) firstTransform;
                operator.setPythonCallable("transform_filter");
                operator.setOpcode("transform_filter");
                String params = String.format(
                    "{\"condition\": \"%s\"}",
                    filterTransform.getCondition()
                );
                operator.setParameters(params);
            }
            else if (firstTransform instanceof AggregateTransform) {
                AggregateTransform aggTransform = (AggregateTransform) firstTransform;
                operator.setPythonCallable("transform_aggregate");
                operator.setOpcode("transform_aggregate");
                String params = String.format(
                    "{\"group_by\": \"%s\", \"aggregation\": \"%s\"}",
                    aggTransform.getGroupBy(),
                    aggTransform.getAggregation()
                );
                operator.setParameters(params);
            }
        } else {
            // Transformation par défaut si aucune transformation n'est définie
            operator.setPythonCallable("transform_passthrough");
            operator.setOpcode("transform_clean");
            operator.setParameters("{}");
        }
        
        return operator;
    }
    
    /**
     * Crée un opérateur Python pour le sink
     */
    private PythonOperator createSinkOperator(String taskId, DataSink sink) {
        
        PythonOperator operator = factory.createPythonOperator();
        operator.setTaskId(taskId);
        operator.setDescription("Load data to destination");
        operator.setOpcode("load");
        operator.setRetry(3);
        operator.setTimeout(600);
        
        if (sink instanceof DataWarehouseSink) {
            DataWarehouseSink dwSink = (DataWarehouseSink) sink;
            operator.setPythonCallable("load_warehouse");
            String params = String.format(
                "{\"table\": \"%s\", \"database\": \"%s\"}",
                dwSink.getTable(),
                dwSink.getDatabase()
            );
            operator.setParameters(params);
        }
        else if (sink instanceof CSVSink) {
            CSVSink csvSink = (CSVSink) sink;
            operator.setPythonCallable("load_csv");
            String params = String.format(
                "{\"file_path\": \"%s\", \"separator\": \"%s\", \"include_header\": %b}",
                csvSink.getFilePath(),
                csvSink.getSeparator(),
                csvSink.isIncludeHeader()
            );
            operator.setParameters(params);
        }
        else if (sink instanceof ElasticsearchSink) {
            ElasticsearchSink esSink = (ElasticsearchSink) sink;
            operator.setPythonCallable("load_elasticsearch");
            String params = String.format(
                "{\"host\": \"%s\", \"port\": %d, \"index\": \"%s\"}",
                esSink.getHost(),
                esSink.getPort(),
                esSink.getIndex()
            );
            operator.setParameters(params);
        }
        
        return operator;
    }
    
    /**
     * Crée une connexion Airflow
     */
    private Connection createConnection(String connId, String connType, String host, int port, String login, String password, String schema) {
        Connection conn = factory.createConnection();
        conn.setConnId(connId);
        conn.setConnType(connType);
        conn.setHost(host);
        conn.setPort(port);
        conn.setLogin(login);
        conn.setPassword(password);
        conn.setSchema(schema);
        return conn;
    }
    
    /**
     * Charge un fichier XMI PipelineDefinition et le transforme en AirflowPipeline
     */
    public static void transformFile(String inputXmiPath, String outputXmiPath) throws Exception {
        
        // 1. Enregistrer les packages EMF
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
            PipelinedefinitionPackage.eNS_URI,
            PipelinedefinitionPackage.eINSTANCE
        );
        
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
            AirflowpipelinePackage.eNS_URI,
            AirflowpipelinePackage.eINSTANCE
        );
        
        // 2. Charger le modèle PipelineDefinition
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        
        Resource inputResource = resourceSet.getResource(
            URI.createFileURI(new java.io.File(inputXmiPath).getAbsolutePath()), true);
        
        if (inputResource.getContents().isEmpty()) {
            throw new Exception("Le fichier XMI d'entrée est vide");
        }
        
        PipelineDefinition pipelineDef = (PipelineDefinition) inputResource.getContents().get(0);
        
        // 2. Transformer
        Pipeline2AirflowTransformer transformer = new Pipeline2AirflowTransformer();
        DAG airflowDAG = transformer.transform(pipelineDef);
        
        if (airflowDAG == null) {
            throw new Exception("Aucun pipeline à transformer");
        }
        
        // 3. Sauvegarder
        Resource outputResource = resourceSet.createResource(
            URI.createFileURI(new java.io.File(outputXmiPath).getAbsolutePath()));
        outputResource.getContents().add(airflowDAG);
        outputResource.save(null);
        
        System.out.println("✅ Transformation réussie !");
        System.out.println("   Fichier entrée : " + inputXmiPath);
        System.out.println("   Fichier sortie : " + outputXmiPath);
        System.out.println("   DAG ID : " + airflowDAG.getDagId());
        System.out.println("   Opérateurs : " + airflowDAG.getOperators().size());
        System.out.println("   Connexions : " + airflowDAG.getConnections().size());
        System.out.println("   Dépendances : " + airflowDAG.getDependencies().size());
    }
}
