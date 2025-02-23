package com.oca.pratique.threads;

public class myThreadClass extends Thread {

    @Override
    public void run(){
        System.out.println("hello i am a thread class"+getName()  );
    }

    public static void main(String[] args){
        new myThreadClass().start();

        System.out.println(
                "Thread '" + Thread.currentThread().getClass().getName() + "' is being executed. "
        );
    }
}
