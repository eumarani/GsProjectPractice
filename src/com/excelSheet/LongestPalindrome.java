package com.excelSheet;

public class LongestPalindrome {
    public static boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void longestPalindrome(String s){
        String lpalindrome="";
        int maxLength=1;
        int maxStartIndex=-1;
        int maxEndIndex=-1;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPalindrome(str) && str.length()>maxLength){
                    maxLength=str.length();
                    lpalindrome=str;
                    maxStartIndex=i;
                    maxEndIndex=j-1;

                }
            }
        }
        System.out.println("Palindrom maxLength:" +maxLength);
        System.out.println("lPalindrome:" +lpalindrome);
        System.out.println("maxStartIndex:" +maxStartIndex);
        System.out.println("maxEndIndex:" +maxEndIndex);



    }
    public static void main(String[] args){
        String s="forgeeksskeegfor";
        longestPalindrome(s);
    }
}
