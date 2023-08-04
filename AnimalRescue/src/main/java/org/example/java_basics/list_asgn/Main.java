package org.example.java_basics.list_asgn;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        List<Integer> givenList = new ArrayList<>();
        populateListOfIntegers(givenList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Ana");
        stringList.add("are");
        stringList.add("mere");

        System.out.println("Given list size is: " + givenList.size());


        // exercise 1
        System.out.println("Exercise 1");
        logicalOp.printListValues(givenList);


        //exercise 2
        System.out.println("Exercise 2");
        logicalOp.addNumberToList(givenList, 120);
        System.out.println("Given list is: " + givenList);

        //exercise 3
        System.out.println("Exercise 3");
        logicalOp.printNumbersFromList(givenList, 15);

        //exercise 4
        System.out.println("Exercise 4");
        logicalOp.printReverse(givenList);

        //exercise 5
        System.out.println("Exercise 5");
        System.out.println(logicalOp.createListOfStrings(stringList, 3, "multe"));

        //exercise 6
        System.out.println("Exercise 6");
        System.out.println(logicalOp.addToFirstIndexInStringList(stringList, "WOW! "));

        //exercise 7
        System.out.println("Exercise 7");
        logicalOp.printListElementsAndPosition(stringList);

        //exercise 8
        System.out.println("Exercise 8");
        System.out.println("Givens list is: " + givenList);
        System.out.println("Biggest number from list is: " + logicalOp.getBiggestValueFromList(givenList));



    }

    private static void populateListOfIntegers(List<Integer> list) {
        for (int i = 0; i <= 35; i++)
            list.add(i);
    }
}
