package learning.java.basics;

public class StringAndStringBuilder {

    // Through out this and other Caffinated Programmer tutorials you will see various was of coding the same topic
    // and achieving the same results. This is done purposely to maximize your learning experience so that you know your
    // options.


    // Strings are immutable which means they cant be changed once initialized (assigned a value). So when you see
    // ABC2 += ARG; in method runString1 you are seeing a complete reassignment of "abcfoo" to the variable ABC2 not an
    // actual append.

    // The class String is special and does not need the new keyword to create a reference type. below are two ways to
    // declare, initialize, and instantiate a String reference type. The below code does the same thing except for the
    // String created using the literal ("foo") gets stored in something called the String pool or Intern pool. The
    // String "foo" created using the new keyword will not be equal to the String literal using the equality operator
    // and will also not be placed in the String pool. see below and method runString2. String objects are made by
    // enclosing the value with double quotes for example "text" or "454". Strings are stored in a private final char[]
    // array that is declared in in Java's String class. None of the String class methods add, remove or change the
    // characters in the private final char[] array. String object methods return a new String object not a modified
    // string object. find out more about arrays and arrayLists in the Array and ArraysList tutorial here on The
    // Caffinated Programmer youtube channel. As you go on through these Caffinated Programmer Java tutorial series
    // you'll understand more and more of how the java language works.

    String stringLiteral = "foo";
    String stringUsingNewKeyword = new String("foo");

    String ABC2 = "abc";
/*
    public static void main(String[] args) {

        StringAndStringBuilder SASB = new StringAndStringBuilder();
        //below we pass a parameter to method runString2
        SASB.runString1("foo");
        //below no parameter is passes
        SASB.runString2();
        //below we pass a parameter and the result gets returned as type String
        String returnedSubstring = SASB.runString3("literalString");
        System.out.println(returnedSubstring);

        // The length() method returns how many characters are in the String.
        if (returnedSubstring != null) {
            System.out.println(returnedSubstring.length());
        }
        // The contains() method takes a String value and finds matches anywhere in the String. contains() is case
        // sensitive and returns a boolean value.
        System.out.println(returnedSubstring.contains("er"));
        System.out.println(returnedSubstring.contains("ER"));

        // Moving on. The replace() method takes a single character done with single quotes or a String value with
        // the usual double quotes which is what we'll use. replace() returns the new String value.
        System.out.println(returnedSubstring.replace("e", "EE"));
        System.out.println(returnedSubstring.replace("er", "P"));

        // calling method chaining example runString4

        System.out.println(SASB.runString4());

        //Usinf indexOf() method
        // int indexOf(String CharacterOrStringToFind) or int indexOf(String CharacterOrStringToFind, int StartingIndex)

        System.out.println(SASB.ABC2.indexOf("b"));



    }

*/

    // notice the return type on the method below is specified as void which means the method will not be returning
    // anything.

    public void runString1(String ARG) {
        // the below concatenation is not appended but a complete reassignment of "abcfoo" to variable ABC2. The rules
        // for concatenation are as follows. 1) The expression is assessed from left to right. 2) if both operands are
        // numeric then the + means mathematical addition. 3) if either operand is a String then + means concatenation.
        ABC2 += ARG;
        System.out.println(ABC2);
        //The above is the same as using the concat() method seen below:
        String localVarABC3 = "Testing 123";
        System.out.println(localVarABC3);
        localVarABC3 = localVarABC3.concat(" using the concat() method");
        System.out.println(localVarABC3);
    }

    public void runString2() {
        if (stringLiteral == stringUsingNewKeyword) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    /*
        Lets take a look at some common methods and see how they behave. Since were on the topic I'll start with the
        built in String object equals method. The String object equals method will compare the text inside a String
        field or variable regardless of whether the String was created with a literal assignment or using the new
        keyword. see the code below.

        There is also a method names equalsIgnoreCase() which ignores the case of the values being compared.

     */
        System.out.println(stringLiteral.equals(stringUsingNewKeyword));


    }

    // Next lets go to the String object substring method which returns a specified section of a string as a new string.
    // The first
    // parameter is the index position to start at. An optional second parameter tells the substring method what index
    // position to stop at but not include. If only one index position is passed as a parameter to the substring method
    // it will return a
    // new String starting from
    // the given index position and go all the way on to the end of the string we're calling the substring method on.
    // notice below we are using a return type of string and not void.

    public String runString3(String tempString) {
        //String tempString = "literalString";
        return tempString.substring(1,7);

    }
// method chaining is the process of calling multiple methods one String right after the other on a String. below is an
// example.

    public String runString4() {

        String methodChainingExample = "  method Chaining On Literal String  ".trim()
                .replace("On ", "").toLowerCase().substring(7);
        return methodChainingExample;
    }



// Below are other commonly used String methods and their signature. Some of the below methods have
// multiple method signatures; I list the signatures most used.

// String trim() gets rid of every kind of white space at the beginning and end of the String. trim() does not
// get rid of white space in between the characters that make up the String.
// char charAt(int index) The charAt() method throws an exception if the given index does not exist.
// int indexOf(String stringToFind) or int indexOf(String stringToFind, int startAtIndex) The indexOf method returns



// -1 if no match is found.
// String toLowerCase() returns the string its called on in all lower case.
// String toUpperCase() returns the string its called on in all upper case
// boolean equalsIgnoreCase(String stringToCompare) returns true or false and compares strings but ignores their case
// boolean startsWith(String prefix) returns true or false
// booleans endsWith(String suffix) returns true or false

//StringBuilder - To keep things simple you can think of StringBuilder as a mutable String. StringBuilder does not use
// the String pool. since StringBuilder is mutable it has methods that modify the StringBuilder text in place instead
// of always returning a new String. lets dive in.


}
