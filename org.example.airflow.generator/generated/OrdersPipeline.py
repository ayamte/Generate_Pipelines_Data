from airflow import DAG
from airflow.operators.python import PythonOperator
from datetime import datetime, timedelta

# DAG: OrdersPipeline
# Description: Pipeline de test

dag = DAG(
    'OrdersPipeline',
    description='Pipeline de test',
    schedule_interval='daily',
    start_date=datetime(2024, 1, 1),
    catchup=False
)

# Task: OrdersPipeline_extract
OrdersPipeline_extract = PythonOperator(
    task_id='OrdersPipeline_extract',
    python_callable='extract_postgres',
    op_kwargs={"table": "orders", "database": "mydb"},
    retries=3,
    execution_timeout=timedelta(seconds=300),
    dag=dag
)


# Task: OrdersPipeline_transform
OrdersPipeline_transform = PythonOperator(
    task_id='OrdersPipeline_transform',
    python_callable='transform_clean',
    op_kwargs={"remove_nulls": True, "trim": True, "deduplicate": False},
    retries=3,
    execution_timeout=timedelta(seconds=600),
    dag=dag
)


# Task: OrdersPipeline_load
OrdersPipeline_load = PythonOperator(
    task_id='OrdersPipeline_load',
    python_callable='load_warehouse',
    op_kwargs={"table": "orders_clean", "database": "analytics"},
    retries=3,
    execution_timeout=timedelta(seconds=600),
    dag=dag
)



# Task Dependencies
OrdersPipeline_extract >> OrdersPipeline_transform
OrdersPipeline_transform >> OrdersPipeline_load
