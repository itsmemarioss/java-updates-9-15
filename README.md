# Java Language Updates: from 9 to 15

This project contains code samples of java new features.

You can find a presentation about this topic [here](https://docs.google.com/presentation/d/1A5XRaXkqLmfR8I7aSL53RhHox_-9ZBJhBAFpVoinGxk/edit?usp=sharing).

## How to compile and run

In order to compile and run the classes you will need to use JDK 15.

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