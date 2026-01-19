/**
 */
package org.example.pipelinedefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getSource <em>Source</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.Pipeline#getSink <em>Sink</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nom unique du pipeline
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description du pipeline
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.Pipeline#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planification: hourly, daily, weekly, monthly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Schedule()
	 * @model
	 * @generated
	 */
	String getSchedule();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.Pipeline#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source de données unique du pipeline
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(DataSource)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSource getSource();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.Pipeline#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.pipelinedefinition.Transformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste ordonnée des transformations à appliquer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destination unique des données transformées
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(DataSink)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipeline_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSink getSink();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.Pipeline#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(DataSink value);

} // Pipeline
