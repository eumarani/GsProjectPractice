import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void sort(){

    }
    public static void main(String[] args){
        List<String> list= Arrays.asList
                ("John", "Alice", "Bob", "Charlie","Clare","Outh","dawn","alice","bob","john");
        System.out.println(list);

        //Sorted Order
       List<String> sortedOrder= list.stream()
                .sorted()
                .collect(Collectors.toList());
       System.out.println("sortedOrder:" +sortedOrder);

       //SortedOrder based on it's length
        List<String> SoretdOrderBasedOnlength=list.stream()
                .sorted((s1,s2)-> {
                    int comparisionlength = Integer.compare(s1.length(), s2.length());
                    if (comparisionlength != 0) {
                        return comparisionlength;
                    }
                    return s1.compareTo(s2);
                })
                .collect(Collectors.toList());

        System.out.println("SoretdOrderBasedOnlength  :" +SoretdOrderBasedOnlength);

        //print exactly length=4 String

       List<String> length4String= list.stream()
                .filter(e->e.length()==4)
                .collect(Collectors.toList());
       System.out.println("length4String  :" +length4String);

        //Converting to Upper Case with distinct and sorting order
     List<String> upperCase=list.stream()
             .map(String::toUpperCase)
             .distinct()
             .sorted()
             .collect(Collectors.toList());
       System.out.println("Uppercase String:");
     upperCase.forEach(System.out::println);

        //Finding First Name Starting with 'A'

        List<String> startsWith=list.stream()
                .filter(n->n.toLowerCase().startsWith("a"))//equalsIgnoreCase
                .collect(Collectors.toList());

        System.out.println("StartsWith:" +startsWith);

        //Checking if Any Name Starts with 'C'
       boolean anyMatch=list.stream()
                .anyMatch(n->n.toLowerCase().startsWith("c"));
       System.out.println(anyMatch);


//count the names contains A
     long countNamesWithO = list.stream()
                .filter(name -> name.contains("o"))
                .count();
        System.out.println("countNamesWithO: "  +countNamesWithO);
        /*Set<String> set=new HashSet<>(list);
        System.out.println(set);
       long count= set.stream()
                .count();
       System.out.println(count);
       Set<String> sortingOrder=new TreeSet<>(Arrays.asList
               ("John", "Alice", "Bob", "Charlie","clare","Outh","dawn","Alice","bob","john"));
       System.out.println(sortingOrder);
       Set<String> t=new TreeSet<>();
        Set<String> sortedOrder = set.stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

      System.out.println(sortedOrder);
*/
    }
}
