package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;

public class CountIntGreaterthan5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        long countInt = list.stream().filter(e->e>5).count();
        System.out.println(countInt);
    }
}
