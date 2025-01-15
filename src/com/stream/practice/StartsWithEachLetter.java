package com.stream.practice;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
/*
Given a list of strings,
group them by their first letter and then count how many words start with each letter.

List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "date");
*/

public class StartsWithEachLetter {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "date");
        Map<Character,Long> mostFrequentLetter=words.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0), Collectors.counting()));
        System.out.println(mostFrequentLetter);


    }
}
