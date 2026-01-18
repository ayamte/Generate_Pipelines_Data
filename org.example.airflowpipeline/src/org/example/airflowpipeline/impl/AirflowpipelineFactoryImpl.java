/**
 */
package org.example.airflowpipeline.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.airflowpipeline.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirflowpipelineFactoryImpl extends EFactoryImpl implements AirflowpipelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AirflowpipelineFactory init() {
		try {
			AirflowpipelineFactory theAirflowpipelineFactory = (AirflowpipelineFactory)EPackage.Registry.INSTANCE.getEFactory(AirflowpipelinePackage.eNS_URI);
			if (theAirflowpipelineFactory != null) {
				return theAirflowpipelineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AirflowpipelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirflowpipelineFactoryImpl() {
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
			case AirflowpipelinePackage.DAG: return createDAG();
			case AirflowpipelinePackage.PYTHON_OPERATOR: return createPythonOperator();
			case AirflowpipelinePackage.CONNECTION: return createConnection();
			case AirflowpipelinePackage.TASK_DEPENDENCY: return createTaskDependency();
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
	public DAG createDAG() {
		DAGImpl dag = new DAGImpl();
		return dag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonOperator createPythonOperator() {
		PythonOperatorImpl pythonOperator = new PythonOperatorImpl();
		return pythonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDependency createTaskDependency() {
		TaskDependencyImpl taskDependency = new TaskDependencyImpl();
		return taskDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirflowpipelinePackage getAirflowpipelinePackage() {
		return (AirflowpipelinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AirflowpipelinePackage getPackage() {
		return AirflowpipelinePackage.eINSTANCE;
	}

} //AirflowpipelineFactoryImpl
