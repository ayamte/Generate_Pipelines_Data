@echo off
REM Script avec TOUS les JARs Eclipse essentiels + core.runtime

SET WORKSPACE=%~dp0..\..\..\
SET ECLIPSE=C:\Users\User\Downloads\Ensias\Ensias\3A GL\eclipse-dsl-2025-09-R-win32-x86_64\eclipse\plugins

echo === Execution DSL2EMFTransformer ===
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

REM Construire le classpath
SET CP=org.example.pipelinedsl\bin
SET CP=%CP%;org.example.pipelinedefinition\bin
SET CP=%CP%;org.example.airflowpipeline\bin
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

java -cp "%CP%" org.example.pipelinedsl.transformation.DSL2EMFTransformer %1 %2

if %ERRORLEVEL% EQU 0 (
    echo === Transformation reussie! ===
    exit /b 0
) else (
    echo === Erreur ===
    exit /b 1
)
