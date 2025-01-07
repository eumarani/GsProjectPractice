import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        /*if(arr.length<2){
            return -1;
        }*/
        if(low<high){
            int pi=partition(arr,low,high);

            // Recursively sort the left and right sub-arrays
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,arr.length-1);
        }

    }
    // Partition function to rearrange the array
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];// Pivot element (choosing the last element as pivot)
        int i=low-1;// Pointer for the smaller element
// Traverse the array and arrange elements
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

// Swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        // Swap the pivot element to its correct position
          int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void main(String[] args){
        int[] arr={12, 11, 13, 5, 6, 7};
        System.out.println("Before Sorting"  + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting"  + Arrays.toString(arr));

    }
}
