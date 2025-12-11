package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,2,8,5);

        List<Integer> res = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(res);
    }
}
