package learning.java.basics;

/*
This class focuses on miscellaneous java features:
static imports

 */
import java.util.List;
// if you created an asList() method in the Misc class the method created in the class would override the imported one.
// if you try importing two static methods with the same name or two static variables with the same name you will get a
// compiler error
import static java.util.Arrays.asList;

public class Misc {
    // static field (variables) declarations are ran first the same as static initializer blocks. they are ran in the
    // order they appear from top down.
    // test
    { System.out.println("block 1 instance"); }
    static {System.out.println("block 2 static");}

    public static void main(String[] stringParam){
        List<String>StaticImportList = asList("First value", "Second value");
        for (String item:StaticImportList){
            System.out.println(item);
        }

    Misc tempObject = new Misc();
    }
     { System.out.println("block 3 instance"); }

}
