package com.ashu.TwoPointer;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates2(nums));
    }
    public static int removeDuplicates2(int[] nums) {
        int n = nums.length;
        int i = 2,j = 2;

        while(j < n){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
