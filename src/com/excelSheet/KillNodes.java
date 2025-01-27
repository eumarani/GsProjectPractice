package com.excelSheet;

import java.util.*;

public class KillNodes {
    public static List<Integer> cal(int[] pids, int[] cids, int kill) {
        Map<Integer, Integer> parentMap = new HashMap<>();
        for (int i = 0; i < pids.length; i++) {
            parentMap.put(cids[i], pids[i]);
        }
        Set<Integer> killedNodes=new HashSet<>();
        killedNodes.add(kill);

        while(parentMap.containsKey(kill)){
            kill=parentMap.get(kill);
            killedNodes.add(kill);

        }
        List<Integer> result=new ArrayList<>(killedNodes);
        return result;
    }


    public static void main(String[] args){
        int[] pids = {6, 4, 8, 5}; // Parent ids
        int[] cids = {1, 2, 3, 0}; // Child ids
        int kill = 3; // Node to kill

        System.out.println(cal(pids,cids,kill));
    }
}
