/**
 */
package org.example.pipelinedefinition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.pipelinedefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage
 * @generated
 */
public class PipelinedefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipelinedefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelinedefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = PipelinedefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PipelinedefinitionPackage.PIPELINE_DEFINITION: {
				PipelineDefinition pipelineDefinition = (PipelineDefinition)theEObject;
				T result = casePipelineDefinition(pipelineDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.PIPELINE: {
				Pipeline pipeline = (Pipeline)theEObject;
				T result = casePipeline(pipeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.POSTGRE_SQL_SOURCE: {
				PostgreSQLSource postgreSQLSource = (PostgreSQLSource)theEObject;
				T result = casePostgreSQLSource(postgreSQLSource);
				if (result == null) result = caseDataSource(postgreSQLSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.MONGO_DB_SOURCE: {
				MongoDBSource mongoDBSource = (MongoDBSource)theEObject;
				T result = caseMongoDBSource(mongoDBSource);
				if (result == null) result = caseDataSource(mongoDBSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.REST_API_SOURCE: {
				RestAPISource restAPISource = (RestAPISource)theEObject;
				T result = caseRestAPISource(restAPISource);
				if (result == null) result = caseDataSource(restAPISource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.CLEAN_TRANSFORM: {
				CleanTransform cleanTransform = (CleanTransform)theEObject;
				T result = caseCleanTransform(cleanTransform);
				if (result == null) result = caseTransformation(cleanTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.FILTER_TRANSFORM: {
				FilterTransform filterTransform = (FilterTransform)theEObject;
				T result = caseFilterTransform(filterTransform);
				if (result == null) result = caseTransformation(filterTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM: {
				AggregateTransform aggregateTransform = (AggregateTransform)theEObject;
				T result = caseAggregateTransform(aggregateTransform);
				if (result == null) result = caseTransformation(aggregateTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.DATA_SINK: {
				DataSink dataSink = (DataSink)theEObject;
				T result = caseDataSink(dataSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.DATA_WAREHOUSE_SINK: {
				DataWarehouseSink dataWarehouseSink = (DataWarehouseSink)theEObject;
				T result = caseDataWarehouseSink(dataWarehouseSink);
				if (result == null) result = caseDataSink(dataWarehouseSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.ELASTICSEARCH_SINK: {
				ElasticsearchSink elasticsearchSink = (ElasticsearchSink)theEObject;
				T result = caseElasticsearchSink(elasticsearchSink);
				if (result == null) result = caseDataSink(elasticsearchSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinedefinitionPackage.CSV_SINK: {
				CSVSink csvSink = (CSVSink)theEObject;
				T result = caseCSVSink(csvSink);
				if (result == null) result = caseDataSink(csvSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipelineDefinition(PipelineDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postgre SQL Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postgre SQL Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostgreSQLSource(PostgreSQLSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo DB Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo DB Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoDBSource(MongoDBSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest API Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest API Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestAPISource(RestAPISource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clean Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clean Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleanTransform(CleanTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterTransform(FilterTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateTransform(AggregateTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSink(DataSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Warehouse Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Warehouse Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataWarehouseSink(DataWarehouseSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elasticsearch Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elasticsearch Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticsearchSink(ElasticsearchSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSV Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSV Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSVSink(CSVSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PipelinedefinitionSwitch
