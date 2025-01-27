package com.excelSheet;

public class MaxSumSubArray {
    public static int findSum(int[] nums,int k){

        int maxSum=0,windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        maxSum=windowSum;

        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;

    }
    public static void main(String[] args){
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        System.out.println(findSum(nums,k));
    }
}
