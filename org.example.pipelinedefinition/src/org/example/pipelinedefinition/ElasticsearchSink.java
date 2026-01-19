/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elasticsearch Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Destination Elasticsearch (extension future)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.ElasticsearchSink#getHost <em>Host</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.ElasticsearchSink#getPort <em>Port</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.ElasticsearchSink#getIndex <em>Index</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.ElasticsearchSink#getUsername <em>Username</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.ElasticsearchSink#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink()
 * @model
 * @generated
 */
public interface ElasticsearchSink extends DataSink {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.ElasticsearchSink#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.ElasticsearchSink#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.ElasticsearchSink#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.ElasticsearchSink#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getElasticsearchSink_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.ElasticsearchSink#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // ElasticsearchSink
