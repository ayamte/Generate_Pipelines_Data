/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration de connexion Airflow
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.Connection#getConnId <em>Conn Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getConnType <em>Conn Type</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getHost <em>Host</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getPort <em>Port</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getLogin <em>Login</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getPassword <em>Password</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.airflowpipeline.Connection#getExtra <em>Extra</em>}</li>
 * </ul>
 *
 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Conn Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiant unique de la connexion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conn Id</em>' attribute.
	 * @see #setConnId(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_ConnId()
	 * @model
	 * @generated
	 */
	String getConnId();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getConnId <em>Conn Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Id</em>' attribute.
	 * @see #getConnId()
	 * @generated
	 */
	void setConnId(String value);

	/**
	 * Returns the value of the '<em><b>Conn Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type de connexion: postgres, mysql, http, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conn Type</em>' attribute.
	 * @see #setConnType(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_ConnType()
	 * @model
	 * @generated
	 */
	String getConnType();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getConnType <em>Conn Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn Type</em>' attribute.
	 * @see #getConnType()
	 * @generated
	 */
	void setConnType(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adresse du serveur
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getHost <em>Host</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Port du serveur
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nom d'utilisateur
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mot de passe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schéma de base de données (optionnel)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Schema()
	 * @model
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Extra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paramètres additionnels au format JSON
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra</em>' attribute.
	 * @see #setExtra(String)
	 * @see org.example.airflowpipeline.AirflowpipelinePackage#getConnection_Extra()
	 * @model
	 * @generated
	 */
	String getExtra();

	/**
	 * Sets the value of the '{@link org.example.airflowpipeline.Connection#getExtra <em>Extra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra</em>' attribute.
	 * @see #getExtra()
	 * @generated
	 */
	void setExtra(String value);

} // Connection
