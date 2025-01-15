package com.factoryPattern;

public class FactoryPatternExample {
    public static void main(String[] args){
        Vechile vechile1=new Car();
        vechile1.drive();

        Vechile vechile2=new Bike();
        vechile2.drive();
    }
}
