#!/bin/bash
#arg1=$1
#arg2=$2
ARG1=3
ARG2=2
# Software Under Test Classpath: Modify it to suit your own config! 
SUT_CP=../bin/
# Korat, libs and SUT
CP=korat.jar:./lib/alloy4viz.jar:./lib/commons-cli-1.0.jar:./lib/javassist.jar:./lib/junit.jar:$SUT_CP
#java -noverify -cp $CP korat.Korat --class ejercicio2.cachelist.NodeCachingLinkedList --args $ARG1,$ARG2 --visualize 
java -noverify -cp $CP korat.Korat --class ejercicio2.cachelist.NodeCachingLinkedList --args $ARG1,$ARG2 --serialize "ej2.txt"


