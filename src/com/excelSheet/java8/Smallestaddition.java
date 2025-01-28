package com.excelSheet.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Smallestaddition {
    public static int tofind(int[] arr){
       Set<Integer> set = Arrays
                .stream(arr)
                .boxed()
           .collect(Collectors.toCollection(TreeSet::new));
   //System.out.println(list);

        List<Integer> list=new ArrayList<>(set);
        int ssmallest=list.get(1);
        int slargest=list.get(list.size()-2);

          int sum=ssmallest+slargest;
       return sum;


    }
    public static void main(String[] args){
       int[] arr={1,2,5,6,6,2,3,4};
       int[] arr2= {4,6,1,3,8,9,0,5,1,2,3,5};
        System.out.println(tofind(arr));
        System.out.println(tofind(arr2));
        }

    }

