package com.excelSheet.java8;

import java.util.stream.Collectors;

public class CharFreq {
    public static String charCount(String s){
        if(s.isEmpty() || s.length()==0){
            System.out.println("Given String is Empty");
            return "";
        }
        StringBuilder result=new StringBuilder();
        s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c))
                .forEach((key,value)->{
                    result.append(key).append(value.size());
                });
        return result.toString();
    }
    public static void main(String[] args){
        String s="aabbccafhj";
        System.out.println(charCount(s));
    }
}
