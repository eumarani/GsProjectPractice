package com.practice;

public class SecondSmallest {
    public static int[] smallest(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int secondSmallest(int[] arr){
        if(arr.length<2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        return arr[1];
    }
    public static void main(String[] args){
        int[] arr={6,3,2,1,4,5,9};
        int[] result=smallest(arr);
        for(int i:result){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Second Smallest no." +secondSmallest(arr));
    }
}
