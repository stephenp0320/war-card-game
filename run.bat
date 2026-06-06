@echo off
set FX_PATH=lib

javac --module-path %FX_PATH% --add-modules javafx.controls *.java
java --module-path %FX_PATH% --add-modules javafx.controls --enable-native-access=javafx.graphics War
