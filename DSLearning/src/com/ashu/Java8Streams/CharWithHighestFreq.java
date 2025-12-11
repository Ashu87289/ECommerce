package com.ashu.Java8Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharWithHighestFreq {
    public static void main(String[] args) {
        String str = "Raaaamu Kaka";

        str = str.replaceAll("\\s+","" );

        System.out.println(str);

        Map.Entry<Character,Long> freqMap = str.chars().mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Highest Frequency characters : " + freqMap.getKey() + " having freq : " + freqMap.getValue());


    }
}
