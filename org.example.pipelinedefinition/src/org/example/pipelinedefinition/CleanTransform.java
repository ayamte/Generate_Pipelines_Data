/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clean Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation de nettoyage des données
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.CleanTransform#isRemoveNulls <em>Remove Nulls</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.CleanTransform#isTrim <em>Trim</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.CleanTransform#isDeduplicate <em>Deduplicate</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCleanTransform()
 * @model
 * @generated
 */
public interface CleanTransform extends Transformation {
	/**
	 * Returns the value of the '<em><b>Remove Nulls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supprimer les valeurs nulles
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Nulls</em>' attribute.
	 * @see #setRemoveNulls(boolean)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCleanTransform_RemoveNulls()
	 * @model
	 * @generated
	 */
	boolean isRemoveNulls();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CleanTransform#isRemoveNulls <em>Remove Nulls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Nulls</em>' attribute.
	 * @see #isRemoveNulls()
	 * @generated
	 */
	void setRemoveNulls(boolean value);

	/**
	 * Returns the value of the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supprimer les espaces en début/fin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trim</em>' attribute.
	 * @see #setTrim(boolean)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCleanTransform_Trim()
	 * @model
	 * @generated
	 */
	boolean isTrim();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CleanTransform#isTrim <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim</em>' attribute.
	 * @see #isTrim()
	 * @generated
	 */
	void setTrim(boolean value);

	/**
	 * Returns the value of the '<em><b>Deduplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supprimer les doublons
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deduplicate</em>' attribute.
	 * @see #setDeduplicate(boolean)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCleanTransform_Deduplicate()
	 * @model
	 * @generated
	 */
	boolean isDeduplicate();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CleanTransform#isDeduplicate <em>Deduplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduplicate</em>' attribute.
	 * @see #isDeduplicate()
	 * @generated
	 */
	void setDeduplicate(boolean value);

} // CleanTransform
