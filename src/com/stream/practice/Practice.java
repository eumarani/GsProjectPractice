package com.stream.practice;

//Given a list of words, find the most frequent word.
//        If multiple words have the same frequency, return the first one.
//        List<String> words = Arrays.asList("apple", "banana", "orange", "banana", "apple", "apple", "orange");

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "banana", "banana","apple", "apple", "orange");
        String mostFrequentWord=words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .map(Map.Entry::getKey)
                .orElse("No words Found:");

        System.out.println("Most Freq word:" +mostFrequentWord);

        long maxFreq=words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .values()
                .stream()
                .max(Long::compareTo)
                .orElse(0L);
        System.out.println("most freq no:" +maxFreq);

        List<String> mostFrequentWOrds=words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==maxFreq)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println("highest Fre Words:" +mostFrequentWOrds);
    }

}
