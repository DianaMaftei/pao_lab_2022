package com.company.threads;

import java.util.LinkedList;

public class ProducerConsumer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity;

    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int x) throws InterruptedException {
        while (list.size() == capacity) {
            wait(); // firul se auto suspenda, intra intr-o stare de asteptare
        }

        list.add(x);
        System.out.println("Producer produced - " + x);

        notifyAll(); // instiintare fire in asteptare ca a efectuat o actiune
    }

    public synchronized void consume() throws InterruptedException {
        while (list.size() == 0) {
            wait(); // firul se auto suspenda, intra intr-o stare de asteptare
        }

        int val = list.removeFirst();
        System.out.println("Consumer consumed - " + val);

        notifyAll(); // instiintare fire in asteptare ca a efectuat o actiune
    }
}

class MainProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                    pc.produce(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                    pc.consume();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
