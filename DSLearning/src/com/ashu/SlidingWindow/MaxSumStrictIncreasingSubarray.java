package com.ashu.SlidingWindow;

public class MaxSumStrictIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 1, 7};
        int n = arr.length;
        int res = maxSum(arr, n);
        System.out.println(res);
    }

    private static int maxSum(int[] arr, int n) {
        int sum = arr[0], maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i-1] < arr[i]){
                sum += arr[i]; //add in the current sum and keep extending
            }else{
                sum = arr[i];   //reset to current sum
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
