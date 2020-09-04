package com.acxie.demo.consumerAndProduce;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/1 13:16
 */

public class ConsumerAndProducer {


    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == FULL) {
                        try {
                            LOCK.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (Exception e) {
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    //生产一个消费一个、生产一个消费一个
    public static void main(String[] args) {
        ConsumerAndProducer cap = new ConsumerAndProducer();
        new Thread(cap.new Producer()).start();
        new Thread(cap.new Consumer()).start();

    }
}
