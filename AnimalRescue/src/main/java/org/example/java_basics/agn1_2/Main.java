package org.example.java_basics.agn1_2;

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


        System.out.println("Sum result= " + sum(2023, 150));
        System.out.println("Subtract result= " + subtract(2023, 150));
        System.out.println("Multiply result= " + multiply(15, 2));
        System.out.println("Divide result= " + divide(15, 2));
        printModel();
        System.out.println("Numbers average is: " + calculateAverage(15, 2, 20));
        System.out.println("Remain is: " + calculateRemain(15, 2));
        System.out.println("Fahrenheit to Celsius: " + calculateCelsius(35));
        System.out.println("Inch to meters: " + inchToMeters(1.15));
        calculateSpeed(2500, 5, 56, 23);
        printSquare(5);

    }


    // 1. Pentru exercitiile din clasa main() de data trecuta,
    // creati metode separate pentru fiecare, tot in clasa Main.java,
    // si apoi apelati-le in metoda main().
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


    //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    //3.Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void printModel() {
        String[] model = {
                " +\"\"\"\"\"+ ",
                "[| o o |]",
                " |  ^  | ",
                " | '-' | ",
                " +-----+ "
        };

        for (String line : model) {
            System.out.println(line);
        }
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static double calculateAverage(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }

    //5.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static double calculateRemain(int num1, int num2) {
        return num1 % num2;
    }

    //6.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit,
    // si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)

    public static double calculateCelsius(double fahrenheit) {
        return (double) 5 / 9 * (fahrenheit - 32);
    }

    //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
    // care sa reprezinte distanta in inch, si sa returneze distanta in metrii

    public static double inchToMeters(double inch) {
        return inch * 0.0254;
    }

    //8.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
    // si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
    public static void calculateSpeed(float distance, float hour, float min, float sec) {
        float totalTimeInSec = hour * 3600 + min * 60 + sec;

        float metersPerSec = distance / totalTimeInSec;
        float kmPerHour = (distance / 1000.0f) / (totalTimeInSec / 3600.0f);
        float milesPerHour = kmPerHour / 1609;

        System.out.println("Speed in m/s: " + metersPerSec);
        System.out.println("Speed in km/h: " + kmPerHour);
        System.out.println("Speed in miles/h: " + milesPerHour);

    }

    //9.Scrieti un program care primeste ca input raza unui cerc si printeaza perimetrul si aria acelui cerc
    public static void printSquare(int radius) {
        double perimeters = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Circle perimeter is: " + perimeters);
        System.out.println("Area of circle is: " + area);
    }

}
