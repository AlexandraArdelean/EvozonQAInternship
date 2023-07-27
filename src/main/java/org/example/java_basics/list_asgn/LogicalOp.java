package org.example.java_basics.list_asgn;

import java.util.List;

public class LogicalOp {
    //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printListValues(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberToList(List<Integer> integerList, int number) {
        integerList.add(number);
    }

    //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru.
    public void printNumbersFromList(List<Integer> integerList, int number) {
        for (int i = number; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }

    //4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
    // pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printReverse(List<Integer> integerList) {
        for (int i = integerList.size()-1; i > 0; i--) {
            System.out.println(integerList.get(i));
        }
    }

}
