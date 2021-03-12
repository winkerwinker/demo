package com.acxie.learnthread.order;

/**
 * @description:让线程按顺序执行8种方法
 * @author: xieaichen
 * @time: 2020/8/23 22:38
 */


import java.util.concurrent.CountDownLatch;


public class ThreadOrder_CountDownLatch {

    private static CountDownLatch c1 = new CountDownLatch(1);
    private static CountDownLatch c2 = new CountDownLatch(1);

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("产品");
                c1.countDown();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("开发");
                c2.countDown();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("测试");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
