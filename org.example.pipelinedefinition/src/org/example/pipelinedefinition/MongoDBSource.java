/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo DB Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source de données MongoDB (extension future)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getHost <em>Host</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getPort <em>Port</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getUsername <em>Username</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.MongoDBSource#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource()
 * @model
 * @generated
 */
public interface MongoDBSource extends DataSource {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getHost <em>Host</em>}' attribute.
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
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Database()
	 * @model
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see #setCollection(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Collection()
	 * @model
	 * @generated
	 */
	String getCollection();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getUsername <em>Username</em>}' attribute.
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
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getMongoDBSource_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.MongoDBSource#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // MongoDBSource
