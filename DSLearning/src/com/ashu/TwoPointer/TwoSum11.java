package com.ashu.TwoPointer;

import java.util.Arrays;

public class TwoSum11 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length-1;
        Arrays.sort(numbers);
        while( i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{numbers[i],numbers[j]};
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
