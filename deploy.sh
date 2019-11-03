#!/bin/bash

mvn package spring-boot:repackage -Dspring.profiles.active=release;
rsync -v -e ssh target/sendo-0.0.1-SNAPSHOT.jar tranngoc.khoa.spk@35.240.241.27:/home/tranngoc.khoa.spk/backend-sendo;
ssh tranngoc.khoa.spk@35.240.241.27;
cd /home/tranngoc.khoa.spk/backend-sendo;
java -jar sendo-0.0.1-SNAPSHOT.jar
