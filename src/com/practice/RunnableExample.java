package com.practice;


class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }

}
public class RunnableExample {
    public static void main(String[] args){
        MyRunnable r=new MyRunnable();
        Thread t1=new Thread(r);
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }

    }
}
