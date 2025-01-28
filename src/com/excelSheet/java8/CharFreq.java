package com.excelSheet.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFreq {
    public static Map<Character,Long> charCount(String s){
        if(s.isEmpty() || s.length()==0){
            System.out.println("Given String is Empty");
            return new HashMap<>();
        }
        /*StringBuilder result=new StringBuilder();
        s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c))
                .forEach((key,value)->{
                    result.append(key).append(value.size());
                });
        return result.toString();*/

       Map<Character,Long> freList= s.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

       /*for(Map.Entry<Character,Long> entry:freList.entrySet()){
           System.out.println(entry.getKey()+""+entry.getValue());*/
        freList.forEach((k,v)->System.out.print(k+""+v));
        System.out.println();
        return freList;


    }
    public static void main(String[] args){
        String s="aabbccafhj";
        charCount(s);

        String s1="";
        charCount(s1);

    }
}
