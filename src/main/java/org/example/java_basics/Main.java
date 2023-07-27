package org.example.java_basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Alexandra");
        System.out.println(15 + 25);
        System.out.println(10 / 3f);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        printMessage("Hello \nAlexandra");
        System.out.println("Sum result is: " + calculateSum(15, 25));
        System.out.println("Divide result is: " + calculateDivide(10, 3));
        System.out.println("Result for a is: " + calculateResultA(-5, 8, 6));
        System.out.println("Result for b is: " + calculateResultB(55, 9, 9));
        System.out.println("Result for c is: " + calculateResultC(20, -3, 5, 8));
        System.out.println("Result for d is: " + calculateResultD(5, 15, 3, 2, 8, 3));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static float calculateDivide(float num1, float num2) {
        return num1 / num2;
    }

    public static int calculateResultA(int num1, int num2, int num3) {
        return num1 + num2 * num3;
    }

    public static int calculateResultB(int num1, int num2, int num3) {
        return (num1 + num2) % num3;
    }

    public static int calculateResultC(int num1, int num2, int num3, int num4) {
        return num1 + num2 * num3 / num4;
    }

    public static int calculateResultD(int num1, int num2, int num3, int num4, int num5, int num6) {
        return num1 + num2 / num3 * num4 - num5 % num6;
    }
}
