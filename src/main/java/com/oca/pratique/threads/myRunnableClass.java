package com.oca.pratique.threads;

import java.util.concurrent.TimeUnit;

public class myRunnableClass {

    public static void main(String[] args){

        Runnable myRunnable = () -> {
            for(int i=0; i<7;i++){
                System.out.println(" hello ");
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        new Thread(myRunnable).start();

        for(int i=0; i<7;i++){
            System.out.println(" hello main");
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
