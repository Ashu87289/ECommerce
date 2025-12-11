package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListOfIntToSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        Set<Integer> set = list.stream().collect(Collectors.toCollection(TreeSet::new));

        System.out.println(set);
    }
}
