import axios from 'axios';

const API_BASE_URL = '/api';

export const generatePipeline = async (pipelineData) => {
    try {
        const response = await axios.post(`${API_BASE_URL}/pipelines/generate`, pipelineData);
        return response.data;
    } catch (error) {
        throw new Error(error.response?.data?.error || 'Failed to generate pipeline');
    }
};

export default {
    generatePipeline
};
