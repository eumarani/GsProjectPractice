package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidIp {
    public static void countIp(String[] str){
        String maxIp="";
        int maxCount=Integer.MIN_VALUE;
        Map<String,Integer> freqMap=new HashMap<>();
        for(String s:str){
            String ipParts=s.split(" ")[0];
            if(isValid(ipParts)){
                if(freqMap.containsKey(ipParts)){
                    freqMap.put(ipParts,freqMap.getOrDefault(ipParts,0)+1);
                }
                else{
                    freqMap.put(ipParts,1);
                }
            }
            for(Map.Entry<String,Integer> entry:freqMap.entrySet()){
                if(maxCount<entry.getValue()){
                    maxCount=entry.getValue();
                    maxIp=entry.getKey();

                }
            }

        }

        System.out.println("Max occured Ip address:" +maxIp);
        System.out.println("maxCount:" +maxCount);
        if(freqMap.isEmpty()){
            System.out.println("invalid Ip");
        }
    }

    public static boolean isValid(String ipParts){
        String[] ipPart=ipParts.split("\\.");
        if(ipPart.length!=4){
            return false;
        }
        for(int i=0;i<ipPart.length;i++){
            int val=Integer.parseInt(ipPart[i]);
            if(val<=0 && val>=255){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] s = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.4 bytes=32 time=50ms TTL=93"
        };
        countIp(s);
    }
}
