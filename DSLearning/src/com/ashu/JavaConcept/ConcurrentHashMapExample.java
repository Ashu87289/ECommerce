package com.ashu.JavaConcept;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        for(int key : map.keySet()){
            map.put(4,"D");
            System.out.println("Key = " + key + ", value = " + map.get(key));
        }
    }
}
