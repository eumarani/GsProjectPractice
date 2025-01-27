package com.excelSheet;

/*"Convert a string as given in the format below:

Example:
aabbb into a2b3
aaaa into a4
a into a1"*/

import java.util.HashMap;
import java.util.Map;

public class Frequent {
    public static void count(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        //System.out.println(freqMap);
        for (Map.Entry<Character, Integer> map : freqMap.entrySet()) {
            System.out.print(map.getKey() + "" + map.getValue());

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String s = "aabbb";
        count(s);

        String s1="qqqq";
        count(s1);
        String s2="z";
        count(s2);

    }
}
