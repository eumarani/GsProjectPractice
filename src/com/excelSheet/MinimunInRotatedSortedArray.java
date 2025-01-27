package com.excelSheet;

public class MinimunInRotatedSortedArray {
    public static int min(int[] arr){
        int n=arr.length;
        int right=n-1,left=0;

        while(right>left){
            int mid=(right+left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }else{
                right=mid;
            }

        }
        return arr[left];
    }
    public static void main(String[] args){
        int[] arr={5,6,0,1,2,3,4};
        System.out.println(min(arr));
    }
}
