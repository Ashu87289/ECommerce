package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInAscending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,4,2,3);

        List<Integer> sortList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);
    }
}
