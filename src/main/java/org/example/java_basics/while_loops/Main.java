package org.example.java_basics.while_loops;


public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        //exercise 1
        System.out.println("Exercise 1 ");
        logicalOp.printFromGivenNumber(80);
        System.out.println();

        //exercise 2
        System.out.println("Exercise 2");
        logicalOp.printNegativeNumbers(90);
        System.out.println();

        // exercise 3
        System.out.println("Exercise 3");
        logicalOp.printGivenNumbersInterval(5, 10);
        System.out.println();

        // exercise 4
        System.out.println("Exercise 4");
        logicalOp.printAscedingOrder(5, 1);
        System.out.println();
        logicalOp.printAscedingOrder(1, 5);
        System.out.println();

        //exercise 5
        System.out.println("Exercise 5");
        logicalOp.printEvenNumbers();
        System.out.println();
        //exercise 6
        System.out.println("Exercise 6");
        logicalOp.printOddNumbers();
        System.out.println();

        //exercise 7
        System.out.println("Exercise 7");
        logicalOp.calculateSumAndAverage();

        //exercise 8
        System.out.println("Exercise 8");
        System.out.println(logicalOp.calculateAverage(1, 14));

        //exercise 9
        System.out.println("Exercise 9");
        logicalOp.printFibonacciFirst20Numbers();
        System.out.println();

        //exercise 10
        System.out.println("Exercise 10");
        logicalOp.printMessageCozaWoza();

    }
}
