package learning.java.basics;

public class ArrayAndArrayList {
/*
    public static void main(String[] args) {

        // An array can be of any java type. once initialized the size must stay the same but individual elements can
        // be swapped out. when ever you see [] it means array. for example String[] thisIsAnArrayOfStrings; An array
        // can contain duplicates.Below are some various ways to create an array.

        // The below array is set to a size of 5 and all elements of the array set to their default value. for
        // primitives int byte, short and long the default value is 0, for primitives double and float this default
        // value is 0.0. for all objects and wrapper classes the default value is null. you will learn more about
        // primitives, object types and wrapper classes in a different tutorial. Below there are three ways to
        // declare and initialize an array.

        //declaration of type[] and array name. initialized with keyword new and a size of 5 (indexed as 0, 1, 2, 3, 4)
        int[] arrayName = new int[5];
        System.out.println(arrayName[0]);
        arrayName[0] = 123;
        System.out.println(arrayName[0]);

        //declaration of type and array name. initialized with the new keyword followed by the array elements.
        int[] arrayName2 = new int[] {100, 200, 300};
        // cycle through arrayName2 with an enhanced for loop. The enhanced for loop is covered in a separate tutorial
        for (int tempVar : arrayName2) {
            System.out.println(tempVar);
        }
        //System.out.println(arrayName2[0]);

        // Below is a quick and simple way creating an array. it is called an anonymous array.
        // declaration of type and the array name. then assigned the array elements which also gives the array
        // it's size.
        int[] arrayName3 = {10, 20, 30};
        for (int i = 0; i < arrayName3.length; i++ ) {
           System.out.println(arrayName3[i]);
        }

        //there are different statements to declare an array type. I use String[] stringArrayName. you can use the following
        // and get the same result.

        String[] stringArrayName1;
        String stringArrayName2[];
        String [] stringArrayName3;
        String stringArrayName4 [];

        // you can also declare more than one array at a time with the below syntax.
        String[] stringArrayName5, stringArrayName6;

        // Reference equality.All array type declarations are objects. even int[]. to declare a number using type int
        // is a primitive. Declaring an array int[] is an object. Object variables hold a reference to the object not
        // the object itself. You can use the equals() method to test whether 2 or more object variables reference
        // (or point) to the same object. see below.

        int[] intArrayName1 = {5, 15, 25};
        int[] intArrayName2 = intArrayName1;

        // The following will not print out the way you may expect.
        System.out.println(intArrayName1);
        System.out.println(intArrayName2);

        // The code below will properly print all elements of an array.
        System.out.println(java.util.Arrays.toString(intArrayName2));


        // The equals() method compares reference equality not element and size equality
        boolean tempBoolVar = intArrayName1.equals(intArrayName2);
        System.out.println(tempBoolVar);

        // Just some basic use of an array for learning and to get comfortable with them.
        String[] stringArray1= {"foo", "bar", "hello", " world"};

        // The length property starts its count at number 1 not 0 like an array index
        System.out.println(stringArray1.length);

        // Simple concatenation with a String[] array
        String stringVar = stringArray1[2] + stringArray1[3];
        System.out.println(stringVar);

        // Using the sort method
        int[] intPreSortArray = {2, 64, 5};
        System.out.println(java.util.Arrays.toString(intPreSortArray));

        // The sort method will reorganize the elements of your array but not change its size. You can replace
        // and reorganize array elements but you can not change the arrays size.

        // if needed, use the Array clone() method to capture the array before sorting. unlike Strings Arrays have
        // methods tha change or replace their elements but not the Arrays size. if you assign the array and do not use
        // the Arrays clone method you will only get a copy of the arrays reference (also known as pointer in some
        // programming languages)

        int[] testClone = intPreSortArray.clone();
        java.util.Arrays.sort(intPreSortArray);
        System.out.println(java.util.Arrays.toString(testClone));

        // below intPreSortArray is turned into a String assigned to intPostSortArrayAsString. intPostSortArrayAsString
        // is no longer an Array. java.util.Arrays.toString() is useful for testing code.
        String intPostSortArrayAsString = java.util.Arrays.toString(intPreSortArray);

        // The code below will give an error at compile time
        // System.out.println(intPostSortArrayAsString[1]);

        // The code below will compile and print.
        System.out.println(intPostSortArrayAsString);


        // Searching an array is done most commonly with the java.util.Arrays.binarySearch() method. you want to sort
        // the array first because searching unsorted arrays is unpredictable. If a match is found it will return the
        // index from 0 on up. When the element being searched for isnt thee the binarySearch() method will return a
        // negative number. to keep things simple the easiest wat to teach this is that when an element isnt found in
        // the sorted array the binarySearch() method will return a negative number pointing to where the element should
        // be. for example if an element in a sorted array isnt found but, if it was there, should be located at index
        // 0 binarySearch() will return a -1. it the item should be inserted at index 4 binarySearch() will return a -1.
        // lets take a look.

        String[] stringArrayToBeSearched = {"c", "a", "d", "e", "h", "j", "i", "g"};
        java.util.Arrays.sort(stringArrayToBeSearched);
        System.out.println(java.util.Arrays.toString(stringArrayToBeSearched));

        int regularIndex = java.util.Arrays.binarySearch(stringArrayToBeSearched, "d");
        System.out.println(regularIndex);
        int negativeIndex = java.util.Arrays.binarySearch(stringArrayToBeSearched, "b");
        System.out.println(negativeIndex);

        // You can also create multidimensional arrays. were going to take a look at a two dimensional array. Im going
        // to keep it simple and show you the best practice in creating a two dimensional array.

        String[][] multiDimen2DArray = {{"str1", "str2"},{"str3", "str4", "str5"}, {"str6"}};

        // lets print out one element of the 2D array multiDimen2DArray.

        System.out.println(multiDimen2DArray[1][0]);

        // if you just want to declare a multidimensional 2D array and assign values at a later time you can use the
        // following code to give you the same 2D array as above but with elements having default values of null.

        String[][] multiDimen2DArray2 = new String[3][];
        multiDimen2DArray2[0] = new String[2];
        multiDimen2DArray2[1] = new String[3];
        multiDimen2DArray2[2] = new String[1];

        // lets print out one element of the 2D array multiDimen2DArray2. we will get the default null value given
        // to newly created objects which are not yet assigned values.

        System.out.println(multiDimen2DArray2[1][0] + "\n\n");

        // lets do a quick and simple for loop.
        for (int i = 0; i < multiDimen2DArray.length; i++) {
            for (int j = 0; j < multiDimen2DArray[i].length; j++){
                System.out.println(multiDimen2DArray[i][j]);
            }
            // lets not print out the line after the last String in the 2D array.
            if (!(i == multiDimen2DArray.length - 1))
            System.out.println("__________________________________");
        }
        //


    }  */
}
