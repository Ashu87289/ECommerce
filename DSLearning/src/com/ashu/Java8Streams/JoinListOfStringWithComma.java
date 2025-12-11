package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStringWithComma {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi","my","name","is","Ashutosh","Sharma");

        String str = list.stream().collect(Collectors.joining(","));
        System.out.println(str);

    }
}
