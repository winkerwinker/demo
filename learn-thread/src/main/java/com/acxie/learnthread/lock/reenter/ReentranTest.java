package com.acxie.learnthread.lock.reenter;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/24 0:13
 */


//锁空闲：直接获取锁并返回，同时设置锁持有者数量为：1；
//当前线程持有锁：直接获取锁并返回，同时锁持有者数量递增1；
//其他线程持有锁：当前线程会休眠等待，直至获取锁为止；

public class ReentranTest {

    static ReentrantLock lock = new ReentrantLock();


    static void test() {
//        try {
        lock.lock();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.printf("进入了内层方法");
        lock.unlock();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
                lock.lock();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                lock.lock();
//                try {
//                    System.out.printf("不会死锁");
//                } finally {
//                    lock.unlock();

                test();
                lock.unlock();
            }
        });

        thread.run();
    }


}
