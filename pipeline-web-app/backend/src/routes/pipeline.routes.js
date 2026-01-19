const express = require('express');
const router = express.Router();
const dslService = require('../services/dsl.service');
const javaService = require('../services/java.service');

/**
 * POST /api/pipelines/generate
 * Génère un pipeline complet avec les vraies transformations Java
 */
router.post('/generate', async (req, res) => {
    try {
        console.log('📥 Received pipeline generation request');
        const pipelineData = req.body;

        // Validation basique
        if (!pipelineData.name || !pipelineData.source || !pipelineData.sink) {
            return res.status(400).json({
                success: false,
                error: 'Missing required fields: name, source, sink'
            });
        }

        // 1. Générer le DSL
        console.log('🔨 Generating DSL...');
        const dslContent = dslService.generateDSL(pipelineData);

        // 2. Sauvegarder le DSL
        const dslPath = await dslService.saveDSL(dslContent, pipelineData.name);
        console.log(`💾 DSL saved to: ${dslPath}`);

        // 3. Exécuter les transformations Java
        console.log('⚙️ Executing Java transformations...');
        const result = await javaService.executePipeline(dslPath, pipelineData.name);

        // 4. Parser le DAG pour la visualisation
        const dagData = parseDAG(result.pythonCode);

        console.log('✅ Pipeline generated successfully');

        res.json({
            success: true,
            data: {
                dsl: dslContent,
                python: result.pythonCode,
                dag: dagData,
                files: {
                    dsl: dslPath,
                    outputXmi: result.outputXmi,
                    airflowXmi: result.airflowXmi,
                    python: result.pythonPath
                }
            }
        });
    } catch (error) {
        console.error('❌ Error generating pipeline:', error);
        res.status(500).json({
            success: false,
            error: error.message,
            details: process.env.NODE_ENV === 'development' ? error.stack : undefined
        });
    }
});

/**
 * Helper function pour parser le DAG du code Python
 */
function parseDAG(pythonCode) {
    const tasks = [];
    const dependencies = [];

    // Extraire les tâches (PythonOperator)
    const taskRegex = /(\w+)\s*=\s*PythonOperator\(/g;
    let match;
    while ((match = taskRegex.exec(pythonCode)) !== null) {
        tasks.push({
            id: match[1],
            label: match[1].replace(/_/g, ' ')
        });
    }

    // Extraire les dépendances (>>)
    const depRegex = /(\w+)\s*>>\s*(\w+)/g;
    while ((match = depRegex.exec(pythonCode)) !== null) {
        dependencies.push({
            source: match[1],
            target: match[2]
        });
    }

    return { tasks, dependencies };
}

module.exports = router;
