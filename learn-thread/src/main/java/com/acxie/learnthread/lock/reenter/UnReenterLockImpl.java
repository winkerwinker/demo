package com.acxie.learnthread.lock.reenter;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/24 0:53
 */

// 非可重入锁实现
public class UnReenterLockImpl {
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}