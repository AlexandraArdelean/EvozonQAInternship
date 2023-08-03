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

    //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
    // si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int returnNumberPositionFromArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return 0;
    }

    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public void createPrint(int rows, int columns) {
        char[][] charArray = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                charArray[i][j] = '-';
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(charArray[i][j]);
            }
            System.out.println();
        }

    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] printArrayWithoutGivenNumber(int[] myArray, int givenNumber) {
        int index = 0;
        int[] copyArray = new int[myArray.length - 1];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == givenNumber) {
                index = i;
            }
        }

        for (int i = 0, k = 0; i < myArray.length; i++) {
            if (i == index) {
                continue;
            }

            copyArray[k++] = myArray[i];
        }

        return copyArray;
    }

    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int printSecondSmallerNumberFromArray(int[] givenArray) {
        Arrays.sort(givenArray);
        return givenArray[1];
    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void copyFromGivenArray(int[] givenArray, int[] copiedArray) {
        if (givenArray.length != copiedArray.length) {
            System.out.println("Arrays lengths are not equal!");
        }

        for (int i = 0; i < givenArray.length; i++) {
            copiedArray[i] = givenArray[i];
        }
    }

    // Arrays extra
    // 1. Creati o metoda care sa returneze al doilea cel mai mic numar dintr-un array.
    public int returnSecondNumber(int[] givenArray) {
        Arrays.sort(givenArray);
        return givenArray[1];
    }

    // 2. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    //TODO

    public int[] insertNewElement(int[] givenArray, int num) {
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] % 5 ==0) {
                givenArray[i] = num;
            }
        }
        return givenArray;
    }

}
