package com.company.threads;

public class ExtendingThread extends Thread {

    private static final String BLUE = "\033[0;34m";    // BLUE

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(BLUE + i + " - " + Thread.currentThread().getName());
        }
    }

}
