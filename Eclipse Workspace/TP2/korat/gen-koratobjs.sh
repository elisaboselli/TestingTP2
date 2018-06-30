#!/bin/bash

# Software Under Test Classpath: Modify it to suit your own config! 
SUT_CP=../bin/
# Korat, libs and SUT
CP=korat.jar:./lib/alloy4viz.jar:./lib/commons-cli-1.0.jar:./lib/javassist.jar:./lib/junit.jar:$SUT_CP

java -noverify -cp $CP korat.Korat --class ejercicio2.cachelist.NodeCachingLinkedList --args 1,1,0,0 --visualize

