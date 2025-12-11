package com.ashu.Java8Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        String str = "hi my name is     ashu";

        //Convert the String to upper case logic.
        String result = Arrays.stream(str.trim().split("\\s+"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        //System.out.println(result);


        String res = str.chars()
                .mapToObj(c -> String.valueOf((char)c).toUpperCase())
                .collect(Collectors.joining())
                .replaceAll("\\s+", " ");
        //System.out.println(res);


        //Logic for converting Only 1st letter of each to upper case

        String res1 = Arrays.stream(str.trim().split("\\s+"))
                .map(word -> word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));

        System.out.println(res1);
    }
}
