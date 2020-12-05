package learning.java.basics;

public class StringAndStringBuilder2 {

    // Create a StringBuilder object below by using the new keyword. Methods charAt(), indexOf, length() and
    // substring() behave the same as they do with a String.

    StringBuilder StringBuilderObject = new StringBuilder("newStringBuilder");
    StringBuilder moreVerboseWay;
/*
    public static void main(String[] args) {

        StringAndStringBuilder2 SASB2 = new StringAndStringBuilder2();

       // Screen capture software test

        // The following popular StringBuilder methods append(), delete(), deleteCharAt(), insert(), and
        // reverse() all return a reference to the StringBuilder being called on. The toString() method returns
        // an immutable String of the StringBuilder object that toString is being called on. StringBuilder objects are
        // made by enclosing the value with double quotes. for vor example "text" or "454".


        // Append text to StringBuilder object without having to reassign the result
        SASB2.StringBuilderObject.append("Text");
        System.out.println(SASB2.StringBuilderObject);

        //StringBuilder delete(int Begin, int stopAtButNotInclude)
        System.out.println(SASB2.StringBuilderObject.delete(16, 19));

        // StringBuilder deleteCharAt(int index)
        SASB2.moreVerboseWay = SASB2.StringBuilderObject.deleteCharAt(16);
        System.out.println(SASB2.moreVerboseWay);

        //StringBuilder insert(int offset, String TextToInsert)
        //Below localVar is booth declared and assigned.
        //insert() will also append if you use one index past the last character but any more that that will throw an
        // exception.
        StringBuilder localVar = SASB2.StringBuilderObject.insert(15, "Text2");
        System.out.println(localVar);
        localVar = SASB2.StringBuilderObject.insert(21, "Text3");
        System.out.println(localVar);

        // The reverse() method takes no arguments and reverses the all the characters in the StringBuilder object and
        // returns a reference to the StringBuilder object.
        // StringBuilder reverse()
        System.out.println(localVar.reverse());
        // lets put everything back to normal.
        System.out.println(localVar.reverse());

        // the toString method changes the mutable StringBuilder object into an immutable String object.
        // A String is just an array of characters.
        // toString()
        String convertIntoString; //declaration
        convertIntoString = localVar.toString(); //initialize
        System.out.println(convertIntoString);

        // Method chaining with StringBuilder
        StringBuilder localVar2 = new StringBuilder("method chaining");
        String localVar3 = localVar2.append(" appended").insert(7, "inserted ").replace(0, 3,
                "StringBuilder").toString();
        System.out.println(localVar3);
        //unable to compare the contents using equals() method or == of a String to a StringBuilder. ??
        System.out.println(localVar2.equals(localVar3));


// Since StringBuilder is mutable chaining StringBuilder objects changes it's own value and then returns a reference to
// itself.

    }
    */

}
