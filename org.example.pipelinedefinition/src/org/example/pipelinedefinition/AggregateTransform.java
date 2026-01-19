/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation d'agrégation (extension future)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.AggregateTransform#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.AggregateTransform#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getAggregateTransform()
 * @model
 * @generated
 */
public interface AggregateTransform extends Transformation {
	/**
	 * Returns the value of the '<em><b>Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' attribute.
	 * @see #setGroupBy(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getAggregateTransform_GroupBy()
	 * @model
	 * @generated
	 */
	String getGroupBy();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.AggregateTransform#getGroupBy <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By</em>' attribute.
	 * @see #getGroupBy()
	 * @generated
	 */
	void setGroupBy(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getAggregateTransform_Aggregation()
	 * @model
	 * @generated
	 */
	String getAggregation();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.AggregateTransform#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(String value);

} // AggregateTransform
