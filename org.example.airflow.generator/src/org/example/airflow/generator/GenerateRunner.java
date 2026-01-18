package org.example.airflow.generator;
import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.DAG;
public class GenerateRunner {
    
    public static void main(String[] args) {
        try {
            // Enregistrer le package
            EPackage.Registry.INSTANCE.put(
                AirflowpipelinePackage.eNS_URI,
                AirflowpipelinePackage.eINSTANCE
            );
            
            // Charger le modèle
            ResourceSet resourceSet = new ResourceSetImpl();
            resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
            
            String modelPath = "C:/Users/User/eclipse-workspace-xtext-clean/org.example.pipelinedsl/examples/airflow-output.xmi";
            Resource resource = resourceSet.getResource(
                URI.createFileURI(modelPath), true);
            
            DAG dag = (DAG) resource.getContents().get(0);
            
            // Générer
            File targetFolder = new File("C:/Users/User/eclipse-workspace-xtext-clean/org.example.airflow.generator/generated");
            if (!targetFolder.exists()) {
                targetFolder.mkdirs();
            }
            
            java.util.List<Object> arguments = new java.util.ArrayList<Object>();
            Generate generator = new Generate(dag, targetFolder, arguments);
            generator.doGenerate(new org.eclipse.emf.common.util.BasicMonitor());
            
            System.out.println("✅ Génération réussie !");
            System.out.println("   Fichiers générés dans : " + targetFolder.getAbsolutePath());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}