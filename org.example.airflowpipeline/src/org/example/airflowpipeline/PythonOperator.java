/**
 */
package org.example.airflowpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Python Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Opérateur Python exécutant une fonction Python
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.PythonOperator#getPythonCallable <em>Python Callable</em>}</li>
 *   <li>{@link org.example.airflowpipeline.PythonOperator#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link org.example.airflowpipeline.PythonOperator#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.example.airflowpipeline.PythonOperator#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see org.example.airflowpipeline.AirflowpipelinePackage#getPythonOperator()
 * @model
 * @generated
 */
public interface PythonOperator extends Task {
	/**
	 * Returns the value of the '<em><b>Python Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nom de la fonction Python à exécuter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Python Callable</em>' attribute.
	 * @see #setPythonCallable(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getPythonOperator_PythonCallable()
	 * @model
	 * @generated
	 */
	String getPythonCallable();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.PythonOperator#getPythonCallable <em>Python Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Python Callable</em>' attribute.
	 * @see #getPythonCallable()
	 * @generated
	 */
	void setPythonCallable(String value);

	/**
	 * Returns the value of the '<em><b>Opcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type d'opération: extract, transform_clean, transform_filter, load
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opcode</em>' attribute.
	 * @see #setOpcode(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getPythonOperator_Opcode()
	 * @model
	 * @generated
	 */
	String getOpcode();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.PythonOperator#getOpcode <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcode</em>' attribute.
	 * @see #getOpcode()
	 * @generated
	 */
	void setOpcode(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paramètres additionnels au format JSON
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getPythonOperator_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.PythonOperator#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connexion utilisée par cette tâche (optionnel)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getPythonOperator_Connection()
	 * @model
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.PythonOperator#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

} // PythonOperator
