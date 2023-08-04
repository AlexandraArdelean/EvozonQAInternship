package org.example.java_basics.for_loops;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();


//        calculator.printNumber(95);
//        System.out.println();
//        logicalOp.generateNumbers(95);
//        System.out.println();
//        logicalOp.printNumInterval(5,10);
//        System.out.println();
//        logicalOp.compareNumbersAndPrint(5,2);
//        System.out.println();
//        logicalOp.printNumbers();
        logicalOp.printOddNumbers();
        System.out.println();
        System.out.println("Suma numerelor este: " + logicalOp.calculateSumFromGivenNumber(98));
        System.out.println("Media numerelor este: " + logicalOp.calculateSumAndAverageFromGivenNumber(98));
        logicalOp.createPattern();
    }
}
