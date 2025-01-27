package com.excelSheet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
    public static Map<String,Long> freqList(List<List<String>> listOfList){
        Map<String,Long> freqList= listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return freqList;

    }
    public static void main(String[] args){
        List<List<String>> listOfList= Arrays.asList(
                Arrays.asList("Apple","banana","Mango"),
                Arrays.asList("mango","grape"),
                Arrays.asList("grape","Apple")
        );
        System.out.println(freqList(listOfList));
    }
}
