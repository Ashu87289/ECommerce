package com.ashu.string;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int i = ch1.length-1;
        int j = ch2.length-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0){
            int digit1 = (i >= 0) ? (ch1[i] - '0') : 0;
            int digit2 = (j >= 0) ? (ch2[j] - '0') : 0;
            int sum = digit1 + digit2 + carry;

            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
