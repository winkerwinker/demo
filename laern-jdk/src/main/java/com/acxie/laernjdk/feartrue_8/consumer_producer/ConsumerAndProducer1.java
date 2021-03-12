package com.acxie.laernjdk.feartrue_8.consumer_producer;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/1 13:16
 */

public class ConsumerAndProducer1 {
    public int count = 0;
    public String lock = "lock";


    class Producer implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("剩下" + count++ + "个苹果");
                }
            }
        }
    }

    //并没有锁调生产和消费的逻辑

    class Consumer implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("剩下" + count-- + "个苹果");
                }
            }
        }
    }


    public static void main(String[] args) {
        ConsumerAndProducer1 cap = new ConsumerAndProducer1();
        Producer pro = cap.new Producer();
        Consumer con = cap.new Consumer();
        new Thread(pro).start();
        new Thread(con).start();

    }
}

