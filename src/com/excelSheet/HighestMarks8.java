package com.excelSheet;

import java.util.*;
import java.util.stream.Collectors;


public class HighestMarks8 {
    public static double toFindHighest(String[][] student) {
        if (student.length == 0) {
            return 0.0;
        }

       Map<String,Double> freqList= Arrays.stream(student)
        .collect(Collectors.groupingBy(entry->entry[0],
                Collectors.summingDouble(entry->Math.floor(Double.parseDouble(entry[1])))));
        /*return freqList;*/
        return freqList.values().stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);

       /* return highestScore.isPresent() ? highestScore.getAsDouble() : 0.0;//for boolen return type need to check with this
*/


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
    }
}
