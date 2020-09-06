## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code. This project is also meant to help you understand how to compile Java programs manually without IDE support (learn Java the hard way).

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## Compiling Java Source Code Manually

The source folder contains one entry point Main.java and a package com.nothingistrue.App. To compile, run the following:

```bash
javac -cp src/ -d build/ src/Main.java
```

The argument `-cp` (classpath) links all packages in `src/` directory while the target is `src/Main.java`. We also specify that the output `-d` to be `build` directory.

## Packaging Java Classes into a Single Distributable jar

After compiling our Java source files into Java classes, we can distribute the code. While it is technically possible to distribute entire build/ folders as a zip, it is recommended practice to package everything into a jar file:

```bash
# From our build directory
jar cmf manifest.txt Hello.jar ./
```

The options `c` indicates we want to package a jar, `m` indicates we will supply a manifest file (in this case `manifest.txt`), `f` indicates we want to write to an output file (in this case `Hello.jar`) instead of stdout. The manifest file `manifext.txt` indicates what the entrypoint class is.

To execute the jar file, we can just use:
```bash
java -jar Hello.jar
```

Hello.jar can now be redistributed.

## Next Steps

We will explore using a build system such as Gradle next.
