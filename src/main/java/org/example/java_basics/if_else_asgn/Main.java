package org.example.java_basics.if_else_asgn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum result= " + calculator.sum(15, 20));
        System.out.println("Subtract result= " + calculator.subtract(15, 8));
        System.out.println("Multiply result= " + calculator.multiply(15, 3));
        System.out.println("Divide result= " + calculator.divide(15, 2));

        LogicalOp logicalOp = new LogicalOp();
        System.out.println("Bigger number is: " + logicalOp.checkBiggerNumber(3, 20));
        System.out.println(logicalOp.compareStrings("Evozon"));
        System.out.println(logicalOp.compareStrings("blabla"));
        System.out.println(logicalOp.printMessage("lalala", 3));
        System.out.println(logicalOp.printMessage("Evozon", 3));
        System.out.println(logicalOp.printMessage("Evozon", 9));
        System.out.println(logicalOp.printWeatherForecast(10));
        System.out.println(logicalOp.printNumber(2));
        System.out.println(logicalOp.isNumberEven(23));
        System.out.println(logicalOp.isEligibleToVote(19));
        System.out.println(logicalOp.greaterNumber(3,5,10));




    }
}
