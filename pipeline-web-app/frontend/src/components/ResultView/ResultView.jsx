import { useState } from 'react';

export default function ResultView({ result, onBack }) {
    const [activeTab, setActiveTab] = useState('python');

    const downloadPython = () => {
        const blob = new Blob([result.python], { type: 'text/plain' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = 'pipeline.py';
        a.click();
        URL.revokeObjectURL(url);
    };

    const copyToClipboard = () => {
        navigator.clipboard.writeText(result.python);
        alert('Code copied to clipboard!');
    };

    return (
        <div className="container">
            <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '20px' }}>
                <h2>✅ Pipeline Generated Successfully!</h2>
                <button onClick={onBack}>← Create New Pipeline</button>
            </div>

            <div className="tabs">
                <button
                    className={`tab ${activeTab === 'python' ? 'active' : ''}`}
                    onClick={() => setActiveTab('python')}
                >
                    🐍 Python Code
                </button>
                <button
                    className={`tab ${activeTab === 'dag' ? 'active' : ''}`}
                    onClick={() => setActiveTab('dag')}
                >
                    📊 DAG Visualization
                </button>
                <button
                    className={`tab ${activeTab === 'dsl' ? 'active' : ''}`}
                    onClick={() => setActiveTab('dsl')}
                >
                    📝 DSL Code
                </button>
            </div>

            {activeTab === 'python' && (
                <div>
                    <div style={{ display: 'flex', gap: '10px', marginBottom: '10px' }}>
                        <button onClick={downloadPython}>⬇️ Download Python</button>
                        <button onClick={copyToClipboard}>📋 Copy to Clipboard</button>
                    </div>
                    <pre>{result.python}</pre>
                </div>
            )}

            {activeTab === 'dag' && (
                <div>
                    <h3>DAG Flow</h3>
                    <div style={{ background: '#f5f5f5', padding: '30px', borderRadius: '8px', textAlign: 'center' }}>
                        {result.dag.tasks.map((task, index) => (
                            <div key={task.id}>
                                <div style={{
                                    display: 'inline-block',
                                    background: '#667eea',
                                    color: 'white',
                                    padding: '15px 30px',
                                    borderRadius: '8px',
                                    margin: '10px',
                                    fontWeight: 'bold'
                                }}>
                                    {task.label}
                                </div>
                                {index < result.dag.tasks.length - 1 && (
                                    <div style={{ fontSize: '24px', margin: '5px 0' }}>↓</div>
                                )}
                            </div>
                        ))}
                    </div>

                    <h4 style={{ marginTop: '20px' }}>Dependencies:</h4>
                    <ul>
                        {result.dag.dependencies.map((dep, i) => (
                            <li key={i}>
                                <strong>{dep.source}</strong> → <strong>{dep.target}</strong>
                            </li>
                        ))}
                    </ul>
                </div>
            )}

            {activeTab === 'dsl' && (
                <div>
                    <pre>{result.dsl}</pre>
                </div>
            )}
        </div>
    );
}
