package com.ashu.SlidingWindow;

import java.util.HashSet;

public class MaxSubaarykDistinctElement {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0,maxSum = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[i]);
            sum += nums[i];

            if(i - left + 1 == k){
                maxSum = Math.max(maxSum,sum);
                set.remove(nums[left]);
                sum -= nums[left++];
            }
        }
        return maxSum;
    }
}


/**
 *long sum = 0, maxSum = 0;
 *         int left = 0;
 *         HashSet<Integer> set = new HashSet<>();
 *         for (int i = 0; i < nums.length; i++) {
 *             while (set.contains(nums[i])) {
 *                 set.remove(nums[left]);
 *                 sum -= nums[left];
 *                 left++;
 *             }
 *             set.add(nums[i]);
 *             sum += nums[i];
 *
 *
 *             if (i - left + 1 == k) {
 *                 maxSum = Math.max(maxSum, sum);
 *                 set.remove(nums[left]);
 *                 sum -= nums[left++];
 *             }
 *         }
 *         return maxSum;
 *     }
 */
