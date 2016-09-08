#!/usr/bin/env bash

#
# This script creates and run the pf4j demo.
#

# create artifacts using maven
mvn clean package

# create demo-dist folder
rm -rf demo-dist
mkdir demo-dist
mkdir demo-dist/plugins

# copy artifacts to demo-dist folder
cp -r app/target/pf4j-*/* demo-dist/
cp plugins/plugin1/target/pf4j*.zip demo-dist/plugins/

# run demo
cd demo-dist
java -jar pf4j-*-SNAPSHOT.jar
cd -