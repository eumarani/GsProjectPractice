package com.excelSheet;

public class ShortestSubArrayWithSum {
    public static int subArray(int[] arr,int k){
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int currentSum=0;
        for(int right=0;right<arr.length;right++) {
            currentSum += arr[right];

            while (currentSum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= k;
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE? -1:minLength;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,10,2,1};
        int k=6;
        System.out.println(subArray(arr,k));
    }

}
