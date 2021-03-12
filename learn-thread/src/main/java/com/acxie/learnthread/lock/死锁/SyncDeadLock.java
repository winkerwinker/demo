package com.acxie.learnthread.lock.死锁;

/**
 * @description:
 * @create: 2020/12/02 01:28
 */
public class SyncDeadLock {

    Object lock1 = new Object();
    Object lock2 = new Object();


    public void test() throws InterruptedException {
        synchronized (lock1) {
            System.out.println("第一步");
            Thread.sleep(1000);


            synchronized (lock2) {
                System.out.println("第二步");
            }
        }


    }

    //必须要持有两个锁

    public void test1() throws InterruptedException {
        synchronized (lock2) {
            System.out.println("第一步---");
            Thread.sleep(1000);


            synchronized (lock1) {
                System.out.println("第二步---");
            }
        }

    }

    public static void main(String[] args) {
        SyncDeadLock syncDeadLock = new SyncDeadLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    syncDeadLock.test();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    syncDeadLock.test1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
