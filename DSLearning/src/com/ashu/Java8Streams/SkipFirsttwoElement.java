package com.ashu.Java8Streams;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirsttwoElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        List<Integer> skipFirstTwo = list.stream().skip(2).collect(Collectors.toList());

        int n = 2;
        List<Integer> skipLastTwo = list.stream().limit(list.size() - n).collect(Collectors.toList());

        //System.out.println(skipFirstTwo);
        System.out.println(skipLastTwo);
    }
}
