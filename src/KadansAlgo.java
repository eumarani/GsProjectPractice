public class KadansAlgo {

        public static void main(String[] args) {
            int arr[]={-3,2,4,-1,3,-4,3};
            int maxSum=maxSubArraySum(arr);
            System.out.println(maxSum);
        }

        private static int maxSubArraySum(int[] arr) {
            int n=arr.length;
            int max=Integer.MIN_VALUE;//to handle cases where all elements are negative
            int sum=0;//To keep track of the sum of the current subarray,
            int start=0;//To store the starting index of the current subarray
            int maxStart=0;//To store the starting index of the subarray that gives the maximum sum
            int maxEnd=0;//To store the ending index of the subarray that gives the maximum sum
            for(int i=0;i<n;i++)
            {
                if(sum>0)
                {
                    sum+=arr[i];
                }
                else{
                    sum=arr[i];
                    /* start=i;*/
                }
                if(max<sum) {
                    max=sum;
                maxStart=start;
                maxEnd=i;
                }
            }
            System.out.println("start index : "+maxStart);
            System.out.println("end index : "+maxEnd);
            return max;
        }
    }

