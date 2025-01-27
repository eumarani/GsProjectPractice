package com.excelSheet;

import java.util.ArrayList;
import java.util.List;

public class President {
    public static List<Integer> findPresident(int n,int k){
        int current_index=0;

        List<Integer> student=new ArrayList<>();
        for(int i=1;i<=n;i++){
            student.add(i);
        }
        System.out.println(student);
        while(student.size()>1){
            current_index=(current_index+k-1)%student.size();
            student.remove(current_index);

        }
        return student;
    }
    public static void main(String[] args){
        int n=10,k=6;
        List<Integer> result=findPresident(10,6);
        for(int i:result){
            System.out.println(i);
        }

    }
}
