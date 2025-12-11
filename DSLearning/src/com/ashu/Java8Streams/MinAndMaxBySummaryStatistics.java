package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MinAndMaxBySummaryStatistics {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(81,2,3,2,4,5,6,7);

        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        int min = stats.getMin();
        int max = stats.getMax();

        System.out.println(min + " - " + max);
    }
}
