package org.example.java_basics.list_asgn;

import java.util.Collection;
import java.util.Collections;
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
        for (int i = integerList.size() - 1; i > 0; i--) {
            System.out.println(integerList.get(i));
        }
    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public List<String> createListOfStrings(List<String> strings, int index, String givenString) {
        strings.add(index, givenString);
        return strings;
    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public List<String> addToFirstIndexInStringList(List<String> givenList, String text) {
        givenList.add(0, text);
        return givenList;
    }

    //7.Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void printListElementsAndPosition(List<String> givenList) {
        String text = "";
        for (int i = 0; i < givenList.size(); i++) {
            text = givenList.get(i);
            System.out.println("At index " + i + " string value is " + text);
        }
    }

    //8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public int getBiggestValueFromList(List<Integer> givenList) {
        Collections.sort(givenList);
        return givenList.get(givenList.size()-1);
    }

}
