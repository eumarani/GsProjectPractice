package com.excelSheet;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static String luniqueSubString(String input){
        if(input.isEmpty()||input.length()==0){
            return "";
        }
        Set<Character> set=new HashSet<>();
        int left=0,maxLength=0,start=0;
        for(int right=0;right<input.length();right++){
            while(set.contains(input.charAt(right))){
                set.remove(input.charAt(left));
                left++;
            }
            set.add(input.charAt(right));
            if(right-left+1>maxLength){
                maxLength=right-left+1;
                start=left;
            }

        }
        return input.substring(start,start+maxLength);
    }
    public static void main(String[] args){
        String input1 = "abcdea";
        System.out.println(luniqueSubString(input1));

        String input2="abaaacdrhae";
        System.out.println(luniqueSubString(input2));
    }
}
