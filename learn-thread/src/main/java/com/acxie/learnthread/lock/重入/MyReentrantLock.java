package com.acxie.learnthread.lock.重入;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description:
 * @create: 2020/12/01 22:15
 */
public class MyReentrantLock implements Lock {

    //改成计数
    private boolean isLocked = false;

    private int lockedCount;
    //为什么需要lockedBy
    private Thread lockedBy;


    @Override
    public void lock() {
        //别的线程无法解开自己的锁
        while (isLocked && lockedBy != Thread.currentThread()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isLocked = true;
        lockedCount++;
        lockedBy = Thread.currentThread();

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        if (lockedBy == Thread.currentThread()) {
            lockedCount--;
            if (lockedCount == 0) {
                isLocked = false;
                notify();

                // 唤醒这个对象 所有对wait
            }
        }

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
