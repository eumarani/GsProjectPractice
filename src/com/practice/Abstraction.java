package com.practice;


abstract class Animal{
    abstract void bark();

    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{

    @Override
    void bark() {
        System.out.println("Dog is barking");
    }
   /* void eat(){
        System.out.println("Dog is eating");
    }*/
}
public class Abstraction {
    public static void main(String[] args){

        Animal a=new Dog();
        a.bark();
        a.eat();

    }
}
