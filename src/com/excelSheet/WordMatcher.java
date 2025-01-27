package com.excelSheet;

import java.util.*;

public class WordMatcher {

    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input = "abcd";
        System.out.println(dictCount(dict, input));
    }

    private static List<String> dictCount(String[] dict, String input) {
        ArrayList<String>list=new ArrayList<>();
        input=input.toLowerCase();
        for(int i=0;i<dict.length;i++){
            dict[i]=dict[i].toLowerCase();
        }
        int n=dict.length;

        int[] freInput =new int[26];
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int indx=ch-'a';
            freInput[indx]++;
        }

        for(String word:dict) {
            if (word.length() != input.length()) {
                continue;
            }
               int []freEle=new int[26];
                for(int j=0;j<word.length();j++)
                {
                    char ch=word.charAt(j);
                    int ind=ch-'a';
                    freEle[ind]++;
                }
                if(Arrays.equals(freInput,freEle)){
                    list.add(word);

                }


            }
        return list;
        }


    }
