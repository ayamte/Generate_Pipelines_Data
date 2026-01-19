@echo off
REM Script pour exécuter Acceleo GenerateRunner

SET WORKSPACE=%~dp0..\..\..\\
SET ECLIPSE=C:\Users\User\Downloads\Ensias\Ensias\3A GL\eclipse-dsl-2025-09-R-win32-x86_64\eclipse\plugins

echo === Execution Acceleo GenerateRunner ===
cd "%WORKSPACE%"

REM Trouver TOUS les JARs nécessaires
FOR %%i IN ("%ECLIPSE%\org.eclipse.emf.ecore_*.jar") DO SET JAR_EMF_ECORE=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.emf.common_*.jar") DO SET JAR_EMF_COMMON=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.emf.ecore.xmi_*.jar") DO SET JAR_EMF_XMI=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.xtext_2*.jar") DO SET JAR_XTEXT=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.xtext.util_*.jar") DO SET JAR_XTEXT_UTIL=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.xtext.common.types_*.jar") DO SET JAR_XTEXT_TYPES=%%i
FOR %%i IN ("%ECLIPSE%\com.google.guava_*.jar") DO SET JAR_GUAVA=%%i
FOR %%i IN ("%ECLIPSE%\com.google.guava.failureaccess_*.jar") DO SET JAR_GUAVA_FA=%%i
FOR %%i IN ("%ECLIPSE%\com.google.inject_*.jar") DO SET JAR_INJECT=%%i
FOR %%i IN ("%ECLIPSE%\jakarta.inject*.jar") DO SET JAR_JAKARTA=%%i
FOR %%i IN ("%ECLIPSE%\javax.inject_*.jar") DO SET JAR_JAVAX=%%i
FOR %%i IN ("%ECLIPSE%\org.apache.log4j_*.jar") DO SET JAR_LOG4J=%%i
FOR %%i IN ("%ECLIPSE%\org.antlr.runtime_3*.jar") DO SET JAR_ANTLR3=%%i
FOR %%i IN ("%ECLIPSE%\org.antlr.runtime_4*.jar") DO SET JAR_ANTLR4=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.runtime_*.jar") DO SET JAR_CORE_RUNTIME=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.equinox.common_*.jar") DO SET JAR_EQUINOX=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.acceleo.engine_*.jar") DO SET JAR_ACCELEO_ENGINE=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.acceleo.common_*.jar") DO SET JAR_ACCELEO_COMMON=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.acceleo.model_*.jar") DO SET JAR_ACCELEO_MODEL=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.ocl_*.jar") DO SET JAR_OCL=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.ocl.common_*.jar") DO SET JAR_OCL_COMMON=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.ocl.ecore_*.jar") DO SET JAR_OCL_ECORE=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.equinox.registry_*.jar") DO SET JAR_EQUINOX_REGISTRY=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.jobs_*.jar") DO SET JAR_CORE_JOBS=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.contenttype_*.jar") DO SET JAR_CORE_CONTENTTYPE=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.resources_*.jar") DO SET JAR_CORE_RESOURCES=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.expressions_*.jar") DO SET JAR_CORE_EXPRESSIONS=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.equinox.preferences_*.jar") DO SET JAR_EQUINOX_PREFERENCES=%%i
FOR %%i IN ("%ECLIPSE%\lpg.runtime.java_*.jar") DO SET JAR_LPG_RUNTIME=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.acceleo.parser_*.jar") DO SET JAR_ACCELEO_PARSER=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.acceleo.query_*.jar") DO SET JAR_ACCELEO_QUERY=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.filesystem_*.jar") DO SET JAR_CORE_FILESYSTEM=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.core.commands_*.jar") DO SET JAR_CORE_COMMANDS=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.osgi_*.jar") DO SET JAR_OSGI=%%i
FOR %%i IN ("%ECLIPSE%\org.eclipse.osgi.util_*.jar") DO SET JAR_OSGI_UTIL=%%i
FOR %%i IN ("%ECLIPSE%\org.osgi.service.prefs_*.jar") DO SET JAR_OSGI_PREFS=%%i

REM Construire le classpath
SET CP=org.example.airflow.generator\bin
SET CP=%CP%;org.example.pipelinedefinition\bin
SET CP=%CP%;org.example.airflowpipeline\bin
SET CP=%CP%;org.example.pipelinedsl\bin
SET CP=%CP%;%JAR_EMF_ECORE%
SET CP=%CP%;%JAR_EMF_COMMON%
SET CP=%CP%;%JAR_EMF_XMI%
SET CP=%CP%;%JAR_XTEXT%
SET CP=%CP%;%JAR_XTEXT_UTIL%
SET CP=%CP%;%JAR_XTEXT_TYPES%
SET CP=%CP%;%JAR_GUAVA%
SET CP=%CP%;%JAR_GUAVA_FA%
SET CP=%CP%;%JAR_INJECT%
SET CP=%CP%;%JAR_JAKARTA%
SET CP=%CP%;%JAR_JAVAX%
SET CP=%CP%;%JAR_LOG4J%
SET CP=%CP%;%JAR_ANTLR3%
SET CP=%CP%;%JAR_ANTLR4%
SET CP=%CP%;%JAR_CORE_RUNTIME%
SET CP=%CP%;%JAR_EQUINOX%
SET CP=%CP%;%JAR_ACCELEO_ENGINE%
SET CP=%CP%;%JAR_ACCELEO_COMMON%
SET CP=%CP%;%JAR_ACCELEO_MODEL%
SET CP=%CP%;%JAR_OCL%
SET CP=%CP%;%JAR_OCL_COMMON%
SET CP=%CP%;%JAR_OCL_ECORE%
SET CP=%CP%;%JAR_EQUINOX_REGISTRY%
SET CP=%CP%;%JAR_CORE_JOBS%
SET CP=%CP%;%JAR_CORE_CONTENTTYPE%
SET CP=%CP%;%JAR_CORE_RESOURCES%
SET CP=%CP%;%JAR_CORE_EXPRESSIONS%
SET CP=%CP%;%JAR_EQUINOX_PREFERENCES%
SET CP=%CP%;%JAR_LPG_RUNTIME%
SET CP=%CP%;%JAR_ACCELEO_PARSER%
SET CP=%CP%;%JAR_ACCELEO_QUERY%
SET CP=%CP%;%JAR_CORE_FILESYSTEM%
SET CP=%CP%;%JAR_CORE_COMMANDS%
SET CP=%CP%;%JAR_OSGI%
SET CP=%CP%;%JAR_OSGI_UTIL%
SET CP=%CP%;%JAR_OSGI_PREFS%

java -cp "%CP%" org.example.airflow.generator.GenerateRunner %1 %2

if %ERRORLEVEL% EQU 0 (
    echo === Generation Python reussie! ===
    exit /b 0
) else (
    echo === Erreur ===
    exit /b 1
)
