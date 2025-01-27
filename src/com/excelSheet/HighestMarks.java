package com.excelSheet;

import java.util.HashMap;
import java.util.Map;

/*
Conditions:
        1. find highest score student but if having same names you need to add then you need to find out.
2. if rounded values you get means you need to use floor.
        3. this is not average we need to find highest marks.
4. Use 3 methods that return boolean value true or false.
5. if scores is empty then return 0.
*/


public class HighestMarks {
  public static boolean  toFindHighest(String[][] student){
      if(student.length==0){
          return false;
      }

      Map<String,Double> freqList=new HashMap<>();

      for(String[] entry:student) {
          String name = entry[0];
          double marks = Math.floor(Double.parseDouble(entry[1]));

          freqList.put(name, freqList.getOrDefault(name, 0.00) + marks);
      }
      double highestScore=0.00;
      for(double score:freqList.values()){
          if(score>highestScore){

              highestScore=score;
          }
      }
      if(highestScore > 0.00){
          System.out.println("HighestScore is :" +highestScore);
          return true;
      }else{
          return false;
      }
    }
    public static void main(String[] args){
        String[][] student = {
                {"Charles", "100.5"},
                {"Bob", "87.7"},
                {"Eric", "64.3"},
                {"Charles", "50.2"},
                {"Bob", "92.4"},
                {"Charles", "25.8"},
                {"Eric", "30.9"},
                {"Eric", "40.5"}
        };
    System.out.println(toFindHighest(student));

        String[][] student1={};
        System.out.println(toFindHighest(student1));

        String[][] student3 = {
                {"Charles", "0.0"},
                {"Bob", "-5.0"},
                {"Eric", "0.0"}
        };
        System.out.println(toFindHighest(student3));

        String[][] student4 = {{"Charles", "100"},{"Bob","87"},{"Eric","64"},{"Charles","22"}};
        System.out.println(toFindHighest(student4));

    }
}
