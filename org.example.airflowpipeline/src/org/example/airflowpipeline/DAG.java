/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Directed Acyclic Graph - représentation d'un pipeline Airflow
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.DAG#getDagId <em>Dag Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getTags <em>Tags</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.example.airflowpipeline.DAG#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG()
 * @model
 * @generated
 */
public interface DAG extends EObject {
	/**
	 * Returns the value of the '<em><b>Dag Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiant unique du DAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dag Id</em>' attribute.
	 * @see #setDagId(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_DagId()
	 * @model
	 * @generated
	 */
	String getDagId();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.DAG#getDagId <em>Dag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dag Id</em>' attribute.
	 * @see #getDagId()
	 * @generated
	 */
	void setDagId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description du DAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.DAG#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Schedule Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intervalle de planification (cron expression ou prédéfini)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Interval</em>' attribute.
	 * @see #setScheduleInterval(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_ScheduleInterval()
	 * @model
	 * @generated
	 */
	String getScheduleInterval();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.DAG#getScheduleInterval <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Interval</em>' attribute.
	 * @see #getScheduleInterval()
	 * @generated
	 */
	void setScheduleInterval(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date de début du DAG (format ISO ou datetime)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_StartDate()
	 * @model
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.DAG#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags pour catégoriser le DAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.airflowpipeline.PythonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste des opérateurs Python du DAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<PythonOperator> getOperators();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.airflowpipeline.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste des connexions nécessaires au DAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.airflowpipeline.TaskDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste des dépendances entre tâches
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getDAG_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDependency> getDependencies();

} // DAG
