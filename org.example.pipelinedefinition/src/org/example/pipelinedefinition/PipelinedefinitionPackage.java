/**
 */
package org.example.pipelinedefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.pipelinedefinition.PipelinedefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface PipelinedefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipelinedefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pipelinedefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pipelinedefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinedefinitionPackage eINSTANCE = org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.PipelineDefinitionImpl <em>Pipeline Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.PipelineDefinitionImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPipelineDefinition()
	 * @generated
	 */
	int PIPELINE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Pipelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__PIPELINES = 0;

	/**
	 * The number of structural features of the '<em>Pipeline Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pipeline Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.PipelineImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRANSFORMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SINK = 5;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.DataSourceImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.PostgreSQLSourceImpl <em>Postgre SQL Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.PostgreSQLSourceImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPostgreSQLSource()
	 * @generated
	 */
	int POSTGRE_SQL_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__HOST = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__PORT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__DATABASE = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__TABLE = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__USERNAME = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE__PASSWORD = DATA_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Postgre SQL Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Postgre SQL Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRE_SQL_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.MongoDBSourceImpl <em>Mongo DB Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.MongoDBSourceImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getMongoDBSource()
	 * @generated
	 */
	int MONGO_DB_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__HOST = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__PORT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__DATABASE = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__COLLECTION = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__USERNAME = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE__PASSWORD = DATA_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mongo DB Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Mongo DB Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.RestAPISourceImpl <em>Rest API Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.RestAPISourceImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getRestAPISource()
	 * @generated
	 */
	int REST_API_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE__URL = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE__METHOD = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE__API_KEY = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE__HEADERS = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rest API Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rest API Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_API_SOURCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.TransformationImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.CleanTransformImpl <em>Clean Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.CleanTransformImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getCleanTransform()
	 * @generated
	 */
	int CLEAN_TRANSFORM = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Remove Nulls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM__REMOVE_NULLS = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM__TRIM = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deduplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM__DEDUPLICATE = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clean Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clean Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAN_TRANSFORM_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.FilterTransformImpl <em>Filter Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.FilterTransformImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getFilterTransform()
	 * @generated
	 */
	int FILTER_TRANSFORM = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TRANSFORM__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TRANSFORM__CONDITION = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TRANSFORM_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TRANSFORM_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.AggregateTransformImpl <em>Aggregate Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.AggregateTransformImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getAggregateTransform()
	 * @generated
	 */
	int AGGREGATE_TRANSFORM = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TRANSFORM__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TRANSFORM__GROUP_BY = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TRANSFORM__AGGREGATION = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TRANSFORM_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregate Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TRANSFORM_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.DataSinkImpl <em>Data Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.DataSinkImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataSink()
	 * @generated
	 */
	int DATA_SINK = 10;

	/**
	 * The number of structural features of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.DataWarehouseSinkImpl <em>Data Warehouse Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.DataWarehouseSinkImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataWarehouseSink()
	 * @generated
	 */
	int DATA_WAREHOUSE_SINK = 11;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__HOST = DATA_SINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__PORT = DATA_SINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__DATABASE = DATA_SINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__TABLE = DATA_SINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__USERNAME = DATA_SINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK__PASSWORD = DATA_SINK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Warehouse Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK_FEATURE_COUNT = DATA_SINK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Data Warehouse Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WAREHOUSE_SINK_OPERATION_COUNT = DATA_SINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.ElasticsearchSinkImpl <em>Elasticsearch Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.ElasticsearchSinkImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getElasticsearchSink()
	 * @generated
	 */
	int ELASTICSEARCH_SINK = 12;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK__HOST = DATA_SINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK__PORT = DATA_SINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK__INDEX = DATA_SINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK__USERNAME = DATA_SINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK__PASSWORD = DATA_SINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Elasticsearch Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK_FEATURE_COUNT = DATA_SINK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Elasticsearch Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICSEARCH_SINK_OPERATION_COUNT = DATA_SINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.pipelinedefinition.impl.CSVSinkImpl <em>CSV Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.pipelinedefinition.impl.CSVSinkImpl
	 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getCSVSink()
	 * @generated
	 */
	int CSV_SINK = 13;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_SINK__FILE_PATH = DATA_SINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_SINK__SEPARATOR = DATA_SINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_SINK__INCLUDE_HEADER = DATA_SINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSV Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_SINK_FEATURE_COUNT = DATA_SINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CSV Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_SINK_OPERATION_COUNT = DATA_SINK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.PipelineDefinition <em>Pipeline Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline Definition</em>'.
	 * @see org.example.pipelinedefinition.PipelineDefinition
	 * @generated
	 */
	EClass getPipelineDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.pipelinedefinition.PipelineDefinition#getPipelines <em>Pipelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipelines</em>'.
	 * @see org.example.pipelinedefinition.PipelineDefinition#getPipelines()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EReference getPipelineDefinition_Pipelines();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see org.example.pipelinedefinition.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.Pipeline#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getDescription()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.Pipeline#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getSchedule()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Schedule();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.pipelinedefinition.Pipeline#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getSource()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.pipelinedefinition.Pipeline#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getTransformations()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Transformations();

	/**
	 * Returns the meta object for the containment reference '{@link org.example.pipelinedefinition.Pipeline#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see org.example.pipelinedefinition.Pipeline#getSink()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Sink();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.example.pipelinedefinition.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.PostgreSQLSource <em>Postgre SQL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgre SQL Source</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource
	 * @generated
	 */
	EClass getPostgreSQLSource();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getHost()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getPort()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getDatabase()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Database();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getTable()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getUsername()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.PostgreSQLSource#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.example.pipelinedefinition.PostgreSQLSource#getPassword()
	 * @see #getPostgreSQLSource()
	 * @generated
	 */
	EAttribute getPostgreSQLSource_Password();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.MongoDBSource <em>Mongo DB Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo DB Source</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource
	 * @generated
	 */
	EClass getMongoDBSource();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getHost()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getPort()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getDatabase()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Database();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getCollection()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getUsername()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.MongoDBSource#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.example.pipelinedefinition.MongoDBSource#getPassword()
	 * @see #getMongoDBSource()
	 * @generated
	 */
	EAttribute getMongoDBSource_Password();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.RestAPISource <em>Rest API Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest API Source</em>'.
	 * @see org.example.pipelinedefinition.RestAPISource
	 * @generated
	 */
	EClass getRestAPISource();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.RestAPISource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.example.pipelinedefinition.RestAPISource#getUrl()
	 * @see #getRestAPISource()
	 * @generated
	 */
	EAttribute getRestAPISource_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.RestAPISource#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.example.pipelinedefinition.RestAPISource#getMethod()
	 * @see #getRestAPISource()
	 * @generated
	 */
	EAttribute getRestAPISource_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.RestAPISource#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.example.pipelinedefinition.RestAPISource#getApiKey()
	 * @see #getRestAPISource()
	 * @generated
	 */
	EAttribute getRestAPISource_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.RestAPISource#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.example.pipelinedefinition.RestAPISource#getHeaders()
	 * @see #getRestAPISource()
	 * @generated
	 */
	EAttribute getRestAPISource_Headers();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.example.pipelinedefinition.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.Transformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.example.pipelinedefinition.Transformation#getDescription()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Description();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.CleanTransform <em>Clean Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clean Transform</em>'.
	 * @see org.example.pipelinedefinition.CleanTransform
	 * @generated
	 */
	EClass getCleanTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CleanTransform#isRemoveNulls <em>Remove Nulls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Nulls</em>'.
	 * @see org.example.pipelinedefinition.CleanTransform#isRemoveNulls()
	 * @see #getCleanTransform()
	 * @generated
	 */
	EAttribute getCleanTransform_RemoveNulls();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CleanTransform#isTrim <em>Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trim</em>'.
	 * @see org.example.pipelinedefinition.CleanTransform#isTrim()
	 * @see #getCleanTransform()
	 * @generated
	 */
	EAttribute getCleanTransform_Trim();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CleanTransform#isDeduplicate <em>Deduplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduplicate</em>'.
	 * @see org.example.pipelinedefinition.CleanTransform#isDeduplicate()
	 * @see #getCleanTransform()
	 * @generated
	 */
	EAttribute getCleanTransform_Deduplicate();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.FilterTransform <em>Filter Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Transform</em>'.
	 * @see org.example.pipelinedefinition.FilterTransform
	 * @generated
	 */
	EClass getFilterTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.FilterTransform#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.example.pipelinedefinition.FilterTransform#getCondition()
	 * @see #getFilterTransform()
	 * @generated
	 */
	EAttribute getFilterTransform_Condition();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.AggregateTransform <em>Aggregate Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Transform</em>'.
	 * @see org.example.pipelinedefinition.AggregateTransform
	 * @generated
	 */
	EClass getAggregateTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.AggregateTransform#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group By</em>'.
	 * @see org.example.pipelinedefinition.AggregateTransform#getGroupBy()
	 * @see #getAggregateTransform()
	 * @generated
	 */
	EAttribute getAggregateTransform_GroupBy();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.AggregateTransform#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.example.pipelinedefinition.AggregateTransform#getAggregation()
	 * @see #getAggregateTransform()
	 * @generated
	 */
	EAttribute getAggregateTransform_Aggregation();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sink</em>'.
	 * @see org.example.pipelinedefinition.DataSink
	 * @generated
	 */
	EClass getDataSink();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.DataWarehouseSink <em>Data Warehouse Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Warehouse Sink</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink
	 * @generated
	 */
	EClass getDataWarehouseSink();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getHost()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getPort()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getDatabase()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Database();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getTable()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getUsername()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.DataWarehouseSink#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.example.pipelinedefinition.DataWarehouseSink#getPassword()
	 * @see #getDataWarehouseSink()
	 * @generated
	 */
	EAttribute getDataWarehouseSink_Password();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.ElasticsearchSink <em>Elasticsearch Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticsearch Sink</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink
	 * @generated
	 */
	EClass getElasticsearchSink();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.ElasticsearchSink#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink#getHost()
	 * @see #getElasticsearchSink()
	 * @generated
	 */
	EAttribute getElasticsearchSink_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.ElasticsearchSink#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink#getPort()
	 * @see #getElasticsearchSink()
	 * @generated
	 */
	EAttribute getElasticsearchSink_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.ElasticsearchSink#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink#getIndex()
	 * @see #getElasticsearchSink()
	 * @generated
	 */
	EAttribute getElasticsearchSink_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.ElasticsearchSink#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink#getUsername()
	 * @see #getElasticsearchSink()
	 * @generated
	 */
	EAttribute getElasticsearchSink_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.ElasticsearchSink#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.example.pipelinedefinition.ElasticsearchSink#getPassword()
	 * @see #getElasticsearchSink()
	 * @generated
	 */
	EAttribute getElasticsearchSink_Password();

	/**
	 * Returns the meta object for class '{@link org.example.pipelinedefinition.CSVSink <em>CSV Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Sink</em>'.
	 * @see org.example.pipelinedefinition.CSVSink
	 * @generated
	 */
	EClass getCSVSink();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CSVSink#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see org.example.pipelinedefinition.CSVSink#getFilePath()
	 * @see #getCSVSink()
	 * @generated
	 */
	EAttribute getCSVSink_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CSVSink#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.example.pipelinedefinition.CSVSink#getSeparator()
	 * @see #getCSVSink()
	 * @generated
	 */
	EAttribute getCSVSink_Separator();

	/**
	 * Returns the meta object for the attribute '{@link org.example.pipelinedefinition.CSVSink#isIncludeHeader <em>Include Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Header</em>'.
	 * @see org.example.pipelinedefinition.CSVSink#isIncludeHeader()
	 * @see #getCSVSink()
	 * @generated
	 */
	EAttribute getCSVSink_IncludeHeader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelinedefinitionFactory getPipelinedefinitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.PipelineDefinitionImpl <em>Pipeline Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.PipelineDefinitionImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPipelineDefinition()
		 * @generated
		 */
		EClass PIPELINE_DEFINITION = eINSTANCE.getPipelineDefinition();

		/**
		 * The meta object literal for the '<em><b>Pipelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_DEFINITION__PIPELINES = eINSTANCE.getPipelineDefinition_Pipelines();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.PipelineImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__DESCRIPTION = eINSTANCE.getPipeline_Description();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__SCHEDULE = eINSTANCE.getPipeline_Schedule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SOURCE = eINSTANCE.getPipeline_Source();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRANSFORMATIONS = eINSTANCE.getPipeline_Transformations();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SINK = eINSTANCE.getPipeline_Sink();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.DataSourceImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.PostgreSQLSourceImpl <em>Postgre SQL Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.PostgreSQLSourceImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getPostgreSQLSource()
		 * @generated
		 */
		EClass POSTGRE_SQL_SOURCE = eINSTANCE.getPostgreSQLSource();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__HOST = eINSTANCE.getPostgreSQLSource_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__PORT = eINSTANCE.getPostgreSQLSource_Port();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__DATABASE = eINSTANCE.getPostgreSQLSource_Database();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__TABLE = eINSTANCE.getPostgreSQLSource_Table();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__USERNAME = eINSTANCE.getPostgreSQLSource_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRE_SQL_SOURCE__PASSWORD = eINSTANCE.getPostgreSQLSource_Password();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.MongoDBSourceImpl <em>Mongo DB Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.MongoDBSourceImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getMongoDBSource()
		 * @generated
		 */
		EClass MONGO_DB_SOURCE = eINSTANCE.getMongoDBSource();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__HOST = eINSTANCE.getMongoDBSource_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__PORT = eINSTANCE.getMongoDBSource_Port();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__DATABASE = eINSTANCE.getMongoDBSource_Database();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__COLLECTION = eINSTANCE.getMongoDBSource_Collection();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__USERNAME = eINSTANCE.getMongoDBSource_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SOURCE__PASSWORD = eINSTANCE.getMongoDBSource_Password();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.RestAPISourceImpl <em>Rest API Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.RestAPISourceImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getRestAPISource()
		 * @generated
		 */
		EClass REST_API_SOURCE = eINSTANCE.getRestAPISource();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_API_SOURCE__URL = eINSTANCE.getRestAPISource_Url();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_API_SOURCE__METHOD = eINSTANCE.getRestAPISource_Method();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_API_SOURCE__API_KEY = eINSTANCE.getRestAPISource_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_API_SOURCE__HEADERS = eINSTANCE.getRestAPISource_Headers();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.TransformationImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__DESCRIPTION = eINSTANCE.getTransformation_Description();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.CleanTransformImpl <em>Clean Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.CleanTransformImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getCleanTransform()
		 * @generated
		 */
		EClass CLEAN_TRANSFORM = eINSTANCE.getCleanTransform();

		/**
		 * The meta object literal for the '<em><b>Remove Nulls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAN_TRANSFORM__REMOVE_NULLS = eINSTANCE.getCleanTransform_RemoveNulls();

		/**
		 * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAN_TRANSFORM__TRIM = eINSTANCE.getCleanTransform_Trim();

		/**
		 * The meta object literal for the '<em><b>Deduplicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAN_TRANSFORM__DEDUPLICATE = eINSTANCE.getCleanTransform_Deduplicate();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.FilterTransformImpl <em>Filter Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.FilterTransformImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getFilterTransform()
		 * @generated
		 */
		EClass FILTER_TRANSFORM = eINSTANCE.getFilterTransform();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TRANSFORM__CONDITION = eINSTANCE.getFilterTransform_Condition();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.AggregateTransformImpl <em>Aggregate Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.AggregateTransformImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getAggregateTransform()
		 * @generated
		 */
		EClass AGGREGATE_TRANSFORM = eINSTANCE.getAggregateTransform();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_TRANSFORM__GROUP_BY = eINSTANCE.getAggregateTransform_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_TRANSFORM__AGGREGATION = eINSTANCE.getAggregateTransform_Aggregation();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.DataSinkImpl <em>Data Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.DataSinkImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataSink()
		 * @generated
		 */
		EClass DATA_SINK = eINSTANCE.getDataSink();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.DataWarehouseSinkImpl <em>Data Warehouse Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.DataWarehouseSinkImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getDataWarehouseSink()
		 * @generated
		 */
		EClass DATA_WAREHOUSE_SINK = eINSTANCE.getDataWarehouseSink();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__HOST = eINSTANCE.getDataWarehouseSink_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__PORT = eINSTANCE.getDataWarehouseSink_Port();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__DATABASE = eINSTANCE.getDataWarehouseSink_Database();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__TABLE = eINSTANCE.getDataWarehouseSink_Table();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__USERNAME = eINSTANCE.getDataWarehouseSink_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WAREHOUSE_SINK__PASSWORD = eINSTANCE.getDataWarehouseSink_Password();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.ElasticsearchSinkImpl <em>Elasticsearch Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.ElasticsearchSinkImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getElasticsearchSink()
		 * @generated
		 */
		EClass ELASTICSEARCH_SINK = eINSTANCE.getElasticsearchSink();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICSEARCH_SINK__HOST = eINSTANCE.getElasticsearchSink_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICSEARCH_SINK__PORT = eINSTANCE.getElasticsearchSink_Port();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICSEARCH_SINK__INDEX = eINSTANCE.getElasticsearchSink_Index();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICSEARCH_SINK__USERNAME = eINSTANCE.getElasticsearchSink_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICSEARCH_SINK__PASSWORD = eINSTANCE.getElasticsearchSink_Password();

		/**
		 * The meta object literal for the '{@link org.example.pipelinedefinition.impl.CSVSinkImpl <em>CSV Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.pipelinedefinition.impl.CSVSinkImpl
		 * @see org.example.pipelinedefinition.impl.PipelinedefinitionPackageImpl#getCSVSink()
		 * @generated
		 */
		EClass CSV_SINK = eINSTANCE.getCSVSink();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_SINK__FILE_PATH = eINSTANCE.getCSVSink_FilePath();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_SINK__SEPARATOR = eINSTANCE.getCSVSink_Separator();

		/**
		 * The meta object literal for the '<em><b>Include Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_SINK__INCLUDE_HEADER = eINSTANCE.getCSVSink_IncludeHeader();

	}

} //PipelinedefinitionPackage
