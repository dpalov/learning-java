package learning.java.basics;

public class StaticInitializerBlocks {
    // Static initializer blocks work the same as instance initializer blocks except the fields have the word static
    // in the declaration.

    public static final int STATIC_CONSTANT;

    static {
        STATIC_CONSTANT = 11;
    }
}
