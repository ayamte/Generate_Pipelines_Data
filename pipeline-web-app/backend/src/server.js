const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const pipelineRoutes = require('./routes/pipeline.routes');

const app = express();
const PORT = process.env.PORT || 3001;

// Middleware
app.use(cors());
app.use(bodyParser.json());

// Routes
app.use('/api/pipelines', pipelineRoutes);

// Health check
app.get('/health', (req, res) => {
    res.json({ status: 'OK', message: 'Pipeline Generator API is running' });
});

// Error handler
app.use((err, req, res, next) => {
    console.error(err.stack);
    res.status(500).json({ success: false, error: err.message });
});

app.listen(PORT, () => {
    console.log(`✅ Server running on http://localhost:${PORT}`);
    console.log(`📊 API available at http://localhost:${PORT}/api/pipelines`);
});
