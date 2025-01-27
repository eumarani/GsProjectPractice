import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*They asked to add the second smallest and
second largest element in an given array and return the same*/

public class Sum {
    public static void main(String[] args){
        int[] arr = {10, 5, 8, 20, 15};
         List<Integer> sortedList=Arrays.stream(arr)
                .sorted()
                 .boxed()//convert int to Integer
                 .collect(Collectors.toList());
         System.out.println(sortedList);

         int secondSmallest=sortedList.get(1);
         int secondLargest=sortedList.get(sortedList.size()-2);

         int result=secondSmallest+secondLargest;

         System.out.println(result);
    }
}
