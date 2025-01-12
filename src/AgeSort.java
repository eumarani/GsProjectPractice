
/*Question:
You are given a list of integers representing the ages of employees in a company.
 Write a Java program using the Stream API to:

Filter out the employees who are under 18 years old.
Square the ages of the remaining employees.
Calculate the sum of these squared ages.*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AgeSort {
    public static int sum(List<Integer> list){


        int total=list.stream()
                .filter(n->n<18)
                .map(n->n*n)
                .reduce(0,(a,b)->(a+b));

        return total;
    }
public static List<Integer> find(List<Integer> list){
        List<Integer> result=list.stream()
                .filter(n->n<18)
                .collect(Collectors.toList());

        return result;
}


    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(12);
        list.add(21);
        list.add(24);
        System.out.println("Actual Age list is:" +list);

       int result= sum(list);
       System.out.println("age is square sum is:" +result);

      List<Integer> result1=find(list);
      if(!result1.isEmpty()) {
          System.out.println("Age is lessthan 18:");
          for (int i : result1) {
              System.out.print(i + " ");
          }
      }
    }
}
