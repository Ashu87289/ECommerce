package com.ashu.TwoPointer;

import java.util.Arrays;

public class SortedSquaresArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0,right = n-1;
        int[] res = new int[n];
        for(int i = n-1 ; i>= 0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left] * nums[left];
                left++;
            }else{
                res[i] = nums[right] * nums[right];  //in 1st iteration value 100 going at last index. and so on
                right--;
            }
        }
        return res;
    }
}
