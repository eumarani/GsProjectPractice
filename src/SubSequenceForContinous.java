public class SubSequenceForContinous {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(toFind(arr));

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(toFind(arr1));

        int[] arr2 = {7, 2, 4, 5, 8};
        System.out.println(toFind(arr2));


    }

    public static boolean toFind(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2]) {

                return true;

            }

        }
        return false;
    }
}
