package com.company.threads;

import java.util.Scanner;


public class InterruptExample {

    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessageRunnable());
        helloThread.setName("Runnable1");
        helloThread.start();

        Scanner in = new Scanner(System.in);

        System.out.println("Somebody stop me!");

        while (in.next().compareTo("stop") != 0) {
            System.out.println("Somebody stop me!");
        }

        helloThread.interrupt();

        System.out.println("Stopped.");
    }
}

class MessageRunnable implements Runnable {

    private long counter = 0;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            counter++;
        }
        System.out.println("Counter reached: " + counter);
    }
}
