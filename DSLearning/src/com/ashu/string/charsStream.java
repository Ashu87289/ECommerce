package com.ashu.string;

import java.util.List;

public class charsStream {
    public static void main(String[] args) {
        String s = "hello";
        List<Character> list = s.chars()
                .mapToObj(c -> (char)c)
                .toList();

        s.chars().forEach(c -> System.out.print((char)c));
        //System.out.println(list);
    }
}
