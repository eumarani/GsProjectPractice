import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if(arr.length<2){
            //System.out.println("Already Sorted");//already sorted
            return;
        }
    int mid=arr.length/2;
        int[] left= Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        //recursive calls
        mergeSort(left);
        mergeSort(right);

        sort(arr,left,right);

    }
    public static void sort(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;//to track indices for left,right and array
        // Compare and merge the arrays
        while(i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];

            } else {
                arr[k++] = right[j++];
            }
        }
        // If there are remaining elements in the left array, add them
         while(i<left.length){
             arr[k++]=left[i++];
         }
        // If there are remaining elements in the right array, add them
         while(j<right.length){
             arr[k++]=right[j++];
         }
        }


        public static void main (String[] args){
            int[] arr = {12, 11, 13, 5, 6, 7};

            System.out.println("Original Array is :" +Arrays.toString(arr));
            mergeSort(arr);
            System.out.println("After Sorting:" +Arrays.toString(arr));



    }
}
