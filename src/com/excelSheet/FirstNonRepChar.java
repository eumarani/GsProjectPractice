package com.excelSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static char nonRepChar(String s){
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(freqMap.get(c)==1){
                return c;
            }
        }
return '\0';
       /* // Create a frequency map using Java 8
        Map<Character,Long> freqMap=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //find FirstNonrep char
        return s.chars()
                .mapToObj(c->(char)c)
                .filter(c->freqMap.get(c)==1)
                .findFirst()
                .orElse('\0');*/
    }
    public static void main(String[] args){
        String s="12345";
        String s1="abbccadd";
        System.out.println(nonRepChar(s));
        System.out.println(nonRepChar(s1));
    }
}
