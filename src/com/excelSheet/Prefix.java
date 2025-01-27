package com.excelSheet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prefix {
    public static List<String> check(String[] arr,String prefix){
   List<String> result=Arrays.stream(arr)
            .filter(w->w.toLowerCase().startsWith(prefix.toLowerCase()))
            .collect(Collectors.toList());

    return result;
    }
    public static void main(String[] args){
        String[] arr={"Apple","applet","bread","aper"};
        String prefix="app";
        List<String> result=check(arr,prefix);
        System.out.println("These words are starts with given prefix:");
        for(String s:result){
            System.out.println(s);
        }
    }
}
