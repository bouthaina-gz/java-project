package com.oca.pratique.threads;

import java.util.concurrent.TimeUnit;

 class FirstThread extends Thread {

    @Override
    public void run() {
        for(int i=0 ; i < 5; i+=2){
            System.out.println("odd" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("first thread is inntereptued");
                break;
            }
        }
    }
}

 class SecondThread implements Runnable {

     @Override
     public void run() {
         for(int i=0 ; i < 5; i++){
             try {
                 System.out.println("even");
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println("second thread is inntereptued");
                break;
             }
         }
     }
 }

public class Challange1 {

    public static void main(String[] args){
        FirstThread firstThread = new FirstThread();
        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        firstThread.interrupt();
    }
}
