package com.acxie.learnthread.lock.重入;

/**
 * @description:
 * @create: 2020/12/01 22:20
 */
public class Sequence {


    MyLock myReentrantLock = new MyLock();

    void say(String msg) {
        System.out.println(msg);
    }

    public void a() {
        myReentrantLock.lock();
        say("a");
        b();
        myReentrantLock.unlock();
    }

    public void b() {
        //Exception in thread "main" java.lang.IllegalMonitorStateException
        myReentrantLock.lock();
        say("b");
        myReentrantLock.unlock();
    }

    public static void main(String[] args) {
        new Sequence().a();
    }
}
