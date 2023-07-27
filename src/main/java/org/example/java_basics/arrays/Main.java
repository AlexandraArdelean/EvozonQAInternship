package org.example.java_basics.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();

        // exercise1 - methods polymorphism
        System.out.println("Exercise 1");
        System.out.println(calculator.sum(15, 2));
        System.out.println(calculator.sum(15.5, 2));
        System.out.println(calculator.sum(2.3, 13.9));

        System.out.println(calculator.subtract(15, 3));
        System.out.println(calculator.subtract(12.2f, 5));
        System.out.println(calculator.subtract(15, 2.3f));

        System.out.println(calculator.divide(12, 10));
        System.out.println(calculator.divide(33, 5.3));
        System.out.println(calculator.divide(15, 8.3f));

        System.out.println(calculator.multiply(2.2, 3));
        System.out.println(calculator.multiply(15, 2, 4));


//        //exercise2
        System.out.println("Exercise 2");
        logicalOp.populateArray();

        // exercise3
        System.out.println("Exercise 3");
        int[] array = new int[50];
        System.out.println(Arrays.toString(logicalOp.populateArray(array)));

        //exercise 4
        System.out.println("Exercise 4");
        int[] array2 = new int[100];
        logicalOp.populateArray(array2);
        System.out.println(logicalOp.calculateArrayAverage(array2));

        //exercise 5
        System.out.println("Exercise 5");
        String[] myStringArray= new String[]{"Ana", "are", "mere", "si", "multe", "pere"};
        System.out.println(logicalOp.searchStringInArray(myStringArray, "Mere"));

        //exercise 6
        System.out.println("Exercise 6");
        int[] myArray = {15,6,22,4,11,255};
        int numToFind = 6;
        System.out.println("The position of number " + numToFind + " in array is "
                + logicalOp.returnNumberPositionFromArray(myArray, numToFind));

        //exercise 7
        System.out.println("Exercise 7");
        logicalOp.createPrint(7,7);

        //exercise 8
        System.out.println("Exercise 8");
        System.out.println(Arrays.toString(logicalOp.printArrayWithoutGivenNumber(myArray, 4)));

        //exercise 9
        System.out.println("Exercise 9");
        System.out.println("Second smallest number from array is: " + logicalOp.printSecondSmallerNumberFromArray(myArray));


        //exercise 10
        System.out.println("Exercise 10");
        int[] initialArray = {17,61,88,14,22,36,15};
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        int[] copiedArray = new int[initialArray.length];
        logicalOp.copyFromGivenArray(initialArray,copiedArray);
        System.out.println("Copied array is: " + Arrays.toString(copiedArray));


    }



}
