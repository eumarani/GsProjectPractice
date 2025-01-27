package com.practice;



public class Compare {
    public static void main(String[] args){
        String s1=new String("Hello");
        String s2=new String("Hello");
        String s3="Hello";
        String s4="hello";

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true

        System.out.println(s1==s4);//false
        System.out.println(s1.equalsIgnoreCase(s4));//true


        System.out.println(s1.hashCode());//69609650
        System.out.println(s2.hashCode());//69609650
        System.out.println(s3.hashCode());//69609650
        System.out.println(s4.hashCode());//99162322


    }
}
