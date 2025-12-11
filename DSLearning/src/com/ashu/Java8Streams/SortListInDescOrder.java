package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInDescOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,4,2,3);

        List<Integer> sortList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortList);
    }
}
