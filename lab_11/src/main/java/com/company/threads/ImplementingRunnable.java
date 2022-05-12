package com.company.threads;

public class ImplementingRunnable implements Runnable {

    private static final String GREEN_BOLD = "\033[1;32m";  // GREEN

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(GREEN_BOLD + i + " - " + Thread.currentThread().getName());
        }
    }
}
