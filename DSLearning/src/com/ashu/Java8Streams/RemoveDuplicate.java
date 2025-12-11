package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,6,6);

        List<Integer> res = list.stream().
                distinct().collect(Collectors.toList());

        System.out.println(res);
    }
}
