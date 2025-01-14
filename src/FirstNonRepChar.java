/*Input: "abcabcbb"
Output: 3 ("abc")*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FirstNonRepChar {
    public static void subString(String input){
        Map<Character,Integer> freqMap=new HashMap<>();

        for(char c:input.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

        }
        System.out.println(freqMap);

        for(char c:input.toCharArray()){
            if(freqMap.get(c)==1){
                System.out.println(c);
                return;

            }
        }
        System.out.println("there is no non repeatingchar");


    }
    public static void main(String[] args){
        String input="abcabddcbbee";
        subString(input);

    }
}
