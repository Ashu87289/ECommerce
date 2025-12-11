package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetrieveDistinctElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);
    }
}
