# 🚀 Pipeline MDE - Générateur Airflow

Projet MDE (Model-Driven Engineering) pour générer automatiquement des pipelines Apache Airflow depuis un DSL personnalisé.

## 🎯 Vue d'Ensemble

Ce projet implémente une chaîne de transformation complète MDE :

```
DSL (.pipelinedsl) → Xtext → EMF → Airflow XMI → Python
```

## ✨ Fonctionnalités

- ✅ DSL intuitif pour définir des pipelines de données
- ✅ Transformation automatique M2M (Model-to-Model)
- ✅ Génération de code Python Airflow
- ✅ Support de multiples sources (PostgreSQL, MongoDB, REST API)
- ✅ Transformations de données (Clean, Filter, Aggregate)
- ✅ Multiples destinations (DataWarehouse, CSV, Elasticsearch)

## 🏗️ Architecture

### Métamodèles

- **PipelineDefinition** : Modèle source représentant les pipelines
- **AirflowPipeline** : Modèle cible représentant les DAGs Airflow

### Transformations

1. **DSL → EMF** : `DSL2EMFTransformer.java` (309 lignes)
2. **EMF → Airflow** : `Pipeline2AirflowTransformer.java` (320 lignes)
3. **Airflow → Python** : Templates Acceleo MTL (71 lignes)

## 📁 Structure du Projet

```
eclipse-workspace-xtext-clean/
├── org.example.pipelinedsl/          # DSL Xtext
│   ├── src/
│   │   └── org/example/pipelinedsl/
│   │       ├── PipelineDSL.xtext     # Grammaire DSL
│   │       └── transformation/
│   │           ├── DSL2EMFTransformer.java
│   │           └── Pipeline2AirflowTransformer.java
│   └── examples/
│       ├── test-pipeline.pipelinedsl # Exemple DSL
│       ├── output.xmi                # PipelineDefinition
│       ├── airflow-output.xmi        # AirflowPipeline
│       └── OrdersPipeline.py         # Code Python généré
│
├── org.example.pipelinedefinition/   # Métamodèle source
│   └── model/
│       └── PipelineDefinition.ecore
│
├── org.example.airflowpipeline/      # Métamodèle cible
│   └── model/
│       └── AirflowPipeline.ecore
│
└── org.example.airflow.generator/    # Générateur Acceleo
    └── src/
        └── org/example/airflow/generator/
            ├── generate.mtl          # Template principal
            └── GenerateRunner.java   # Launcher
```

## 🚀 Utilisation

### 1. Écrire un Pipeline DSL

```
pipeline OrdersPipeline {
    description "Pipeline de test"
    schedule "daily"
    
    source PostgreSQL {
        host "localhost"
        port 5432
        database "mydb"
        table "orders"
        username "user"
        password "pass"
    }
    
    transform Clean {
        remove_nulls true
        trim true
    }
    
    sink DataWarehouse {
        host "warehouse"
        port 5432
        database "analytics"
        table "orders_clean"
        username "user"
        password "pass"
    }
}
```

### 2. Exécuter les Transformations

```java
// 1. DSL → EMF
DSL2EMFTransformer.transformFile(
    "examples/test-pipeline.pipelinedsl",
    "examples/output.xmi"
);

// 2. EMF → Airflow
Pipeline2AirflowTransformer.transformFile(
    "examples/output.xmi",
    "examples/airflow-output.xmi"
);

// 3. Airflow → Python
GenerateRunner.main(new String[]{});
```

### 3. Récupérer le Code Python

Le fichier `OrdersPipeline.py` est généré dans `generated/` :

```python
from airflow import DAG
from airflow.operators.python import PythonOperator
from datetime import datetime, timedelta

dag = DAG(
    'OrdersPipeline',
    description='Pipeline de test',
    schedule_interval='daily',
    start_date=datetime(2024, 1, 1),
    catchup=False
)

# 3 tâches : Extract, Transform, Load
# Dépendances : Extract → Transform → Load
```

## 🛠️ Technologies

- **Xtext** : Création du DSL
- **EMF** : Métamodélisation
- **Java 17** : Transformations M2M
- **Acceleo** : Génération de code M2T
- **Apache Airflow** : Orchestration de pipelines

## 📊 Statistiques

- **Lignes de code Java** : 677
- **Lignes de templates MTL** : 71
- **Transformations** : 3 (2 M2M + 1 M2T)
- **Métamodèles** : 2 (PipelineDefinition, AirflowPipeline)

## 🎓 Contexte Académique

Projet réalisé dans le cadre d'un cours de Model-Driven Engineering (MDE), démontrant :
- La création de DSL avec Xtext
- Les transformations de modèles M2M
- La génération de code M2T
- L'utilisation d'EMF et Acceleo

## 📝 Licence

Ce projet est à usage académique.

## 👤 Auteur

Projet MDE - Générateur de Pipelines Airflow

---

**⭐ Si ce projet vous a été utile, n'hésitez pas à le star !**
