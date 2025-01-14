//Rotate Array: Write a program to rotate an array k steps to the right.

import java.util.Arrays;

/*Step 1: Reverse the entire array.
Step 2: Reverse the first k elements.
        Step 3: Reverse the remaining n - k elements (where n is the size of the array).*/
public class RotateArray {
    public static int[] rotate(int[] arr,int k){
        int n=arr.length;

        // Handle cases where k is greater than the size of the array
        k = k % n;  // In case k > n

        //Reverse the entire array.
        reverse(arr,0,n-1);

        //Reverse the first k elements.
        reverse(arr,0,k-1);

        //Reverse the remaining n - k elements (where n is the size of the array).*/
        reverse(arr,k,n-1);

        return arr;
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=8;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));

        int[] arr1={1,6,3,1,3,7};
        int k1=2;
        rotate(arr1,k1);
        System.out.println(Arrays.toString(arr1));

    }
}
