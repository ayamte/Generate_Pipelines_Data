/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.example.pipelinedefinition.AggregateTransform;
import org.example.pipelinedefinition.CSVSink;
import org.example.pipelinedefinition.CleanTransform;
import org.example.pipelinedefinition.DataSink;
import org.example.pipelinedefinition.DataSource;
import org.example.pipelinedefinition.DataWarehouseSink;
import org.example.pipelinedefinition.ElasticsearchSink;
import org.example.pipelinedefinition.FilterTransform;
import org.example.pipelinedefinition.MongoDBSource;
import org.example.pipelinedefinition.Pipeline;
import org.example.pipelinedefinition.PipelineDefinition;
import org.example.pipelinedefinition.PipelinedefinitionFactory;
import org.example.pipelinedefinition.PipelinedefinitionPackage;
import org.example.pipelinedefinition.PostgreSQLSource;
import org.example.pipelinedefinition.RestAPISource;
import org.example.pipelinedefinition.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelinedefinitionPackageImpl extends EPackageImpl implements PipelinedefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postgreSQLSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoDBSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restAPISourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleanTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWarehouseSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticsearchSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvSinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PipelinedefinitionPackageImpl() {
		super(eNS_URI, PipelinedefinitionFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PipelinedefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PipelinedefinitionPackage init() {
		if (isInited) return (PipelinedefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(PipelinedefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPipelinedefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PipelinedefinitionPackageImpl thePipelinedefinitionPackage = registeredPipelinedefinitionPackage instanceof PipelinedefinitionPackageImpl ? (PipelinedefinitionPackageImpl)registeredPipelinedefinitionPackage : new PipelinedefinitionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePipelinedefinitionPackage.createPackageContents();

		// Initialize created meta-data
		thePipelinedefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePipelinedefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PipelinedefinitionPackage.eNS_URI, thePipelinedefinitionPackage);
		return thePipelinedefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipelineDefinition() {
		return pipelineDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineDefinition_Pipelines() {
		return (EReference)pipelineDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Name() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Description() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Schedule() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Source() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Transformations() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Sink() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostgreSQLSource() {
		return postgreSQLSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Host() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Port() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Database() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Table() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Username() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostgreSQLSource_Password() {
		return (EAttribute)postgreSQLSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMongoDBSource() {
		return mongoDBSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Host() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Port() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Database() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Collection() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Username() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMongoDBSource_Password() {
		return (EAttribute)mongoDBSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestAPISource() {
		return restAPISourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestAPISource_Url() {
		return (EAttribute)restAPISourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestAPISource_Method() {
		return (EAttribute)restAPISourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestAPISource_ApiKey() {
		return (EAttribute)restAPISourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestAPISource_Headers() {
		return (EAttribute)restAPISourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransformation_Description() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCleanTransform() {
		return cleanTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCleanTransform_RemoveNulls() {
		return (EAttribute)cleanTransformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCleanTransform_Trim() {
		return (EAttribute)cleanTransformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCleanTransform_Deduplicate() {
		return (EAttribute)cleanTransformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterTransform() {
		return filterTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterTransform_Condition() {
		return (EAttribute)filterTransformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregateTransform() {
		return aggregateTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregateTransform_GroupBy() {
		return (EAttribute)aggregateTransformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregateTransform_Aggregation() {
		return (EAttribute)aggregateTransformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSink() {
		return dataSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataWarehouseSink() {
		return dataWarehouseSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Host() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Port() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Database() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Table() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Username() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataWarehouseSink_Password() {
		return (EAttribute)dataWarehouseSinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElasticsearchSink() {
		return elasticsearchSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElasticsearchSink_Host() {
		return (EAttribute)elasticsearchSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElasticsearchSink_Port() {
		return (EAttribute)elasticsearchSinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElasticsearchSink_Index() {
		return (EAttribute)elasticsearchSinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElasticsearchSink_Username() {
		return (EAttribute)elasticsearchSinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElasticsearchSink_Password() {
		return (EAttribute)elasticsearchSinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSVSink() {
		return csvSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSVSink_FilePath() {
		return (EAttribute)csvSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSVSink_Separator() {
		return (EAttribute)csvSinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSVSink_IncludeHeader() {
		return (EAttribute)csvSinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelinedefinitionFactory getPipelinedefinitionFactory() {
		return (PipelinedefinitionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pipelineDefinitionEClass = createEClass(PIPELINE_DEFINITION);
		createEReference(pipelineDefinitionEClass, PIPELINE_DEFINITION__PIPELINES);

		pipelineEClass = createEClass(PIPELINE);
		createEAttribute(pipelineEClass, PIPELINE__NAME);
		createEAttribute(pipelineEClass, PIPELINE__DESCRIPTION);
		createEAttribute(pipelineEClass, PIPELINE__SCHEDULE);
		createEReference(pipelineEClass, PIPELINE__SOURCE);
		createEReference(pipelineEClass, PIPELINE__TRANSFORMATIONS);
		createEReference(pipelineEClass, PIPELINE__SINK);

		dataSourceEClass = createEClass(DATA_SOURCE);

		postgreSQLSourceEClass = createEClass(POSTGRE_SQL_SOURCE);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__HOST);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__PORT);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__DATABASE);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__TABLE);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__USERNAME);
		createEAttribute(postgreSQLSourceEClass, POSTGRE_SQL_SOURCE__PASSWORD);

		mongoDBSourceEClass = createEClass(MONGO_DB_SOURCE);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__HOST);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__PORT);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__DATABASE);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__COLLECTION);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__USERNAME);
		createEAttribute(mongoDBSourceEClass, MONGO_DB_SOURCE__PASSWORD);

		restAPISourceEClass = createEClass(REST_API_SOURCE);
		createEAttribute(restAPISourceEClass, REST_API_SOURCE__URL);
		createEAttribute(restAPISourceEClass, REST_API_SOURCE__METHOD);
		createEAttribute(restAPISourceEClass, REST_API_SOURCE__API_KEY);
		createEAttribute(restAPISourceEClass, REST_API_SOURCE__HEADERS);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__DESCRIPTION);

		cleanTransformEClass = createEClass(CLEAN_TRANSFORM);
		createEAttribute(cleanTransformEClass, CLEAN_TRANSFORM__REMOVE_NULLS);
		createEAttribute(cleanTransformEClass, CLEAN_TRANSFORM__TRIM);
		createEAttribute(cleanTransformEClass, CLEAN_TRANSFORM__DEDUPLICATE);

		filterTransformEClass = createEClass(FILTER_TRANSFORM);
		createEAttribute(filterTransformEClass, FILTER_TRANSFORM__CONDITION);

		aggregateTransformEClass = createEClass(AGGREGATE_TRANSFORM);
		createEAttribute(aggregateTransformEClass, AGGREGATE_TRANSFORM__GROUP_BY);
		createEAttribute(aggregateTransformEClass, AGGREGATE_TRANSFORM__AGGREGATION);

		dataSinkEClass = createEClass(DATA_SINK);

		dataWarehouseSinkEClass = createEClass(DATA_WAREHOUSE_SINK);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__HOST);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__PORT);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__DATABASE);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__TABLE);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__USERNAME);
		createEAttribute(dataWarehouseSinkEClass, DATA_WAREHOUSE_SINK__PASSWORD);

		elasticsearchSinkEClass = createEClass(ELASTICSEARCH_SINK);
		createEAttribute(elasticsearchSinkEClass, ELASTICSEARCH_SINK__HOST);
		createEAttribute(elasticsearchSinkEClass, ELASTICSEARCH_SINK__PORT);
		createEAttribute(elasticsearchSinkEClass, ELASTICSEARCH_SINK__INDEX);
		createEAttribute(elasticsearchSinkEClass, ELASTICSEARCH_SINK__USERNAME);
		createEAttribute(elasticsearchSinkEClass, ELASTICSEARCH_SINK__PASSWORD);

		csvSinkEClass = createEClass(CSV_SINK);
		createEAttribute(csvSinkEClass, CSV_SINK__FILE_PATH);
		createEAttribute(csvSinkEClass, CSV_SINK__SEPARATOR);
		createEAttribute(csvSinkEClass, CSV_SINK__INCLUDE_HEADER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		postgreSQLSourceEClass.getESuperTypes().add(this.getDataSource());
		mongoDBSourceEClass.getESuperTypes().add(this.getDataSource());
		restAPISourceEClass.getESuperTypes().add(this.getDataSource());
		cleanTransformEClass.getESuperTypes().add(this.getTransformation());
		filterTransformEClass.getESuperTypes().add(this.getTransformation());
		aggregateTransformEClass.getESuperTypes().add(this.getTransformation());
		dataWarehouseSinkEClass.getESuperTypes().add(this.getDataSink());
		elasticsearchSinkEClass.getESuperTypes().add(this.getDataSink());
		csvSinkEClass.getESuperTypes().add(this.getDataSink());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineDefinitionEClass, PipelineDefinition.class, "PipelineDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipelineDefinition_Pipelines(), this.getPipeline(), null, "pipelines", null, 0, -1, PipelineDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipeline_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Description(), ecorePackage.getEString(), "description", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Schedule(), ecorePackage.getEString(), "schedule", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Source(), this.getDataSource(), null, "source", null, 1, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Transformations(), this.getTransformation(), null, "transformations", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Sink(), this.getDataSink(), null, "sink", null, 1, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postgreSQLSourceEClass, PostgreSQLSource.class, "PostgreSQLSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostgreSQLSource_Host(), ecorePackage.getEString(), "host", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLSource_Port(), ecorePackage.getEInt(), "port", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLSource_Database(), ecorePackage.getEString(), "database", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLSource_Table(), ecorePackage.getEString(), "table", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLSource_Username(), ecorePackage.getEString(), "username", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostgreSQLSource_Password(), ecorePackage.getEString(), "password", null, 0, 1, PostgreSQLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mongoDBSourceEClass, MongoDBSource.class, "MongoDBSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMongoDBSource_Host(), ecorePackage.getEString(), "host", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDBSource_Port(), ecorePackage.getEInt(), "port", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDBSource_Database(), ecorePackage.getEString(), "database", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDBSource_Collection(), ecorePackage.getEString(), "collection", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDBSource_Username(), ecorePackage.getEString(), "username", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDBSource_Password(), ecorePackage.getEString(), "password", null, 0, 1, MongoDBSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restAPISourceEClass, RestAPISource.class, "RestAPISource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestAPISource_Url(), ecorePackage.getEString(), "url", null, 0, 1, RestAPISource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestAPISource_Method(), ecorePackage.getEString(), "method", null, 0, 1, RestAPISource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestAPISource_ApiKey(), ecorePackage.getEString(), "apiKey", null, 0, 1, RestAPISource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestAPISource_Headers(), ecorePackage.getEString(), "headers", null, 0, 1, RestAPISource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cleanTransformEClass, CleanTransform.class, "CleanTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCleanTransform_RemoveNulls(), ecorePackage.getEBoolean(), "removeNulls", null, 0, 1, CleanTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCleanTransform_Trim(), ecorePackage.getEBoolean(), "trim", null, 0, 1, CleanTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCleanTransform_Deduplicate(), ecorePackage.getEBoolean(), "deduplicate", null, 0, 1, CleanTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTransformEClass, FilterTransform.class, "FilterTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterTransform_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, FilterTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateTransformEClass, AggregateTransform.class, "AggregateTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregateTransform_GroupBy(), ecorePackage.getEString(), "groupBy", null, 0, 1, AggregateTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregateTransform_Aggregation(), ecorePackage.getEString(), "aggregation", null, 0, 1, AggregateTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSinkEClass, DataSink.class, "DataSink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataWarehouseSinkEClass, DataWarehouseSink.class, "DataWarehouseSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataWarehouseSink_Host(), ecorePackage.getEString(), "host", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWarehouseSink_Port(), ecorePackage.getEInt(), "port", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWarehouseSink_Database(), ecorePackage.getEString(), "database", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWarehouseSink_Table(), ecorePackage.getEString(), "table", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWarehouseSink_Username(), ecorePackage.getEString(), "username", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWarehouseSink_Password(), ecorePackage.getEString(), "password", null, 0, 1, DataWarehouseSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elasticsearchSinkEClass, ElasticsearchSink.class, "ElasticsearchSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElasticsearchSink_Host(), ecorePackage.getEString(), "host", null, 0, 1, ElasticsearchSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticsearchSink_Port(), ecorePackage.getEInt(), "port", null, 0, 1, ElasticsearchSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticsearchSink_Index(), ecorePackage.getEString(), "index", null, 0, 1, ElasticsearchSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticsearchSink_Username(), ecorePackage.getEString(), "username", null, 0, 1, ElasticsearchSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticsearchSink_Password(), ecorePackage.getEString(), "password", null, 0, 1, ElasticsearchSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvSinkEClass, CSVSink.class, "CSVSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSVSink_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, CSVSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVSink_Separator(), ecorePackage.getEString(), "separator", null, 0, 1, CSVSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSVSink_IncludeHeader(), ecorePackage.getEBoolean(), "includeHeader", null, 0, 1, CSVSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PipelinedefinitionPackageImpl
