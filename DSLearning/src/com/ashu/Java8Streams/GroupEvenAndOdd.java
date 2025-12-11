package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        Map<String,List<Integer>> result = list.stream()
                .collect(Collectors.groupingBy(e->e % 2 == 0 ? "Even" : "Odd"));

        System.out.println(result);
    }
}
