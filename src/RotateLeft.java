import java.util.Arrays;

public class RotateLeft {
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;//where k>n
        int[] rotatedArray=new int[n];
        /*for(int i=0;i<n;i++){
            rotatedArray[i]=arr[(i+k)%n];
        }*/

        // Copy the second part of the array (from index k to n-1)
        for (int i = 0; i < n - k; i++) {
            rotatedArray[i] = arr[i + k];
        }

        // Copy the first part of the array (from index 0 to k-1)
        for (int i = 0; i < k; i++) {
            rotatedArray[n - k + i] = arr[i];
        }
        System.arraycopy(rotatedArray,0,arr,0,n);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
