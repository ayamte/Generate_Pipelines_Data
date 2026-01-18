/**
 */
package org.example.airflowpipeline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.airflowpipeline.AirflowpipelineFactory
 * @model kind="package"
 * @generated
 */
public interface AirflowpipelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airflowpipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/airflowpipeline";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "airflowpipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirflowpipelinePackage eINSTANCE = org.example.airflowpipeline.impl.AirflowpipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.example.airflowpipeline.impl.DAGImpl <em>DAG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.airflowpipeline.impl.DAGImpl
	 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getDAG()
	 * @generated
	 */
	int DAG = 0;

	/**
	 * The feature id for the '<em><b>Dag Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__DAG_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Schedule Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__SCHEDULE_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__TAGS = 4;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__OPERATORS = 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__CONNECTIONS = 6;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG__DEPENDENCIES = 7;

	/**
	 * The number of structural features of the '<em>DAG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DAG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.airflowpipeline.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.airflowpipeline.impl.TaskImpl
	 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETRY = 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIMEOUT = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.airflowpipeline.impl.PythonOperatorImpl <em>Python Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.airflowpipeline.impl.PythonOperatorImpl
	 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getPythonOperator()
	 * @generated
	 */
	int PYTHON_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__TASK_ID = TASK__TASK_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__RETRY = TASK__RETRY;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__TIMEOUT = TASK__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Python Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__PYTHON_CALLABLE = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__OPCODE = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__PARAMETERS = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR__CONNECTION = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Python Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Python Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_OPERATOR_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.airflowpipeline.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.airflowpipeline.impl.ConnectionImpl
	 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Conn Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_ID = 0;

	/**
	 * The feature id for the '<em><b>Conn Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HOST = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 3;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LOGIN = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Extra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__EXTRA = 7;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.airflowpipeline.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.airflowpipeline.impl.TaskDependencyImpl
	 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getTaskDependency()
	 * @generated
	 */
	int TASK_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Upstream Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__UPSTREAM_TASK_ID = 0;

	/**
	 * The feature id for the '<em><b>Downstream Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY__DOWNSTREAM_TASK_ID = 1;

	/**
	 * The number of structural features of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.example.airflowpipeline.DAG <em>DAG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAG</em>'.
	 * @see org.example.airflowpipeline.DAG
	 * @generated
	 */
	EClass getDAG();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.DAG#getDagId <em>Dag Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dag Id</em>'.
	 * @see org.example.airflowpipeline.DAG#getDagId()
	 * @see #getDAG()
	 * @generated
	 */
	EAttribute getDAG_DagId();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.DAG#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.example.airflowpipeline.DAG#getDescription()
	 * @see #getDAG()
	 * @generated
	 */
	EAttribute getDAG_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.DAG#getScheduleInterval <em>Schedule Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Interval</em>'.
	 * @see org.example.airflowpipeline.DAG#getScheduleInterval()
	 * @see #getDAG()
	 * @generated
	 */
	EAttribute getDAG_ScheduleInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.DAG#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.example.airflowpipeline.DAG#getStartDate()
	 * @see #getDAG()
	 * @generated
	 */
	EAttribute getDAG_StartDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.example.airflowpipeline.DAG#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.example.airflowpipeline.DAG#getTags()
	 * @see #getDAG()
	 * @generated
	 */
	EAttribute getDAG_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.airflowpipeline.DAG#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see org.example.airflowpipeline.DAG#getOperators()
	 * @see #getDAG()
	 * @generated
	 */
	EReference getDAG_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.airflowpipeline.DAG#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.example.airflowpipeline.DAG#getConnections()
	 * @see #getDAG()
	 * @generated
	 */
	EReference getDAG_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.airflowpipeline.DAG#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.example.airflowpipeline.DAG#getDependencies()
	 * @see #getDAG()
	 * @generated
	 */
	EReference getDAG_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.example.airflowpipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.example.airflowpipeline.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Task#getTaskId <em>Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Id</em>'.
	 * @see org.example.airflowpipeline.Task#getTaskId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskId();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.example.airflowpipeline.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Task#getRetry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry</em>'.
	 * @see org.example.airflowpipeline.Task#getRetry()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Retry();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Task#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.example.airflowpipeline.Task#getTimeout()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Timeout();

	/**
	 * Returns the meta object for class '{@link org.example.airflowpipeline.PythonOperator <em>Python Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Python Operator</em>'.
	 * @see org.example.airflowpipeline.PythonOperator
	 * @generated
	 */
	EClass getPythonOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.PythonOperator#getPythonCallable <em>Python Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Python Callable</em>'.
	 * @see org.example.airflowpipeline.PythonOperator#getPythonCallable()
	 * @see #getPythonOperator()
	 * @generated
	 */
	EAttribute getPythonOperator_PythonCallable();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.PythonOperator#getOpcode <em>Opcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcode</em>'.
	 * @see org.example.airflowpipeline.PythonOperator#getOpcode()
	 * @see #getPythonOperator()
	 * @generated
	 */
	EAttribute getPythonOperator_Opcode();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.PythonOperator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see org.example.airflowpipeline.PythonOperator#getParameters()
	 * @see #getPythonOperator()
	 * @generated
	 */
	EAttribute getPythonOperator_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.example.airflowpipeline.PythonOperator#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.example.airflowpipeline.PythonOperator#getConnection()
	 * @see #getPythonOperator()
	 * @generated
	 */
	EReference getPythonOperator_Connection();

	/**
	 * Returns the meta object for class '{@link org.example.airflowpipeline.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.example.airflowpipeline.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getConnId <em>Conn Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn Id</em>'.
	 * @see org.example.airflowpipeline.Connection#getConnId()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnId();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getConnType <em>Conn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn Type</em>'.
	 * @see org.example.airflowpipeline.Connection#getConnType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnType();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.example.airflowpipeline.Connection#getHost()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.example.airflowpipeline.Connection#getPort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see org.example.airflowpipeline.Connection#getLogin()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Login();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.example.airflowpipeline.Connection#getPassword()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.example.airflowpipeline.Connection#getSchema()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.Connection#getExtra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra</em>'.
	 * @see org.example.airflowpipeline.Connection#getExtra()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Extra();

	/**
	 * Returns the meta object for class '{@link org.example.airflowpipeline.TaskDependency <em>Task Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Dependency</em>'.
	 * @see org.example.airflowpipeline.TaskDependency
	 * @generated
	 */
	EClass getTaskDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.TaskDependency#getUpstreamTaskId <em>Upstream Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upstream Task Id</em>'.
	 * @see org.example.airflowpipeline.TaskDependency#getUpstreamTaskId()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_UpstreamTaskId();

	/**
	 * Returns the meta object for the attribute '{@link org.example.airflowpipeline.TaskDependency#getDownstreamTaskId <em>Downstream Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downstream Task Id</em>'.
	 * @see org.example.airflowpipeline.TaskDependency#getDownstreamTaskId()
	 * @see #getTaskDependency()
	 * @generated
	 */
	EAttribute getTaskDependency_DownstreamTaskId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirflowpipelineFactory getAirflowpipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.example.airflowpipeline.impl.DAGImpl <em>DAG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.airflowpipeline.impl.DAGImpl
		 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getDAG()
		 * @generated
		 */
		EClass DAG = eINSTANCE.getDAG();

		/**
		 * The meta object literal for the '<em><b>Dag Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG__DAG_ID = eINSTANCE.getDAG_DagId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG__DESCRIPTION = eINSTANCE.getDAG_Description();

		/**
		 * The meta object literal for the '<em><b>Schedule Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG__SCHEDULE_INTERVAL = eINSTANCE.getDAG_ScheduleInterval();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG__START_DATE = eINSTANCE.getDAG_StartDate();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG__TAGS = eINSTANCE.getDAG_Tags();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG__OPERATORS = eINSTANCE.getDAG_Operators();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG__CONNECTIONS = eINSTANCE.getDAG_Connections();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG__DEPENDENCIES = eINSTANCE.getDAG_Dependencies();

		/**
		 * The meta object literal for the '{@link org.example.airflowpipeline.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.airflowpipeline.impl.TaskImpl
		 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_ID = eINSTANCE.getTask_TaskId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Retry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RETRY = eINSTANCE.getTask_Retry();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TIMEOUT = eINSTANCE.getTask_Timeout();

		/**
		 * The meta object literal for the '{@link org.example.airflowpipeline.impl.PythonOperatorImpl <em>Python Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.airflowpipeline.impl.PythonOperatorImpl
		 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getPythonOperator()
		 * @generated
		 */
		EClass PYTHON_OPERATOR = eINSTANCE.getPythonOperator();

		/**
		 * The meta object literal for the '<em><b>Python Callable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYTHON_OPERATOR__PYTHON_CALLABLE = eINSTANCE.getPythonOperator_PythonCallable();

		/**
		 * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYTHON_OPERATOR__OPCODE = eINSTANCE.getPythonOperator_Opcode();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYTHON_OPERATOR__PARAMETERS = eINSTANCE.getPythonOperator_Parameters();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PYTHON_OPERATOR__CONNECTION = eINSTANCE.getPythonOperator_Connection();

		/**
		 * The meta object literal for the '{@link org.example.airflowpipeline.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.airflowpipeline.impl.ConnectionImpl
		 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Conn Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONN_ID = eINSTANCE.getConnection_ConnId();

		/**
		 * The meta object literal for the '<em><b>Conn Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONN_TYPE = eINSTANCE.getConnection_ConnType();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__HOST = eINSTANCE.getConnection_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PORT = eINSTANCE.getConnection_Port();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LOGIN = eINSTANCE.getConnection_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PASSWORD = eINSTANCE.getConnection_Password();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SCHEMA = eINSTANCE.getConnection_Schema();

		/**
		 * The meta object literal for the '<em><b>Extra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__EXTRA = eINSTANCE.getConnection_Extra();

		/**
		 * The meta object literal for the '{@link org.example.airflowpipeline.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.airflowpipeline.impl.TaskDependencyImpl
		 * @see org.example.airflowpipeline.impl.AirflowpipelinePackageImpl#getTaskDependency()
		 * @generated
		 */
		EClass TASK_DEPENDENCY = eINSTANCE.getTaskDependency();

		/**
		 * The meta object literal for the '<em><b>Upstream Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEPENDENCY__UPSTREAM_TASK_ID = eINSTANCE.getTaskDependency_UpstreamTaskId();

		/**
		 * The meta object literal for the '<em><b>Downstream Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEPENDENCY__DOWNSTREAM_TASK_ID = eINSTANCE.getTaskDependency_DownstreamTaskId();

	}

} //AirflowpipelinePackage
