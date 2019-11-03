#!/bin/bash
java -jar -Dspring.profiles.active=release sendo-0.0.1-SNAPSHOT.jar > log.txt 2>&1 &
