package com.ashu.CollectionLearning;

import java.util.ArrayList;
import java.util.List;

public class BackedCollectionExample {
    public static void main(String[] args) {
        ArrayList<String> mainList = new ArrayList<>();
        mainList.add("A");
        mainList.add("B");
        mainList.add("C");
        mainList.add("D");
        mainList.add("E");
        mainList.add("F");

        List<String> subList = mainList.subList(1,4);
        System.out.printf("Original List : " + mainList);
        System.out.printf("Original List : " + subList);

        subList.set(1,"X");  //SubList got modified here.
        System.out.println("\nAfter modifying subList : ");
        System.out.println("Original List : " + mainList);
        System.out.println("Sub List : " + subList);
    }
}
