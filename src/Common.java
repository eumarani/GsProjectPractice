import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//to print common chars in between 2 Strings
public class Common {
    public static void main(String[] args){
        String s1="Suresh";
        String s2="Naresh";

       List<String> commonChars= s1.chars()
                .mapToObj(c->(char)c)// Convert int values to Character objects
                .filter(e->s2.indexOf(e)!=-1)// Keep only characters that appear in s2
                .distinct()//Ensure uniqueness
               .map(String::valueOf)// Convert Character back to String
                .collect(Collectors.toList());

       System.out.println(commonChars);


       Set<Character> set1=new HashSet<>();
       Set<Character> set2=new HashSet<>();


       String s11=s1.toLowerCase();
       String s12=s2.toLowerCase();

       for(char c:s11.toCharArray()){
           set1.add(c);

       }
       //System.out.println(set1);
        for(char c:s12.toCharArray()){
            set2.add(c);

        }
        //System.out.println(set2);


        set1.retainAll(set2);
        System.out.println(set1);
    }
}
