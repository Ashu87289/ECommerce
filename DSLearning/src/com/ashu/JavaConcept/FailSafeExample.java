package com.ashu.JavaConcept;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int lis : list){
            list.add(4);
            /*It worked fine bcz it works on copy or snapshot. Used in concurrent collections. Weakly
            * consistent but thread safe.*/
            System.out.println(lis);
        }
    }
}
