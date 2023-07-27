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
    public int[] populateArray(int[] myArray) {
        myArray = new int[51];
        int index = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[index] = i;
                index++;
            }
        }
        return Arrays.stream(myArray).toArray();

    }

    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public double calculateArrayAverage(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
            count++;

        }
        return sum / count;

    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
    // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean searchStringInArray(String[] stringArray, String text) {
        for (String string : stringArray) {
            if (string.equals(text)) {
                return true;
            }
        }
        return false;
    }

}
