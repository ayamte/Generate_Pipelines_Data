/**
 */
package org.example.pipelinedefinition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.pipelinedefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage
 * @generated
 */
public class PipelinedefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipelinedefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelinedefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PipelinedefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelinedefinitionSwitch<Adapter> modelSwitch =
		new PipelinedefinitionSwitch<Adapter>() {
			@Override
			public Adapter casePipelineDefinition(PipelineDefinition object) {
				return createPipelineDefinitionAdapter();
			}
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter casePostgreSQLSource(PostgreSQLSource object) {
				return createPostgreSQLSourceAdapter();
			}
			@Override
			public Adapter caseMongoDBSource(MongoDBSource object) {
				return createMongoDBSourceAdapter();
			}
			@Override
			public Adapter caseRestAPISource(RestAPISource object) {
				return createRestAPISourceAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseCleanTransform(CleanTransform object) {
				return createCleanTransformAdapter();
			}
			@Override
			public Adapter caseFilterTransform(FilterTransform object) {
				return createFilterTransformAdapter();
			}
			@Override
			public Adapter caseAggregateTransform(AggregateTransform object) {
				return createAggregateTransformAdapter();
			}
			@Override
			public Adapter caseDataSink(DataSink object) {
				return createDataSinkAdapter();
			}
			@Override
			public Adapter caseDataWarehouseSink(DataWarehouseSink object) {
				return createDataWarehouseSinkAdapter();
			}
			@Override
			public Adapter caseElasticsearchSink(ElasticsearchSink object) {
				return createElasticsearchSinkAdapter();
			}
			@Override
			public Adapter caseCSVSink(CSVSink object) {
				return createCSVSinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.PipelineDefinition <em>Pipeline Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.PipelineDefinition
	 * @generated
	 */
	public Adapter createPipelineDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.PostgreSQLSource <em>Postgre SQL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.PostgreSQLSource
	 * @generated
	 */
	public Adapter createPostgreSQLSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.MongoDBSource <em>Mongo DB Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.MongoDBSource
	 * @generated
	 */
	public Adapter createMongoDBSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.RestAPISource <em>Rest API Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.RestAPISource
	 * @generated
	 */
	public Adapter createRestAPISourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.CleanTransform <em>Clean Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.CleanTransform
	 * @generated
	 */
	public Adapter createCleanTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.FilterTransform <em>Filter Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.FilterTransform
	 * @generated
	 */
	public Adapter createFilterTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.AggregateTransform <em>Aggregate Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.AggregateTransform
	 * @generated
	 */
	public Adapter createAggregateTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.DataSink
	 * @generated
	 */
	public Adapter createDataSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.DataWarehouseSink <em>Data Warehouse Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.DataWarehouseSink
	 * @generated
	 */
	public Adapter createDataWarehouseSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.ElasticsearchSink <em>Elasticsearch Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.ElasticsearchSink
	 * @generated
	 */
	public Adapter createElasticsearchSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.pipelinedefinition.CSVSink <em>CSV Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.pipelinedefinition.CSVSink
	 * @generated
	 */
	public Adapter createCSVSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PipelinedefinitionAdapterFactory
