const fs = require('fs').promises;
const path = require('path');

class DSLService {
    /**
     * Génère le code DSL à partir des données du formulaire
     */
    generateDSL(pipelineData) {
        const { name, description, schedule, source, transformations, sink } = pipelineData;

        let dsl = `pipeline ${name} {\n`;
        dsl += `    description "${description}"\n`;
        dsl += `    schedule "${schedule}"\n\n`;

        // Source
        dsl += this.generateSource(source);

        // Transformations
        if (transformations && transformations.length > 0) {
            dsl += `    transformations {\n`;
            transformations.forEach(transform => {
                dsl += this.generateTransformation(transform);
            });
            dsl += `    }\n\n`;
        }

        // Sink
        dsl += this.generateSink(sink);

        dsl += `}\n`;
        return dsl;
    }

    generateSource(source) {
        const { type, params } = source;
        // Mapper les types reçus du frontend aux noms exacts de la grammaire Xtext
        const typeMapping = {
            'PostgreSQL': 'PostgreSQLSource',
            'MongoDB': 'MongoDBSource',
            'RestAPI': 'RestAPISource'
        };
        const dslType = typeMapping[type] || type;
        let dsl = `    source ${dslType} {\n`;

        Object.entries(params).forEach(([key, value]) => {
            if (typeof value === 'number') {
                dsl += `        ${key} ${value}\n`;
            } else {
                dsl += `        ${key} "${value}"\n`;
            }
        });

        dsl += `    }\n\n`;
        return dsl;
    }

    generateTransformation(transform) {
        const { type, params } = transform;
        // Mapper les types reçus du frontend aux noms exacts de la grammaire Xtext
        const typeMapping = {
            'Clean': 'CleanTransform',
            'Filter': 'FilterTransform',
            'Aggregate': 'AggregateTransform'
        };
        const dslType = typeMapping[type] || type;
        let dsl = `        ${dslType} {\n`;

        Object.entries(params).forEach(([key, value]) => {
            if (typeof value === 'boolean') {
                dsl += `            ${key} ${value}\n`;
            } else if (typeof value === 'number') {
                dsl += `            ${key} ${value}\n`;
            } else {
                dsl += `            ${key} "${value}"\n`;
            }
        });

        dsl += `        }\n`;
        return dsl;
    }

    generateSink(sink) {
        const { type, params } = sink;
        // Mapper les types reçus du frontend aux noms exacts de la grammaire Xtext
        const typeMapping = {
            'DataWarehouse': 'DataWarehouseSink',
            'CSV': 'CSVSink',
            'Elasticsearch': 'ElasticsearchSink'
        };
        const dslType = typeMapping[type] || type;
        let dsl = `    sink ${dslType} {\n`;

        Object.entries(params).forEach(([key, value]) => {
            if (typeof value === 'number') {
                dsl += `        ${key} ${value}\n`;
            } else {
                dsl += `        ${key} "${value}"\n`;
            }
        });

        dsl += `    }\n\n`;
        return dsl;
    }

    /**
     * Sauvegarde le DSL dans un fichier
     */
    async saveDSL(dslContent, filename) {
        const tempDir = path.join(__dirname, '../../temp');
        const filePath = path.join(tempDir, `${filename}.pipelinedsl`);
        await fs.writeFile(filePath, dslContent, 'utf8');
        return filePath;
    }
}

module.exports = new DSLService();
