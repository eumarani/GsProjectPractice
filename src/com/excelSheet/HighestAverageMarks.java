package com.excelSheet;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
    public static String highest(String[][] student){
        Map<String,Integer> totalMarks=new HashMap<>();
        Map<String,Integer> countNames=new HashMap<>();
        for(String[] marks:student) {
            String name = marks[0];
            int mark = Integer.parseInt(marks[1]);

            totalMarks.put(name, totalMarks.getOrDefault(name,0)+mark);
            countNames.put(name,countNames.getOrDefault(name,0)+1);


        }
        System.out.println(totalMarks);
        System.out.println(countNames);

        String topname="";
        double highestAverage=Double.MIN_VALUE;

        for(String name:totalMarks.keySet()){
           int total=totalMarks.get(name);
             int count=countNames.get(name);
            double average=(double)(total/count);
            if(average>highestAverage){
                highestAverage=average;
                topname=name;
            }


        }
        return "Top Student name is: " + topname + " \n Highest Average is: " + highestAverage;
        /*System.out.println("Top Student name is:" +topname);
        System.out.println("highest Average is:" +highestAverage);*/

        //System.out.println(totalMarks);
        //System.out.println(countMarks);
    }
    public static void main(String[] args){
        String[][] student = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };
      System.out.println(highest(student)) ;
    }
}
