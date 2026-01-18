package org.example.pipelinedsl.transformation;

public class TestPipeline2Airflow {
    
    public static void main(String[] args) {
        try {
            String inputXmi = "examples/output.xmi";
            String outputXmi = "examples/airflow-output.xmi";
            
            Pipeline2AirflowTransformer.transformFile(inputXmi, outputXmi);
            
            System.out.println("\n✅ Test réussi !");
        } catch (Exception e) {
            System.err.println("❌ Erreur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
