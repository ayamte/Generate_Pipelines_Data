package org.example.pipelinedsl.transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

// Import EMF avec alias
import org.example.pipelinedefinition.PipelinedefinitionFactory;
import org.example.pipelinedefinition.PipelinedefinitionPackage;

// Import DSL Xtext
import org.example.pipelinedsl.pipelineDSL.PipelineDSLPackage;

/**
 * Transforme un modèle DSL Xtext en modèle EMF PipelineDefinition
 */
public class DSL2EMFTransformer {
    
    private PipelinedefinitionFactory factory = PipelinedefinitionFactory.eINSTANCE;
    
    /**
     * Transforme un modèle DSL complet
     */
    public org.example.pipelinedefinition.PipelineDefinition transform(
            org.example.pipelinedsl.pipelineDSL.PipelineDefinition dslModel) {
        
        org.example.pipelinedefinition.PipelineDefinition emfModel = 
            factory.createPipelineDefinition();
        
        for (org.example.pipelinedsl.pipelineDSL.Pipeline dslPipeline : dslModel.getPipelines()) {
            emfModel.getPipelines().add(transformPipeline(dslPipeline));
        }
        
        return emfModel;
    }
    
    /**
     * Transforme un pipeline
     */
    private org.example.pipelinedefinition.Pipeline transformPipeline(
            org.example.pipelinedsl.pipelineDSL.Pipeline dslPipeline) {
        
        org.example.pipelinedefinition.Pipeline emfPipeline = factory.createPipeline();
        
        emfPipeline.setName(dslPipeline.getName());
        emfPipeline.setDescription(dslPipeline.getDescription());
        emfPipeline.setSchedule(dslPipeline.getSchedule());
        
        emfPipeline.setSource(transformSource(dslPipeline.getSource()));
        
        for (org.example.pipelinedsl.pipelineDSL.Transformation dslTransform : dslPipeline.getTransformations()) {
            emfPipeline.getTransformations().add(transformTransformation(dslTransform));
        }
        
        emfPipeline.setSink(transformSink(dslPipeline.getSink()));
        
        return emfPipeline;
    }
    
    /**
     * Transforme une source de données
     */
    private org.example.pipelinedefinition.DataSource transformSource(
            org.example.pipelinedsl.pipelineDSL.DataSource dslSource) {
        
        if (dslSource instanceof org.example.pipelinedsl.pipelineDSL.PostgreSQLSource) {
            return transformPostgreSQLSource((org.example.pipelinedsl.pipelineDSL.PostgreSQLSource) dslSource);
        } else if (dslSource instanceof org.example.pipelinedsl.pipelineDSL.MongoDBSource) {
            return transformMongoDBSource((org.example.pipelinedsl.pipelineDSL.MongoDBSource) dslSource);
        } else if (dslSource instanceof org.example.pipelinedsl.pipelineDSL.RestAPISource) {
            return transformRestAPISource((org.example.pipelinedsl.pipelineDSL.RestAPISource) dslSource);
        }
        return null;
    }
    
    private org.example.pipelinedefinition.PostgreSQLSource transformPostgreSQLSource(
            org.example.pipelinedsl.pipelineDSL.PostgreSQLSource dslSource) {
        
        org.example.pipelinedefinition.PostgreSQLSource emfSource = 
            factory.createPostgreSQLSource();
        emfSource.setHost(dslSource.getHost());
        emfSource.setPort(dslSource.getPort());
        emfSource.setDatabase(dslSource.getDatabase());
        emfSource.setTable(dslSource.getTable());
        emfSource.setUsername(dslSource.getUsername());
        emfSource.setPassword(dslSource.getPassword());
        return emfSource;
    }
    
    private org.example.pipelinedefinition.MongoDBSource transformMongoDBSource(
            org.example.pipelinedsl.pipelineDSL.MongoDBSource dslSource) {
        
        org.example.pipelinedefinition.MongoDBSource emfSource = 
            factory.createMongoDBSource();
        emfSource.setHost(dslSource.getHost());
        emfSource.setPort(dslSource.getPort());
        emfSource.setDatabase(dslSource.getDatabase());
        emfSource.setCollection(dslSource.getCollection());
        emfSource.setUsername(dslSource.getUsername());
        emfSource.setPassword(dslSource.getPassword());
        return emfSource;
    }
    
    private org.example.pipelinedefinition.RestAPISource transformRestAPISource(
            org.example.pipelinedsl.pipelineDSL.RestAPISource dslSource) {
        
        org.example.pipelinedefinition.RestAPISource emfSource = 
            factory.createRestAPISource();
        emfSource.setUrl(dslSource.getUrl());
        emfSource.setMethod(dslSource.getMethod());
        emfSource.setApiKey(dslSource.getApiKey());
        emfSource.setHeaders(dslSource.getHeaders());
        return emfSource;
    }
    
    /**
     * Transforme une transformation
     */
    private org.example.pipelinedefinition.Transformation transformTransformation(
            org.example.pipelinedsl.pipelineDSL.Transformation dslTransform) {
        
        if (dslTransform instanceof org.example.pipelinedsl.pipelineDSL.CleanTransform) {
            return transformCleanTransform((org.example.pipelinedsl.pipelineDSL.CleanTransform) dslTransform);
        } else if (dslTransform instanceof org.example.pipelinedsl.pipelineDSL.FilterTransform) {
            return transformFilterTransform((org.example.pipelinedsl.pipelineDSL.FilterTransform) dslTransform);
        } else if (dslTransform instanceof org.example.pipelinedsl.pipelineDSL.AggregateTransform) {
            return transformAggregateTransform((org.example.pipelinedsl.pipelineDSL.AggregateTransform) dslTransform);
        }
        return null;
    }
    
    private org.example.pipelinedefinition.CleanTransform transformCleanTransform(
            org.example.pipelinedsl.pipelineDSL.CleanTransform dslTransform) {
        
        org.example.pipelinedefinition.CleanTransform emfTransform = 
            factory.createCleanTransform();
        emfTransform.setRemoveNulls(parseBoolean(dslTransform.getRemoveNulls()));
        emfTransform.setTrim(parseBoolean(dslTransform.getTrim()));
        emfTransform.setDeduplicate(parseBoolean(dslTransform.getDeduplicate()));
        emfTransform.setDescription(dslTransform.getDescription());
        return emfTransform;
    }
    
    private org.example.pipelinedefinition.FilterTransform transformFilterTransform(
            org.example.pipelinedsl.pipelineDSL.FilterTransform dslTransform) {
        
        org.example.pipelinedefinition.FilterTransform emfTransform = 
            factory.createFilterTransform();
        emfTransform.setCondition(dslTransform.getCondition());
        emfTransform.setDescription(dslTransform.getDescription());
        return emfTransform;
    }
    
    private org.example.pipelinedefinition.AggregateTransform transformAggregateTransform(
            org.example.pipelinedsl.pipelineDSL.AggregateTransform dslTransform) {
        
        org.example.pipelinedefinition.AggregateTransform emfTransform = 
            factory.createAggregateTransform();
        emfTransform.setGroupBy(dslTransform.getGroupBy());
        emfTransform.setAggregation(dslTransform.getAggregation());
        emfTransform.setDescription(dslTransform.getDescription());
        return emfTransform;
    }
    
    /**
     * Transforme un sink
     */
    private org.example.pipelinedefinition.DataSink transformSink(
            org.example.pipelinedsl.pipelineDSL.DataSink dslSink) {
        
        if (dslSink instanceof org.example.pipelinedsl.pipelineDSL.DataWarehouseSink) {
            return transformDataWarehouseSink((org.example.pipelinedsl.pipelineDSL.DataWarehouseSink) dslSink);
        } else if (dslSink instanceof org.example.pipelinedsl.pipelineDSL.CSVSink) {
            return transformCSVSink((org.example.pipelinedsl.pipelineDSL.CSVSink) dslSink);
        } else if (dslSink instanceof org.example.pipelinedsl.pipelineDSL.ElasticsearchSink) {
            return transformElasticsearchSink((org.example.pipelinedsl.pipelineDSL.ElasticsearchSink) dslSink);
        }
        return null;
    }
    
    private org.example.pipelinedefinition.DataWarehouseSink transformDataWarehouseSink(
            org.example.pipelinedsl.pipelineDSL.DataWarehouseSink dslSink) {
        
        org.example.pipelinedefinition.DataWarehouseSink emfSink = 
            factory.createDataWarehouseSink();
        emfSink.setHost(dslSink.getHost());
        emfSink.setPort(dslSink.getPort());
        emfSink.setDatabase(dslSink.getDatabase());
        emfSink.setTable(dslSink.getTable());
        emfSink.setUsername(dslSink.getUsername());
        emfSink.setPassword(dslSink.getPassword());
        return emfSink;
    }
    
    private org.example.pipelinedefinition.CSVSink transformCSVSink(
            org.example.pipelinedsl.pipelineDSL.CSVSink dslSink) {
        
        org.example.pipelinedefinition.CSVSink emfSink = factory.createCSVSink();
        emfSink.setFilePath(dslSink.getFilePath());
        emfSink.setSeparator(dslSink.getSeparator());
        emfSink.setIncludeHeader(parseBoolean(dslSink.getIncludeHeader()));
        return emfSink;
    }
    
    private org.example.pipelinedefinition.ElasticsearchSink transformElasticsearchSink(
            org.example.pipelinedsl.pipelineDSL.ElasticsearchSink dslSink) {
        
        org.example.pipelinedefinition.ElasticsearchSink emfSink = 
            factory.createElasticsearchSink();
        emfSink.setHost(dslSink.getHost());
        emfSink.setPort(dslSink.getPort());
        emfSink.setIndex(dslSink.getIndex());
        emfSink.setUsername(dslSink.getUsername());
        emfSink.setPassword(dslSink.getPassword());
        return emfSink;
    }
    
    /**
     * Convertit une chaîne "true"/"false" en boolean
     */
    private boolean parseBoolean(String value) {
        return value != null && value.equalsIgnoreCase("true");
    }
    
    /**
     * Charge un fichier DSL et le transforme en modèle EMF
     */
    public static org.example.pipelinedefinition.PipelineDefinition transformFile(
            String dslFilePath, String outputXmiPath) throws Exception {
        
        // 1. CRITIQUE : Initialiser Xtext et récupérer l'Injector
        com.google.inject.Injector injector = new org.example.pipelinedsl.PipelineDSLStandaloneSetup()
            .createInjectorAndDoEMFRegistration();
        
        // 2. Créer le ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();
        
        // 3. Récupérer la ResourceFactory depuis l'Injector
        org.eclipse.xtext.resource.IResourceFactory resourceFactory = 
            injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
        
        resourceSet.getResourceFactoryRegistry()
            .getExtensionToFactoryMap()
            .put("pipelinedsl", resourceFactory);
        
        // 4. Créer l'URI correctement
        java.io.File file = new java.io.File(dslFilePath);
        if (!file.exists()) {
            throw new Exception("Fichier introuvable : " + dslFilePath);
        }
        
        URI dslUri = URI.createFileURI(file.getAbsolutePath());
        
        // 5. Charger le fichier DSL
        Resource dslResource;
        try {
            dslResource = resourceSet.getResource(dslUri, true);
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("SAXParseException")) {
                throw new Exception(
                    "ERREUR CRITIQUE : Xtext n'est pas enregistré correctement.\n" +
                    "Vérifiez que votre classe de setup Xtext existe et est valide.",
                    e
                );
            }
            throw e;
        }
        
        // 6. Vérifier les erreurs de parsing Xtext
        if (!dslResource.getErrors().isEmpty()) {
            StringBuilder errors = new StringBuilder();
            for (org.eclipse.emf.ecore.resource.Resource.Diagnostic error : dslResource.getErrors()) {
                errors.append("- ").append(error.getMessage()).append("\n");
            }
            throw new Exception("Erreurs de parsing DSL :\n" + errors.toString());
        }
        
        // 7. Vérifier que le modèle n'est pas vide
        if (dslResource.getContents().isEmpty()) {
            throw new Exception("Le fichier DSL est vide");
        }
        
        // 8. Récupérer et transformer le modèle
        org.example.pipelinedsl.pipelineDSL.PipelineDefinition dslModel = 
            (org.example.pipelinedsl.pipelineDSL.PipelineDefinition) dslResource.getContents().get(0);
        
        DSL2EMFTransformer transformer = new DSL2EMFTransformer();
        org.example.pipelinedefinition.PipelineDefinition emfModel = 
            transformer.transform(dslModel);
        
        // 9. Sauvegarder en XMI
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        
        Resource emfResource = resourceSet.createResource(
            URI.createFileURI(new java.io.File(outputXmiPath).getAbsolutePath()));
        emfResource.getContents().add(emfModel);
        emfResource.save(null);
        
        System.out.println("✅ Transformation réussie : " + outputXmiPath);
        System.out.println("   Fichier DSL : " + dslFilePath);
        System.out.println("   Fichier XMI : " + outputXmiPath);
        System.out.println("   Pipelines   : " + emfModel.getPipelines().size());
        
        return emfModel;
    }
}