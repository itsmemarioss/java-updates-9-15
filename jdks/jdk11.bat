@echo off
echo Setting JAVA_HOME
set JAVA_HOME=C:\Program Files\Java\jdk-11.0.9
echo setting PATH
set PATH=%JAVA_HOME%\bin;%PATH%
echo Display java version
java -version