/**
 */
package org.example.pipelinedefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modèle racine contenant tous les pipelines
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.PipelineDefinition#getPipelines <em>Pipelines</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipelineDefinition()
 * @model
 * @generated
 */
public interface PipelineDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Pipelines</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.pipelinedefinition.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste de tous les pipelines définis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pipelines</em>' containment reference list.
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getPipelineDefinition_Pipelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pipeline> getPipelines();

} // PipelineDefinition
