package com.excelSheet;


import java.util.Arrays;

public class ArraySort {
    public static int[] sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;
    }

    public static int add(int[] arr){
        int[] sortedArray=sort(arr);
        System.out.println("Arrays to String:"+Arrays.toString(sortedArray));

        int secondSmallest=sortedArray[1];
        System.out.println(secondSmallest);
        int secondLargest=sortedArray[sortedArray.length-2];
        System.out.println(secondLargest);

        int sum=secondSmallest+secondLargest;
        return sum;

    }
    public static void main(String[] args){
        int[] arr={10, 5, 8, 20, 15};
        int[] result=sort(arr);
        System.out.println("Sorted Array:");
        for(int i:result) {
            System.out.println(i);
        }
           System.out.println(add(arr));
        }
    }

