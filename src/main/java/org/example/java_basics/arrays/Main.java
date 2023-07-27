package org.example.java_basics.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();

        // exercise1 - methods polymorphism
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


        //exercise2
        logicalOp.populateArray();
        // exercise3
        int[] array = new int[101];
        System.out.println(Arrays.toString(logicalOp.populateArray(array)));

    }
}
