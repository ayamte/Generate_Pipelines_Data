import { useState } from 'react';
import { generatePipeline } from '../../services/api.service';

export default function PipelineForm({ onSuccess }) {
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const [pipeline, setPipeline] = useState({
        name: '',
        description: '',
        schedule: 'daily',
        source: {
            type: 'PostgreSQL',
            params: {
                host: 'localhost',
                port: 5432,
                database: '',
                table: '',
                username: '',
                password: ''
            }
        },
        transformations: [{
            type: 'Clean',
            params: {
                removeNulls: true,
                trim: true,
                deduplicate: false
            }
        }],
        sink: {
            type: 'DataWarehouse',
            params: {
                host: '',
                port: 5432,
                database: '',
                table: '',
                username: '',
                password: ''
            }
        }
    });

    const handleSubmit = async (e) => {
        e.preventDefault();
        setLoading(true);
        setError(null);

        try {
            const result = await generatePipeline(pipeline);
            onSuccess(result);
        } catch (err) {
            setError(err.message);
        } finally {
            setLoading(false);
        }
    };

    return (
        <div className="container">
            <h2>Create New Pipeline</h2>

            {error && <div className="error">{error}</div>}

            <form onSubmit={handleSubmit}>
                {/* Pipeline Info */}
                <div className="form-group">
                    <label>Pipeline Name *</label>
                    <input
                        type="text"
                        required
                        value={pipeline.name}
                        onChange={(e) => setPipeline({ ...pipeline, name: e.target.value })}
                        placeholder="e.g., OrdersPipeline"
                    />
                </div>

                <div className="form-group">
                    <label>Description</label>
                    <textarea
                        value={pipeline.description}
                        onChange={(e) => setPipeline({ ...pipeline, description: e.target.value })}
                        placeholder="Describe your pipeline..."
                        rows="3"
                    />
                </div>

                <div className="form-group">
                    <label>Schedule</label>
                    <select
                        value={pipeline.schedule}
                        onChange={(e) => setPipeline({ ...pipeline, schedule: e.target.value })}
                    >
                        <option value="daily">Daily</option>
                        <option value="weekly">Weekly</option>
                        <option value="monthly">Monthly</option>
                    </select>
                </div>

                {/* Source */}
                <h3>📥 Data Source</h3>
                <div className="form-group">
                    <label>Source Type</label>
                    <select
                        value={pipeline.source.type}
                        onChange={(e) => setPipeline({
                            ...pipeline,
                            source: { ...pipeline.source, type: e.target.value }
                        })}
                    >
                        <option value="PostgreSQL">PostgreSQL</option>
                        <option value="MongoDB">MongoDB</option>
                        <option value="RestAPI">REST API</option>
                    </select>
                </div>

                {pipeline.source.type === 'PostgreSQL' && (
                    <>
                        <div className="form-group">
                            <label>Host</label>
                            <input
                                type="text"
                                value={pipeline.source.params.host}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, host: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Port</label>
                            <input
                                type="number"
                                value={pipeline.source.params.port}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, port: parseInt(e.target.value) }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Database</label>
                            <input
                                type="text"
                                required
                                value={pipeline.source.params.database}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, database: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Table</label>
                            <input
                                type="text"
                                required
                                value={pipeline.source.params.table}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, table: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Username</label>
                            <input
                                type="text"
                                value={pipeline.source.params.username}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, username: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Password</label>
                            <input
                                type="password"
                                value={pipeline.source.params.password}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    source: {
                                        ...pipeline.source,
                                        params: { ...pipeline.source.params, password: e.target.value }
                                    }
                                })}
                            />
                        </div>
                    </>
                )}

                {/* Sink */}
                <h3>📤 Data Destination</h3>
                <div className="form-group">
                    <label>Sink Type</label>
                    <select
                        value={pipeline.sink.type}
                        onChange={(e) => setPipeline({
                            ...pipeline,
                            sink: { ...pipeline.sink, type: e.target.value }
                        })}
                    >
                        <option value="DataWarehouse">Data Warehouse</option>
                        <option value="CSV">CSV File</option>
                        <option value="Elasticsearch">Elasticsearch</option>
                    </select>
                </div>

                {pipeline.sink.type === 'DataWarehouse' && (
                    <>
                        <div className="form-group">
                            <label>Host</label>
                            <input
                                type="text"
                                value={pipeline.sink.params.host}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, host: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Port</label>
                            <input
                                type="number"
                                value={pipeline.sink.params.port}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, port: parseInt(e.target.value) }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Database</label>
                            <input
                                type="text"
                                required
                                value={pipeline.sink.params.database}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, database: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Table</label>
                            <input
                                type="text"
                                required
                                value={pipeline.sink.params.table}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, table: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Username</label>
                            <input
                                type="text"
                                value={pipeline.sink.params.username}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, username: e.target.value }
                                    }
                                })}
                            />
                        </div>
                        <div className="form-group">
                            <label>Password</label>
                            <input
                                type="password"
                                value={pipeline.sink.params.password}
                                onChange={(e) => setPipeline({
                                    ...pipeline,
                                    sink: {
                                        ...pipeline.sink,
                                        params: { ...pipeline.sink.params, password: e.target.value }
                                    }
                                })}
                            />
                        </div>
                    </>
                )}

                <button
                    type="submit"
                    disabled={loading}
                    style={{ width: '100%', marginTop: '20px', padding: '15px', fontSize: '18px' }}
                >
                    {loading ? '⏳ Generating Pipeline...' : '🚀 Generate Pipeline'}
                </button>
            </form>
        </div>
    );
}
