## Object oriented programming

Small demo that shows some concepts of object oriented programming. Part of a presentation on this subject at work.

This project aims to provide a short and simple introduction of some OOP related concepts. The examples are quite trivial and only for illustrative purposes.

#### Usage

The repo contains the oop-demo/output dir, which has a zip file that has the code of this repo. Unzip and execute to get the results of the code in this repo. Java is required to run it. 

If you do not trust the above or if you want to take the code itself for a spin, you need to setup a few things.

#### Setup

The project uses gradle as a build tool. So you need both java and gradle installed to get it to work. If I may, I would like to suggest [sdkman](https://sdkman.io/) to help setup. Makes life quite easy.

Open a shell and install sdkman according to the [instruction](https://sdkman.io/install). 

Then install java (the java development kit, aka JDK):

```shell
sdk install java
```

You can specify your preferred java-distribution if you so desire. Then install gradle:

```shell
sdk install gradle
```

Now you are all setup! Refer to the [usage](https://sdkman.io/usage) of sdkman on how to change / update / remove installed stuff if you feel that is necessary.

Now you can run and build the project. Run simply means executing the code in the repo. Use the following command from the root dir of this repo:

```shell
./gradlew run
```

Build means building the application and archiving it in a zip or tar. The results will be placed in the oop-demo/build (and oop-demo/output) dirs. Use the following command to build, again from the root dir:

```shell
./gradlew build
```

(In case of Windows, use the **gradlew.bat** command instead)