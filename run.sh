#!/bin/bash
FX_PATH=$HOME/javafx-sdk-26/lib

javac --module-path $FX_PATH --add-modules javafx.controls *.java
java --module-path $FX_PATH \
     --add-modules javafx.controls \
     --enable-native-access=javafx.graphics \
     War
