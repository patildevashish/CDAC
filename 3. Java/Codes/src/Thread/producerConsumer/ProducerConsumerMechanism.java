package Thread.producerConsumer;

import java.util.*;

class Producer implements Runnable {
    private final Vector<Integer> buffer;
    private final int SIZE;

    public Producer(Vector<Integer> buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public void produce(int i) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == SIZE) {
                System.out.println("The buffer is full and waiting to consume items " + buffer.size());
                buffer.wait(); // blocked production
            }
            buffer.add(i);
            System.out.println("Produced item " + i);
            buffer.notifyAll(); // Unblock Consumer
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    private final Vector<Integer> buffer;
    private final int SIZE;

    public Consumer(Vector<Integer> buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public int consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                System.out.println("The buffer is empty and waiting to produce items " + buffer.size());
                buffer.wait(); // blocked consumption
            }
            int item = buffer.remove(0);
            System.out.println("Consumed item " + item);
            buffer.notifyAll();
            return item;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class ProducerConsumerMechanism {
    public static void main(String[] args) {
        Vector<Integer> buffer = new Vector<>();
        int size = 5;

        Producer p = new Producer(buffer, size);
        Consumer c = new Consumer(buffer, size);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
