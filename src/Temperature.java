import java.util.Arrays;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args){
       int[] temperature={73,74,75,71,69,72,76,73};
       int[] result=cal(temperature);
       for(int i=0;i<result.length;i++){
           System.out.print(result[i]+" ");
       }
    }
    public static int[] cal(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> result = new Stack<>() ;
            for (int i = 0;i < n;i++){
                while (!result.isEmpty() && temp[i]>temp[result.peek()]) {
                    int index = result.pop();
                    ans[index] = i - index;

                }
                result.push(i);

            }
            return ans;
        }

    }