package com.ashu.TwoPointer;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
        int res = removeDuplicates(nums,n);
        System.out.println(res);
    }
    public static int removeDuplicates(int[] nums,int n) {
        int i = 0,j = 1;
        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }else{
                i++;
                swap(nums,i,j);
                j++;
            }
        }
        return i+1;
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
