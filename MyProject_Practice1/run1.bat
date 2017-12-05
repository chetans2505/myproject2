set projectLocation=D:\chet1\MyProject_Practice1
cd %projectLocation%
set classpath=%projectLocation%\target\test-classes;%projectLocation%\libs/*
java org.testng.TestNG %projectLocation%\testng.xml
pause