package com.excelSheet;

public class MedianOfTwoSortedArrays {
    public static int median(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int n3 = result.length;
        int median = 0;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

            while (i < n1) {      // Copy remaining elements from arr1
                result[k] = arr1[i];
                i++;
                k++;
            }
            while (j < n2) {      // Copy remaining elements from arr2
                result[k] = arr2[j];
                j++;
                k++;
            }

            if (n3 % 2 == 0) {
                median = (result[n3 / 2] + (result[n3 / 2 - 1])) / 2;
            } else {
                median = result[n3 / 2];
            }



        return median;
    }
    public static void main(String[] args){
        int[] arr1={2,3,5,8,9,10};
        int[] arr2={10,12,16,18,20,22,23,24};
        System.out.println(median(arr1,arr2));
    }
}
