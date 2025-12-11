package com.ashu.SlidingWindow;

public class MaxSubarraySumSizeK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int n = arr.length;
        int maxSum = 0,left = 0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        maxSum = sum;
        for(int i = k;i < n;i++){
            sum = sum - arr[i - k] + arr[i]; //subtract starting value i.e 2 from  the sum and adding next value to the sum.
            maxSum = Math.max(maxSum,sum);
            left++;
        }
        System.out.println(maxSum);
    }
}
