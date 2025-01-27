package com.practice;


class Employee{
    private int id;
    private String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Employee{ id=" +id+ ",name=" + name + " }";
    }
}
public class Encapsulation {
    public static void main(String[] args){

        Employee e=new Employee(1, "Alice");
        System.out.println(e);



    }
}
