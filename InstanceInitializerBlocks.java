package learning.java.basics;

public class InstanceInitializerBlocks {
    // Instance Initializer blocks are stand alone blocks of code with curly brackets around the code but with no name
    // such as a method has. Instance initializer blocks are ran after static initializer blocks but before the
    // constructor/s run. Instance initializer blocks are coded in the class and not inside a method. Instance
    // initializer blocks are executed from top down so it does matter the location in the class for which Instance
    // initializer blocks are put. below is an example.

    // Why use an Instance initializer block? Initializer blocks, whether static or instance, are used for initializing
    // variables for anonymous classes. Anonymous classes do not have names and therefore can not use a constructor
    // to initialize their variables when creating an object of their class using the new keyword. See an example below.

    public final String FINAL_VAR;
    {
        // What else can you do with an initializer block? almost anything you can do in a method such as:
            // create local variables
            // interact with and assign values to static and instance variables
            // try-catch-finally blocks
            // conditional statements and loops
            // call methods

        // one thing you can not do is pass parameters to an initializer block like you can with a method.

        FINAL_VAR = "Can not change final fields and variables";


    }
}
