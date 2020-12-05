package learning.java.basics;

// import java.util.*  is one way to import ArrayList along with all the other classes in java.util. or you can
// import just the ArrayList class itself as below. BTW Java does not take a performance hit when importing all
// classes in java.util as above. but for this tutorial I will just import the ArrayList class.
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayAndArrayList2 {

    ArrayList<Integer> AL4_Integer; //= new ArrayList<>();
    //AL3_Integer.add(400);
    //AL3_Integer.add(500);
    //AL3_Integer.add(600);
    ///AL3_Integer.add(700);



/*
    public static void main(String[] args){

        // With an ArrayList you can change it's size as often as needed. An ArrayList allows duplicates just as an
        // array does. ArrayList methods usually change the actual ArrayList itself and then returns a reference
        // (called a pointer in various programming languages) to the object in memory --??--##--. compared to array
        // methods which would return a copy of the array with the new changes. in order to use an ArrayList you must
        // import the ArrayList class as done aboce after the package declaration. You will learn more about packages
        // and imports in a different tutorial.

        // The below will create an ArrayList. there are other ways from older versions of java but for now lets use the
        // following way.
        ArrayList<Integer> AL1_Integer = new ArrayList<>();
        // below we use the add() method to build our ArrayList. add() signature is boolean add(E element). Don't worry
        // the add method will always return true the E element you see is part of java generics which is covered in a
        // different tutorial. To be brief the E stands for the type of the ArrayList. In this case Integer. add() will
        // only allow you to add, in this case, Integer values.
        AL1_Integer.add(100);
        AL1_Integer.add(200);
        AL1_Integer.add(300);

        // lets try adding a String. you will get a compile time error.
        // AL1_Integer.add("foo"); If the type was Object then you could add anything except for primitives.


        // Lets copy one array list to another.
        ArrayList<Integer> AL2_Integer = new ArrayList<>(AL1_Integer);
        System.out.println(AL2_Integer.toString());
        // elements, sequence, and size are equal
        System.out.println(AL1_Integer.equals(AL2_Integer));

        // An older way of creating an ArrayList is below. you can add any type you want to this ArrayList.
        ArrayList AL_AllTypes = new ArrayList();
        AL_AllTypes.add(5);
        AL_AllTypes.add(Boolean.TRUE);
        AL_AllTypes.add("text");
        System.out.println(AL_AllTypes.toString());

        // you can also copy this ArrayList as shown below.
        ArrayList AL2_AllTypes = new ArrayList(AL_AllTypes);
        System.out.println(AL2_AllTypes.toString());
        // When you copy an array the above way you make a copy of the entire ArrayList not just a reference to the
        // original ArrayList. To prove this see the code below. We remove the boolean true value from the copied list
        // then we print the original ArrayList then the copied ArrayList. See how the original ArrayList still has
        // The boolean value in it but the copied ArrayList does not.

        // The remove() method has 2 signatures. remove() method signatures are boolean remove(Object obj) will remove
        // the first matching element and method signature E remove(int index) will remove the value at a specified
        // index. The E return type is the value that got removed.
        System.out.println(AL2_AllTypes.remove(Boolean.TRUE));
        System.out.println(AL_AllTypes.toString());
        System.out.println(AL2_AllTypes.toString());
        // elements, sequence, and size are not equal
        // equals() method for ArrayList checks to see if the same elements are in the same order.
        // method signature boolean equals(Object obj)
        System.out.println(AL_AllTypes.equals(AL2_AllTypes));
        System.out.println(AL2_AllTypes.remove(0));
        System.out.println(AL2_AllTypes.toString());

        // The set() method signature is E set(int index, E newValue) The set() method will swap out the current value
        // at the given index in set() with the newValue value. the set() method will not affect the size of the
        // ArrayList.

        System.out.println(AL2_Integer.set(0, 400));
        System.out.println(AL2_Integer.toString());

        // Two simple methods regarding the size of the ArrayList are size() method and isEmpty() method. the signatures
        // int size() and boolean isEmpty(). lets check if our AL2_Integer ArrayList is empty and if not lets get the
        // size of it.

        if (!AL2_Integer.isEmpty()) {
            System.out.println(AL2_Integer.size());
        } else {
            System.out.println("AL2_Integer is empty!");
        }

        // lets try this again with the clear() and is isEmpty() methods but this time lets make the code reusable by
        // putting it in a method.
        ArrayList<Integer> AL3_Integer = new ArrayList<>();
        AL3_Integer.add(400);
        AL3_Integer.add(500);
        AL3_Integer.add(600);
        AL3_Integer.add(700);
        // The clear() method removes all elements from the ArrayList
        // method signature void clear()
        AL3_Integer.clear();


        ArrayAndArrayList2 AAAL2 = new ArrayAndArrayList2();
        AAAL2.AL4_Integer = new ArrayList<>();
        AAAL2.AL4_Integer.add(800);
        AAAL2.checkIfEmpty(AL3_Integer);
       // AAAL2.AL4_Integer = new ArrayList<>();
       // AAAL2.AL4_Integer.add(800);
        //contains() method checks if a value is in the ArrayList
        //method signature contains(Object obj)
        System.out.println(AAAL2.AL4_Integer.contains(800));


        // Sorting an ArrayList
        ArrayList<Integer> ALNumberSort = new ArrayList<>();
        ALNumberSort.add(5);
        ALNumberSort.add(10);
        ALNumberSort.add(22);
        ALNumberSort.add(43);
        ALNumberSort.add(1);
        Collections.sort(ALNumberSort);
        System.out.println(ALNumberSort);

        // Converting an ArrayList to an array
        ArrayList<String> ALStringToArray = new ArrayList<>();
        ALStringToArray.add("zero");
        ALStringToArray.add("one");
        ALStringToArray.add("two");
        ALStringToArray.add("three");
        ALStringToArray.add("four");
        // toArray() defaults to class Object. To get toArray() to convert to a String array we must type in
        // new String[0] as the toArray() parameter. What this does is create a new String array with 0 size. this way
        // Java will take care of creating the size needed to create the new String array from the ArrayList.
        String[] stringArray = ALStringToArray.toArray(new String[0]);
        System.out.println(java.util.Arrays.toString(stringArray));
        System.out.println(stringArray.length);

        // An array backed List. When you create an array and assign it to a List it is called an array backed List
        // An array backed List is a fixed size array and List; the elements of the list can change and when the
        // elements of the List do change this change is also reflected in the array that was assigned to a List and
        // vice versa. The size of the List and the array can not change.
        String[] stringArray2 = {"I", "love", "to", "code"};
        java.util.List<String> ArrayBackedList = java.util.Arrays.asList(stringArray2);
        System.out.println(java.util.Arrays.toString(stringArray2));
        ArrayBackedList.set(0, "we");
        stringArray2[1] = "like";
        System.out.println(ArrayBackedList);
        System.out.println(Arrays.toString(stringArray2));
        // the below will an Exception
        // ArrayBackedList.add("all of the time");
        // there is no add() for stringArray2 but you can still concatenate
        stringArray2[3] += " all of the time!";
        System.out.println(java.util.Arrays.toString(stringArray2));
        System.out.println(ArrayBackedList);




    }

    */

   // ArrayList<Integer> AL1_Integer = new ArrayList<>();
   // boolean AL1_Integer.add(100);
   // ArrayList<Integer> AL3_Integer = new ArrayList<>();



    public void checkIfEmpty(ArrayList AL_AsMethodParameter) {
        if (!AL_AsMethodParameter.isEmpty()) {
            System.out.println(AL_AsMethodParameter.size());
            //this.AL4_Integer.add(1000);
            //System.out.println(this.AL4_Integer.toString());
        } else {
            System.out.println(AL_AsMethodParameter + " is empty!");
            this.AL4_Integer.add(1000);
            System.out.println(this.AL4_Integer.toString());
        }
    }
}
