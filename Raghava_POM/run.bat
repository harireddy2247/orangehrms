set projectLocation=C:\Users\reddy\eclipse-workspace\Raghava_POM
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause