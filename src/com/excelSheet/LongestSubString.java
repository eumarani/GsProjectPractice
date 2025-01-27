package com.excelSheet;
/*"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
String toSearch = ""ODG"";

//Returns 9 (LODGESSSS)"*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestSubString {

    public static void main(String[] args){
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch="ODG";
       Optional<String> longestWord= Arrays.asList(dict)
                .stream()
                .filter(dict1->dict1.toLowerCase().contains(toSearch.toLowerCase()))
               .max(Comparator.comparingInt(String::length));
       //System.out.println(longestWord);

        longestWord.ifPresent(word -> {
            System.out.println("Longest word containing the substring: " + word);
            System.out.println("Length: " + word.length());});
        if(longestWord.isEmpty()) {
            System.out.println("there is no longest Word");
        }
        }
    }


