package com.ashu.string;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingChar {
    public static void main(String[] args) {
        String str = "abcabcbd";
        HashSet<Character> set = new HashSet<>();
        int left = 0,maxLen = 0;
        for(int i = 0;i<str.length();i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));  //remove left which is at starting point
                left++;
            }
            set.add(str.charAt(i));
            maxLen = Math.max(maxLen,i - left + 1);
        }
        System.out.println(maxLen);
    }
}
