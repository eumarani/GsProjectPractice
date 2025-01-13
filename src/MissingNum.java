public class MissingNum {
    public static int missing(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int[] input={1,2,3,4};
        int result=missing(input);
        System.out.println(result);

        int[] input1={0,1,2,4,5};
        System.out.println(missing(input1));
    }
}
