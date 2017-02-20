package com.abc.lambdas.common.first;

/**
 * Created by svshinde83 on 22/01/2017.
 */
public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
     
            @Override
            public void run() {
                System.out.println("Printed inside traditional Runnable");
            }

        });

        myThread.run();

        Runnable runnableThread = () -> System.out.println("Printed inside Lambda Runnable");
        runnableThread.run();
    }
}