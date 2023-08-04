package org.example.java_basics.for_loops;

public class Calculator {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printNumber(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.print(i + " ");
        }

    }
}
