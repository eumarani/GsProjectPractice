import java.util.HashMap;
import java.util.Map;

public class MaxChar {
    public static void max(String s){
        Map<Character,Integer> freqMap=new HashMap<>();
        for (char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

        }
        char maxChar='\0';
        int maxCount=0;
        int maxIndex=-1;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=freqMap.get(c);
            if(count>maxCount){
                maxCount=count;
                maxIndex=i;
                maxChar=c;
            }
        }
System.out.println("Max Accured Character count:"+maxCount);
        System.out.println("max char occur 1st index:"+maxIndex);
        System.out.println("max occured char:"+maxChar);


    }
    public static void main(String[] args){
        String s="aaaaavvvvvvcffdhh";
        System.out.println(s);
        max(s);
    }
}
