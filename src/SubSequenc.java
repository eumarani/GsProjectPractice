public class SubSequenc {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(toFind(arr));

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(toFind(arr1));

        int[] arr2 = {7, 2, 9, 5, 8};
        System.out.println(toFind(arr2));

        int[] arr3={20,100,10,12,5,13};
        System.out.println(toFind(arr3));


    }
    public static boolean toFind(int[] arr){
        int n=arr.length;
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=firstMin){
                firstMin=arr[i];
            }else if(arr[i]<=secondMin){
                secondMin=arr[i];
            }else{
                return true;
            }
        }
        return false;
    }
}
