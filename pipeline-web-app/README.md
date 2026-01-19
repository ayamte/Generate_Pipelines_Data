# 🚀 Pipeline Web App

Application web pour générer des pipelines Apache Airflow visuellement.

## 📦 Installation

### Backend
```bash
cd backend
npm install
npm start
```

Le backend démarre sur `http://localhost:3001`

### Frontend
```bash
cd frontend
npm install
npm run dev
```

Le frontend démarre sur `http://localhost:3000`

## 🎯 Utilisation

1. Ouvrez `http://localhost:3000`
2. Remplissez le formulaire :
   - Nom du pipeline
   - Description
   - Schedule (daily/weekly/monthly)
   - Source de données (PostgreSQL, MongoDB, REST API)
   - Transformations (optionnel)
   - Destination (DataWarehouse, CSV, Elasticsearch)
3. Cliquez sur "Generate Pipeline"
4. Visualisez le code Python généré et le DAG

## 🏗️ Architecture

```
Frontend (React) → API (Express) → Services Java → Code Python
```

## 📝 API Endpoints

- `POST /api/pipelines/generate` - Génère un pipeline
- `GET /health` - Status du serveur

## ⚙️ Configuration

Le backend utilise les transformateurs Java existants :
- `DSL2EMFTransformer.java`
- `Pipeline2AirflowTransformer.java`
- `GenerateRunner.java` (Acceleo)

## 🎨 Features

- ✅ Formulaire intuitif
- ✅ Génération automatique DSL
- ✅ Code Python Airflow
- ✅ Visualisation DAG
- ✅ Téléchargement fichiers
- ✅ Copie dans le presse-papiers
