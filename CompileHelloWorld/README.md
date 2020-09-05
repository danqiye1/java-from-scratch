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

## Next Steps

We will explore using a build system such as Gradle next.
