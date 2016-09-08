REM
REM This script creates and run the pf4j demo.
REM

REM create artifacts using maven
call mvn clean package

REM create demo-dist folder
rmdir demo-dist /s /q
mkdir demo-dist
mkdir demo-dist\plugins

REM copy artifacts to demo-dist folder
xcopy app\target\pf4j-demo-app-*.zip demo-dist /s /i
xcopy plugins\plugin3\target\pf4j-demo-plugin3-*.zip demo-dist\plugins /s
xcopy plugins\plugin4\target\pf4j-demo-plugin4-*.zip demo-dist\plugins /s

cd demo-dist

REM unzip app
unzip pf4j-demo-app-*.zip
del pf4j-demo-app-*.zip

REM run demo
java -jar pf4j-demo-app-1.2.0-SNAPSHOT.jar
cd ..