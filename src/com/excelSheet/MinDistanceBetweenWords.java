package com.excelSheet;

import java.util.Arrays;

public class MinDistanceBetweenWords {
    public static int toFindMinDistance(String sentence,String word1,String word2){
        String[] words=sentence.split(" ");
        //System.out.println(Arrays.toString(words));

        int index1=-1;//to track last seen index by word1
        int index2=-1;//to track last seen index by word2

        int minDistance=Integer.MAX_VALUE;

        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                index1=i;
            } if(words[i].equals(word2)){
                index2=i;
            }if(index1!=-1 && index2!=-1){
                minDistance=Math.min(minDistance,Math.abs(index1-index2));
            }

        }
        return minDistance;
    }
    public static void main(String[] args){
        String sentence="the quick the brown quick brown the frog";
        String word1="quick";
        String word2="frog";
        System.out.println(toFindMinDistance(sentence,word1,word2));
    }
}
