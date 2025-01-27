package com.excelSheet;

public class MaxLengthOfHadGivesearchWord {
    public static String search(String[] dict,String toSearch){
        int maxLength=Integer.MIN_VALUE;
        String longestWord="";
        for(String word:dict){
            if(word.toLowerCase().contains(toSearch.toLowerCase())){
                if(maxLength<word.length()){
                    maxLength=word.length();
                    longestWord=word;

                }

            }
            /*System.out.println(word);*/
        }

        return longestWord + " " + maxLength + "";
    }
    public static void main(String[] args) {

        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(search(dict,toSearch));

//Returns 9 (LODGESSSS)"
    }
}

