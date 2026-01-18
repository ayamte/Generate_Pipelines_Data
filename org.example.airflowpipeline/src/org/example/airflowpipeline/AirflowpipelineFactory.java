/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.airflowpipeline.AirflowpipelinePackage
 * @generated
 */
public interface AirflowpipelineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirflowpipelineFactory eINSTANCE = org.example.airflowpipeline.impl.AirflowpipelineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DAG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAG</em>'.
	 * @generated
	 */
	DAG createDAG();

	/**
	 * Returns a new object of class '<em>Python Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Python Operator</em>'.
	 * @generated
	 */
	PythonOperator createPythonOperator();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Task Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Dependency</em>'.
	 * @generated
	 */
	TaskDependency createTaskDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AirflowpipelinePackage getAirflowpipelinePackage();

} //AirflowpipelineFactory
