package com.practice;



class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);

            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
public class ThreadExample {
    public static void main(String[] args){
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);

            try {
                Thread.sleep(100); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
