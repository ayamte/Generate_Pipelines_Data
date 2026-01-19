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
            if (args.length < 2) {
                System.err.println("Usage: GenerateRunner <input.xmi> <output.py>");
                System.exit(1);
            }
            
            String inputXmiPath = args[0];
            String outputPyPath = args[1];
            
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
            
            Resource resource = resourceSet.getResource(
                URI.createFileURI(new File(inputXmiPath).getAbsolutePath()), true);
            
            if (resource.getContents().isEmpty()) {
                throw new Exception("Le fichier XMI est vide");
            }
            
            DAG dag = (DAG) resource.getContents().get(0);
            
            // Déterminer le dossier de sortie depuis le chemin du fichier de sortie
            File outputFile = new File(outputPyPath);
            File targetFolder = outputFile.getParentFile();
            
            if (!targetFolder.exists()) {
                targetFolder.mkdirs();
            }
            
            // Générer
            java.util.List<Object> arguments = new java.util.ArrayList<Object>();
            Generate generator = new Generate(dag, targetFolder, arguments);
            generator.doGenerate(new org.eclipse.emf.common.util.BasicMonitor());
            
            System.out.println("✅ Génération réussie !");
            System.out.println("   Fichiers générés dans : " + targetFolder.getAbsolutePath());
            
        } catch (Exception e) {
            System.err.println("❌ Erreur lors de la génération : " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}