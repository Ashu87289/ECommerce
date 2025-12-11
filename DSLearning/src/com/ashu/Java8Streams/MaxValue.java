package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,1,6,23,78,12,45);

        int res = list.stream().max(Integer::compare).get();
        System.out.println(res);
    }
}
