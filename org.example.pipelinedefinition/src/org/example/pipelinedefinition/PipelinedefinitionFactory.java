/**
 */
package org.example.pipelinedefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage
 * @generated
 */
public interface PipelinedefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinedefinitionFactory eINSTANCE = org.example.pipelinedefinition.impl.PipelinedefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline Definition</em>'.
	 * @generated
	 */
	PipelineDefinition createPipelineDefinition();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Postgre SQL Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postgre SQL Source</em>'.
	 * @generated
	 */
	PostgreSQLSource createPostgreSQLSource();

	/**
	 * Returns a new object of class '<em>Mongo DB Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongo DB Source</em>'.
	 * @generated
	 */
	MongoDBSource createMongoDBSource();

	/**
	 * Returns a new object of class '<em>Rest API Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest API Source</em>'.
	 * @generated
	 */
	RestAPISource createRestAPISource();

	/**
	 * Returns a new object of class '<em>Clean Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clean Transform</em>'.
	 * @generated
	 */
	CleanTransform createCleanTransform();

	/**
	 * Returns a new object of class '<em>Filter Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Transform</em>'.
	 * @generated
	 */
	FilterTransform createFilterTransform();

	/**
	 * Returns a new object of class '<em>Aggregate Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Transform</em>'.
	 * @generated
	 */
	AggregateTransform createAggregateTransform();

	/**
	 * Returns a new object of class '<em>Data Warehouse Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Warehouse Sink</em>'.
	 * @generated
	 */
	DataWarehouseSink createDataWarehouseSink();

	/**
	 * Returns a new object of class '<em>Elasticsearch Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elasticsearch Sink</em>'.
	 * @generated
	 */
	ElasticsearchSink createElasticsearchSink();

	/**
	 * Returns a new object of class '<em>CSV Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV Sink</em>'.
	 * @generated
	 */
	CSVSink createCSVSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PipelinedefinitionPackage getPipelinedefinitionPackage();

} //PipelinedefinitionFactory
