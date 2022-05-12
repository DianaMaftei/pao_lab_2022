package com.company.examprep.model1;

public class Ex2 implements Runnable {
    int x;

    public Ex2(int x) {
        this.x = x;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(x);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Ex2 obj1 = new Ex2(1);
        Ex2 obj2 = new Ex2(2);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t2.join();
        System.out.print(3);
    }
}
