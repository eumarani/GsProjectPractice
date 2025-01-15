package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana");
        //map
        List<String> map=words.stream()
                .map(e->e.toLowerCase())
                .toList();
        System.out.println(map);
        //flat map
        List<List<String>> flatMapEx=Arrays.asList(
                Arrays.asList("Apple","banana"),
                Arrays.asList("grape","orange"),
                Arrays.asList("guava","druagon")
        );
        System.out.println(flatMapEx);
        List<String> flatList= flatMapEx.stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
}
