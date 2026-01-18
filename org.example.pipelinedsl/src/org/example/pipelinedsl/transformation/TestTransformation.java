package org.example.pipelinedsl.transformation;

public class TestTransformation {
    public static void main(String[] args) {
        try {
            String dslFile = "examples/test-pipeline.pipelinedsl";
            String xmiFile = "examples/output.xmi";
            
            DSL2EMFTransformer.transformFile(dslFile, xmiFile);
            
            System.out.println("\n✅ Test réussi !");
        } catch (Exception e) {
            System.err.println("❌ Erreur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}