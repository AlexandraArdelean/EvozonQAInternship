package org.example.java_basics.list_asgn;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        List<Integer> givenList = new ArrayList<>();
        populateList(givenList);

        System.out.println("Given list size is: " + givenList.size());

//
//        // exercise 1
//        logicalOp.printListValues(givenList);
//        //exercise 2
        logicalOp.addNumberToList(givenList, 120);
        System.out.println("Given list is: " + givenList);
//
//        //exercise 3
//        logicalOp.printNumbersFromList(givenList, 15);

        //exercise 4
        logicalOp.printReverse(givenList);


    }

    private static void populateList(List<Integer> list) {
        for (int i = 0; i <= 35; i++)
            list.add(i);
    }
}
