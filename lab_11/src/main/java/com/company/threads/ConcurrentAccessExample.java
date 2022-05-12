package com.company.threads;

public class ConcurrentAccessExample {

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter: " + counter.getCount());
    }
}

class Counter{
    private long count;

    Counter() {
        count = 0;
    }

    public long getCount() { return count; }

    // WRONG
//    public void add() {
//        count++;
//    }

    // RIGHT
//    synchronized public void add(){
//        count++;
//    }

    // ALSO RIGHT
    public void add(){
        synchronized(this) {
            count++;
        }
    }
}

class CounterThread extends Thread{
    private Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.add();
        }
    }
}


