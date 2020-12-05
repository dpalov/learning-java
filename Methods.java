package learning.java.basics;

public class Methods {


    //static {final int FOOBAR = 777;}
 /*  public Methods(){

        final int FOOBAR = 777;

        StringBuilder tempStringBuilder = new StringBuilder();
        tempStringBuilder.append("one").append("two").append("three");
    } */

    //int intPrimativeVar = 7;


    // The below main() method is an example of a method declaration. just the top line by itself is an example of a
    // method signature    static void main(String[] args)
    /*
    public static void main(String[] args){
        System.out.println("World Hello!");
    // public is an access modifier. a public method can be called from any class and method. there is also default
    // Access otherwise known as package private which means that the method can only be called from classes in the same
    // package. to declare a method default access you just omit the access modifier and it will be assumed default
    // access. Similar to default access is protected access which the method can be called from classes within the
    // same package or subclasses. last is private which means the method can only be called from within the same class.

    // onto non-access modifiers also called specifiers which are optional. you can have multiple non-access modifiers.
    // static is the most common and is used for class methods and stay alive until the program ends. static methods
    // are called using their full class name such as java.util.Arrays.toString() and also if their class is an
    // instatiated object someObject.someStaticClassMethod(). non-access modifier abstract is used when there is no
    // method body and just a method signature. The non-access modifier final used when you do not want a method to be
    // overridden by a subclass. non-access modifier synchronized controls thread access to a method through a monitor
    // which is a mutually exclusive lock. non-access modifier native is used to declares that a method will be
    // implemented in another programming language. non-access modifier strictfp is used in mathematical floating point
    // programming.

        int assignedTheReturnType = Methods.methodWithReturnType();
        System.out.println(assignedTheReturnType);

        Methods methods = new Methods();

        int returnedValue = methods.instanceReturnMethod(methods.intPrimativeVar);
        System.out.println(returnedValue);

        // System.out.println(Methods.FOOBAR);
     // __________________________________________________________________________________________________
     int numTemp1 = methods.methodUsingVarags(2, 3, 1, 4, 5, 6);
     System.out.println(numTemp1);

     staticCallToSimpleInstanceMethod();

     valueToBePassed = passByValuePrimitiveMethod(valueToBePassed);
     System.out.println(valueToBePassed);

     StringBuilder tempStringBuilder = new StringBuilder();
     tempStringBuilder.append("one").append("two").append("three");
     PassByValueReferenceMethod(tempStringBuilder);

     new Methods().happyMethod("super");

    }
    */

    // Methods have whats called a return type. The main() method has a return type of void and the method below has a
    // return type of int. when a method has a return type other than void the method is required to have a return
    // statement in the method body; usually the last statement in the method body. if you have an if else within the
    // method you may have a return statement at the end of the if and also a return statement in the else.
    public static final int methodWithReturnType() {
        int tempVar = 6;
        return tempVar;
    }
    // When the return type is a primative the actual value of the variable is returned. If the return type is an Object
    // the reference (called a pointer in some programming languages) to the object is returned. when the value of the
    // the variable returned is a primitive, such as an int, a copy of the variable passed in as a method parameter is
    // returned
    int intPrimativeVar = 11;

    public int instanceReturnMethod(int primitiveVar)  {
        if(primitiveVar <= 10) {
            // same as primitiveVar + 1
            return ++primitiveVar;
        }
        else {
            // same as primitiveVar - 1
            return --primitiveVar + this.intPrimativeVar;
        }
    }
    //int intPrimativeVar = 7;

    // Naming a method. a method name can be numbers, letters, _, and $. the first character can not be a number. also
    // reserved words/keywords can not be used. most java coders lowercase the first letter of the method name then
    // cammal case from there on. example someValidMethodName()
    // also public th_32$() is a valid method name

    // Method Parameters. A Parameter is not necessary.
    public void noParameter() {
        // do something
    }

    // if you have multiple parameters they need to be separated by commas.
    public int methodWithParameters(int num1, int num2){
        // below is the method body. a method body is coded in between the starting and ending curly braces {}
        int addedSum = num1 + num2;
        return addedSum;
    }
    // Using Varargs (Variable arguments) as a parameter. Varargs can be used with other parameters as long as the
    // Varargs are the last parameter. Vararg can also be used by itself. what signifies that there is a vararg as
    // a parameter is three periods in a row at the end of a type declaration. a vararg parameter is used within the
    // method as an array would be used. see below.
    public int methodUsingVarags(int num1, int num2, int... varargParameter ) {
        for (int arg:varargParameter) {

            System.out.println(arg + (num1 + num2));
        }
        return varargParameter[0];
    }

    // Methods and Access Modifiers. public - method can be called from all classes, default (AKA package-private) -
    // method can be called from the same class (like private) and classes in the same package. The way you specify
    // default access is to have no access modifier stated, protected - method can be called like default access plus
    // in a subclass, private - method can be called only from inside the same class.

    // static methods. how to create them and use them. static methods do not need an instance of a class to be used.
    // static methods are called using their full class name or their class instance name and static method name
    // //or just
    // //the static method name if being
    // //called from within an instance of the class the static method is in.
    // static methods last as long as the program is running when being called not from within an instance but their
    // full class name.
    // // When a static memeber is in an instance of a class
    // A static method can not call an instance method or use an instance variable unless you instantiate the object
    // holding the instance methods and variables first.

    // First lets create a simple instance method
    public int simpleInstanceVariable = 22;
    public void simpleInstanceMethod(int simpleParameter){
        System.out.println(simpleParameter);
    }
    public static void staticCallToSimpleInstanceMethod() {
        // instantiate Methods class as an object
        Methods tempMethodsInstance = new Methods();//.simpleInstanceMethod(44);
        // or implement simpleInstanceMethod() as an instance method
        // Methods tempMethodsInstance = new Methods().simpleInstanceMethod(44);
        // java checks for the type and not the object itself. The following only works with static members (methods
        // and fields) see below.
        // tempMethodsInstance = null;
        System.out.println(tempMethodsInstance.simpleInstanceVariable);
        tempMethodsInstance.simpleInstanceMethod(tempMethodsInstance.simpleInstanceVariable);
    }

        // Java methods use Pass by Value which means the method receives a copy of the value passed via method
        // parameters. lets first take a look at passing a primitive to method which changes the passed in value. we
        // are going to use a static method so that we don't having to keep instantiating the method class. The results
        // using a static method and a instance method are the same.
        public static int valueToBePassed = 100;
        public static /* void */ int passByValuePrimitiveMethod(int passByValueParameter){
            passByValueParameter += 6;
            // now if we add a return type and pass back out and reassign the change to passByValueParameter we
            // will have the new value. we need to comment out void in the method signature and add int to take it's
            // place. we will assign the returned value in the main() method.

            return passByValueParameter;

    }
    // Lets try passing a reference to method using Pass by Value
  /*  {StringBuilder tempStringBuilder = new StringBuilder();
     tempStringBuilder.append("one").append("two").append("three");
    } */
    public static void PassByValueReferenceMethod(StringBuilder passByValueReferenceParameter){
        // if you assign a new object to the parameter being passed in it does not affect the value from outside this
        // method but using methods on the object that was passed in does affect the object outside this method.
           // passByValueReferenceParameter = new StringBuilder();
            passByValueReferenceParameter.append(4);
            passByValueReferenceParameter.append(5);
            passByValueReferenceParameter.append(6);
    }

    // method overloading. Method overloading takes place when the parameters of the method are changed. method
    // overloading is done when methods in the same class have the same name but different parameters. you can
    // everything else such as access modifier, return tpe, static or instance but unless the parameters are somehow
    // different java will see the two methods as duplicates. one thing to note is that when you have a parameter that
    // takes a single String[] array and another with the same name that takes a vararg string... array java sees these
    // two methods as the same since both are taking a single array. two methods below show overloading. Java is a
    // smart language and will know what overloaded method to call by the parameter (int of String) you pass into the
    // method.

    public void happyMethod(String stringVar1) {
        System.out.println("Im " + stringVar1 + " happy");
    }
    public void happyMethod(int intVar){
        System.out.println("on a happy scale of 1 to 10 i am a " + intVar);
    }


}
