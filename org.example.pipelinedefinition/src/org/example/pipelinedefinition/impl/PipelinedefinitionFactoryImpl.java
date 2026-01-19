/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.pipelinedefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelinedefinitionFactoryImpl extends EFactoryImpl implements PipelinedefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PipelinedefinitionFactory init() {
		try {
			PipelinedefinitionFactory thePipelinedefinitionFactory = (PipelinedefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(PipelinedefinitionPackage.eNS_URI);
			if (thePipelinedefinitionFactory != null) {
				return thePipelinedefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PipelinedefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelinedefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PipelinedefinitionPackage.PIPELINE_DEFINITION: return createPipelineDefinition();
			case PipelinedefinitionPackage.PIPELINE: return createPipeline();
			case PipelinedefinitionPackage.POSTGRE_SQL_SOURCE: return createPostgreSQLSource();
			case PipelinedefinitionPackage.MONGO_DB_SOURCE: return createMongoDBSource();
			case PipelinedefinitionPackage.REST_API_SOURCE: return createRestAPISource();
			case PipelinedefinitionPackage.CLEAN_TRANSFORM: return createCleanTransform();
			case PipelinedefinitionPackage.FILTER_TRANSFORM: return createFilterTransform();
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM: return createAggregateTransform();
			case PipelinedefinitionPackage.DATA_WAREHOUSE_SINK: return createDataWarehouseSink();
			case PipelinedefinitionPackage.ELASTICSEARCH_SINK: return createElasticsearchSink();
			case PipelinedefinitionPackage.CSV_SINK: return createCSVSink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition createPipelineDefinition() {
		PipelineDefinitionImpl pipelineDefinition = new PipelineDefinitionImpl();
		return pipelineDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostgreSQLSource createPostgreSQLSource() {
		PostgreSQLSourceImpl postgreSQLSource = new PostgreSQLSourceImpl();
		return postgreSQLSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MongoDBSource createMongoDBSource() {
		MongoDBSourceImpl mongoDBSource = new MongoDBSourceImpl();
		return mongoDBSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestAPISource createRestAPISource() {
		RestAPISourceImpl restAPISource = new RestAPISourceImpl();
		return restAPISource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CleanTransform createCleanTransform() {
		CleanTransformImpl cleanTransform = new CleanTransformImpl();
		return cleanTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterTransform createFilterTransform() {
		FilterTransformImpl filterTransform = new FilterTransformImpl();
		return filterTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateTransform createAggregateTransform() {
		AggregateTransformImpl aggregateTransform = new AggregateTransformImpl();
		return aggregateTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataWarehouseSink createDataWarehouseSink() {
		DataWarehouseSinkImpl dataWarehouseSink = new DataWarehouseSinkImpl();
		return dataWarehouseSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElasticsearchSink createElasticsearchSink() {
		ElasticsearchSinkImpl elasticsearchSink = new ElasticsearchSinkImpl();
		return elasticsearchSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSVSink createCSVSink() {
		CSVSinkImpl csvSink = new CSVSinkImpl();
		return csvSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelinedefinitionPackage getPipelinedefinitionPackage() {
		return (PipelinedefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PipelinedefinitionPackage getPackage() {
		return PipelinedefinitionPackage.eINSTANCE;
	}

} //PipelinedefinitionFactoryImpl
