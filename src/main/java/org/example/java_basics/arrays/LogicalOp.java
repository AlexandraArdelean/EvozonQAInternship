package org.example.java_basics.arrays;

import java.util.Arrays;

public class LogicalOp {

    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void populateArray() {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");

        }
    }

    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat
    // cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
    //TODO
    public int[] populateArray(int[] myArray) {
        myArray = new int[50];
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                myArray[i] = i;
            }
        }
        return Arrays.stream(myArray).toArray();

    }
}
