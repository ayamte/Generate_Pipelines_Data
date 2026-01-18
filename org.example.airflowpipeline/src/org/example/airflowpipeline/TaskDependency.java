/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Représente une dépendance entre deux tâches
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.TaskDependency#getUpstreamTaskId <em>Upstream Task Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.TaskDependency#getDownstreamTaskId <em>Downstream Task Id</em>}</li>
 * </ul>
 *
 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTaskDependency()
 * @model
 * @generated
 */
public interface TaskDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Upstream Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiant de la tâche source (prédécesseur)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upstream Task Id</em>' attribute.
	 * @see #setUpstreamTaskId(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTaskDependency_UpstreamTaskId()
	 * @model
	 * @generated
	 */
	String getUpstreamTaskId();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.TaskDependency#getUpstreamTaskId <em>Upstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upstream Task Id</em>' attribute.
	 * @see #getUpstreamTaskId()
	 * @generated
	 */
	void setUpstreamTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Downstream Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiant de la tâche cible (successeur)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Downstream Task Id</em>' attribute.
	 * @see #setDownstreamTaskId(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getTaskDependency_DownstreamTaskId()
	 * @model
	 * @generated
	 */
	String getDownstreamTaskId();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.TaskDependency#getDownstreamTaskId <em>Downstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downstream Task Id</em>' attribute.
	 * @see #getDownstreamTaskId()
	 * @generated
	 */
	void setDownstreamTaskId(String value);

} // TaskDependency
