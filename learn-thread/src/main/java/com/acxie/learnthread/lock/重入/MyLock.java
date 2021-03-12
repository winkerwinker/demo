package com.acxie.learnthread.lock.重入;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description:
 * @create: 2020/12/01 22:15
 */
public class MyLock implements Lock {

    //改成计数
    private boolean isLocked = false;


    @Override
    public void lock() {
        while (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true;

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
        isLocked = false;
        // notify()和 norifyAll的区别
        notifyAll();

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
