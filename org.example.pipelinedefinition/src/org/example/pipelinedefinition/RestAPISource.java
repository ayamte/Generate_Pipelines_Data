/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest API Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source de données REST API (extension future)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.RestAPISource#getUrl <em>Url</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.RestAPISource#getMethod <em>Method</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.RestAPISource#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.RestAPISource#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getRestAPISource()
 * @model
 * @generated
 */
public interface RestAPISource extends DataSource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getRestAPISource_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.RestAPISource#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getRestAPISource_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.RestAPISource#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getRestAPISource_ApiKey()
	 * @model
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.RestAPISource#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' attribute.
	 * @see #setHeaders(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getRestAPISource_Headers()
	 * @model
	 * @generated
	 */
	String getHeaders();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.RestAPISource#getHeaders <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' attribute.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(String value);

} // RestAPISource
