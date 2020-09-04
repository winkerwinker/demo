package com.acxie.demo.threadtest.reenterlock;

import org.junit.Test;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/24 0:09
 */

class Unreentrantlock {


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