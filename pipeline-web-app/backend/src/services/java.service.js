const { exec } = require('child_process');
const fs = require('fs').promises;
const path = require('path');

class JavaService {
    constructor() {
        this.workspacePath = path.resolve(__dirname, '../../../..');
        this.scriptsPath = path.join(__dirname, '../../scripts');
        this.tempDir = path.join(__dirname, '../../temp');
    }

    /**
     * Exécute toute la chaîne de transformation via scripts batch
     */
    async executePipeline(dslPath, pipelineName) {
        try {
            console.log(`🚀 Starting pipeline execution for: ${pipelineName}`);

            // 1. DSL → EMF via script batch
            const outputXmi = path.join(this.tempDir, `${pipelineName}-output.xmi`);
            console.log('📝 Step 1: DSL → EMF');
            await this.runBatchScript('run-dsl2emf.bat', [dslPath, outputXmi]);

            // 2. EMF → Airflow
            const airflowXmi = path.join(this.tempDir, `${pipelineName}-airflow.xmi`);
            console.log('📝 Step 2: EMF → Airflow');
            await this.runBatchScript('run-pipeline2airflow.bat', [outputXmi, airflowXmi]);

            // 3. Airflow → Python (Acceleo)
            console.log('📝 Step 3: Airflow → Python');
            const pythonPath = path.join(this.tempDir, `${pipelineName}.py`);
            await this.runBatchScript('run-acceleo.bat', [airflowXmi, pythonPath]);

            // 4. Post-process generated Python files to fix syntax issues
            console.log('🔧 Step 4: Post-processing Python code');
            const { fixGeneratedFiles } = require('../../scripts/fix-generated-code');
            fixGeneratedFiles(this.tempDir);

            // 5. Lire le code Python généré
            const pythonCode = await fs.readFile(pythonPath, 'utf8');

            console.log('✅ Pipeline execution completed successfully');

            return {
                dslPath,
                outputXmi,
                airflowXmi,
                pythonPath,
                pythonCode
            };
        } catch (error) {
            console.error('❌ Pipeline execution failed:', error);
            throw error;
        }
    }

    async runBatchScript(scriptName, args) {
        return new Promise((resolve, reject) => {
            const scriptPath = path.join(this.scriptsPath, scriptName);
            const argsString = args.map(arg => `"${arg}"`).join(' ');
            const command = `"${scriptPath}" ${argsString}`;

            console.log(`Executing: ${command}`);

            exec(command, {
                cwd: this.workspacePath,
                maxBuffer: 1024 * 1024 * 10
            }, (error, stdout, stderr) => {
                if (error) {
                    console.error(`❌ Script execution failed:`);
                    console.error(`   stderr: ${stderr}`);
                    console.error(`   stdout: ${stdout}`);
                    reject(new Error(`${scriptName} failed: ${stderr || error.message}`));
                } else {
                    if (stdout) console.log(`   ${stdout}`);
                    if (stderr) console.warn(`   ${stderr}`);
                    resolve(stdout);
                }
            });
        });
    }
}

module.exports = new JavaService();
