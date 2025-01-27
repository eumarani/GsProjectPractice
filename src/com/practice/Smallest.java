package com.practice;

public class Smallest {
    public static void smallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];

            }
        }
        System.out.println(smallest);

    }
    public static void main(String[] args){
        int[] arr={6,3,2,1,4,5,9};
        smallest(arr);
    }
}
