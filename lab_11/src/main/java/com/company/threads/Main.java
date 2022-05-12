package com.company.threads;

public class Main {

    private static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE


    public static void main(String[] args) throws InterruptedException {
        ExtendingThread thread0 = new ExtendingThread();            // or Thread thread0 = new ExtendingThread();
        ImplementingRunnable t1 = new ImplementingRunnable();
        Thread thread1 = new Thread(t1);                            // or Thread thread1 = new Thread(new ImplementingRunnable());

        // WRONG
//        thread0.run();
//        t1.run();

        // RIGHT
        thread0.start();
        thread1.start();

        thread0.setName("Speedy Gonzales");

        try{
            thread0.join();
            thread1.join();
        } catch (InterruptedException ex){
            System.out.println("Error");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(PURPLE_BOLD + i + " - " + Thread.currentThread().getName());
        }

    }

}
