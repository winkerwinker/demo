package com.acxie.learnthread.lock.reenter;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/24 1:28
 */

//使用cas 实现一个不可重入锁
public class UnReenterLockImpl_CAS {


    private AtomicReference<Thread> owner = new AtomicReference<Thread>();

    public void lock() {
        Thread current = Thread.currentThread();
        //这句是很经典的“自旋”语法，AtomicInteger中也有
        for (; ; ) {
            if (owner.compareAndSet(null, current)) {
                return;
            }
        }
    }


    public void unlock() {
        Thread current = Thread.currentThread();
        owner.compareAndSet(current, null);
    }


    @Test
    public void run() {
        // 快捷键 ca + 空格
        // 快捷键 ca + v
        UnReenterLockImpl_CAS lock = new UnReenterLockImpl_CAS();
        lock.lock();
        lock.lock();
        System.out.printf("111");
        lock.unlock();
        lock.unlock();
    }

}


class ReenterLockImpl_CAS {


    private AtomicReference<Thread> owner = new AtomicReference<Thread>();
    private int state = 0;

    public void lock() {
        Thread current = Thread.currentThread();
        //这句是很经典的“自旋”语法，AtomicInteger中也有
        if (owner.get() == current) {
            state++;
        }
        for (; ; ) {
            if (owner.compareAndSet(null, current)) {
                return;
            }
        }
    }


    public void unlock() {
        Thread current = Thread.currentThread();
        if (current == owner.get()) {
            if (state != 0) {
                state--;
            } else {
                owner.compareAndSet(current, null);
            }
        }
    }


    @Test
    public void run() {
        // 快捷键 ca + 空格
        // 快捷键 ca + v
        UnReenterLockImpl_CAS lock = new UnReenterLockImpl_CAS();
        lock.lock();
        lock.lock();
        System.out.printf("111");
        lock.unlock();
        lock.unlock();
    }

}