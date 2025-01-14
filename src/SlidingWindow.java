
//find max sum of subarray with given subarray size
public class SlidingWindow {
    public static int maxSum(int[] arr,int k){
        int n=arr.length;
        int windowSum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];

        }
        maxsum=windowSum;
        for(int i=k;i<n;i++){

            windowSum=windowSum-arr[i-k]+arr[i];
            maxsum=Math.max(maxsum,windowSum);

        }
        return maxsum;

    }
    public static void main(String[] args){
        int[] arr={2,1,5,1,3,2};
        int k=3;
       int result= maxSum(arr,k);
       System.out.println(result);
    }
}
