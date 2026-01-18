/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Classe abstraite représentant une tâche Airflow
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.Task#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Task#getRetry <em>Retry</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Task#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiant unique de la tâche
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #setTaskId(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTask_TaskId()
	 * @model
	 * @generated
	 */
	String getTaskId();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Task#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description de la tâche
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nombre de tentatives en cas d'échec
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry</em>' attribute.
	 * @see #setRetry(int)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTask_Retry()
	 * @model
	 * @generated
	 */
	int getRetry();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Task#getRetry <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry</em>' attribute.
	 * @see #getRetry()
	 * @generated
	 */
	void setRetry(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timeout en secondes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTask_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Task#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // Task
