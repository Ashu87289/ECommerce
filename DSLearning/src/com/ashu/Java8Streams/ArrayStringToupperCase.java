package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStringToupperCase {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ashu","vandu","gagan","priyanka");

        List<String> res = str.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(res);
    }
}
