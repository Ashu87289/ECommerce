package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Almond", "Chiku", "Apricoat");

        List<String> res = list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(res);
    }
}
