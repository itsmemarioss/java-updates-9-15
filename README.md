# Java Language Updates: from 9 to 15

This project contains code samples of java new features.

You can find a presentation about this topic [here](https://docs.google.com/presentation/d/1A5XRaXkqLmfR8I7aSL53RhHox_-9ZBJhBAFpVoinGxk/edit?usp=sharing).

## How to compile and run

In order to compile and run the classes you will need to use JDK 15 or another one with compatible features.

## Switching between JDKs

You can use the commands under the folder `jdks` to switch between JDKs.

First you need to edit them to reflect your local configuration. You can also add them to you PATH environment variable.

### Java module

Compile

````
javac ^
modules/hello/module-info.java ^
modules/hello/com/itsmemario/hello/HelloWorld.java 
````

Run

````
java -p modules/hello -m com.itsmemario.hello/com.itsmemario.hello.HelloWorld
````

#### Compile preview features

````
javac --enable-preview --release 15 Records.java
````

Run 

````
java --enable-preview Records
````