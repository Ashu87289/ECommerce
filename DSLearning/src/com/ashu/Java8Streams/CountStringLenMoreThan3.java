package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringLenMoreThan3 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Apple","Red","Orange","Yellow","Hi","yo");

        List<String> res = str.stream().filter(s -> s.length() > 3).collect(Collectors.toList());

        System.out.println(res);
    }
}
