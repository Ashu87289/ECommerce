package com.ashu.JavaConcept;

import java.util.ArrayList;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int l : list){
            list.add(4);  //While iterating on the arrayList we are trying to add a value and which is not
            //supported by ArrayList so it thorw a ConcurrentModificationException.
            //Works on the original structure using modCount. Not thread-safe.
            System.out.println(l);
        }
    }
}
