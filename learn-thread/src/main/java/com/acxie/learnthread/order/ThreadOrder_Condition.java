package com.acxie.learnthread.order;

/**
 * @description:让线程按顺序执行8种方法
 * @author: xieaichen
 * @time: 2020/8/23 22:38
 */


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition是一个多线程间协调通信的工具类，使得某个，或者某些线程一起等待某个条件（Condition）,
 * 只有当该条件具备( signal 或者 signalAll方法被调用)时 ，
 * 这些等待线程才会被唤醒，从而重新争夺锁。
 * <p>
 * <p>
 * condition1.signal(); 对应 condition1.await();
 * lock1.notify(); 对应 condition1.await();
 * <p>
 * <p>
 * 只有拿到锁才能调用condition ，所以 1/ 2 有严格顺序
 */
public class ThreadOrder_Condition {


    private static Lock lock = new ReentrantLock();

    //指定某个锁的condition，不然也不知道是要满足哪个锁的条件，
    //满足条件==开锁
    //用两个condition 替代两把锁
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();

    private static Boolean t1Run = false;
    private static Boolean t2Run = false;

    public static void main(String[] args) {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("产品");
                t1Run = true;
                condition1.signal();
                lock.unlock();
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();    //2
                    //为什么不能直接去判断是不是满足condition了呢，每次一进来就是锁住的
                    if (!t1Run) {   //1
                        condition1.wait();
                    }

                    System.out.println("开发");

                    t2Run = true;
                    condition2.signal();
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    if (!t2Run) {
                        condition2.wait();

                    }

                    System.out.println("测试");
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread1.start();
        thread2.start();
        thread3.start();
    }

}
