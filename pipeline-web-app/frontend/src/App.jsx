import { useState } from 'react'
import PipelineForm from './components/PipelineForm/PipelineForm'
import ResultView from './components/ResultView/ResultView'

function App() {
    const [result, setResult] = useState(null)
    const [showResult, setShowResult] = useState(false)

    const handleSuccess = (data) => {
        setResult(data.data)
        setShowResult(true)
    }

    const handleBack = () => {
        setShowResult(false)
        setResult(null)
    }

    return (
        <div>
            <div className="container">
                <h1 style={{ textAlign: 'center', color: 'white', padding: '20px 0' }}>
                    🚀 Pipeline Generator
                </h1>
                <p style={{ textAlign: 'center', color: 'white', marginBottom: '30px' }}>
                    Create Airflow pipelines visually without writing DSL code
                </p>
            </div>

            {!showResult ? (
                <PipelineForm onSuccess={handleSuccess} />
            ) : (
                <ResultView result={result} onBack={handleBack} />
            )}
        </div>
    )
}

export default App
