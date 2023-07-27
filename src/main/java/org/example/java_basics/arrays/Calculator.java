package org.example.java_basics.arrays;

public class Calculator {
    //1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
    // Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public double sum(double num1, int num2) {
        return num1 + num2;
    }

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public float subtract(int num1, float num2) {
        return num1 - num2;
    }

    public float subtract(float num1, int num2) {
        return num1 - num2;
    }

    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }

    public float divide(int num1, float num2) {
        return num1 / num2;

    }

    public double divide(int num1, double num2) {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public double multiply(double num1, int num2) {
        return num1 * num2;
    }

}