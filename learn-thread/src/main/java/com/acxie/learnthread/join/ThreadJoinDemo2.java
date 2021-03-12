package com.acxie.learnthread.join;

/**
 * @description: join()方法的测试
 * @author: xieaichen
 * @time: 2020/10/23 10:39
 * <p>
 * 1. 主线程启动子线程
 * 2. 子线程耗时运算
 * 3. 主线程提前结束
 * 4. 如果主线程需要知道子线程的结果，那么需要等待
 * 5. sleep一定时间、join方法
 * <p>
 * 1. 是一种阻塞的方式
 * 2. join 和 wait 会让项目进入等待状态
 * 3. Join方法实现是通过wait（Object 提供的方法）
 */


public class ThreadJoinDemo2 extends Thread {
    int i;
    Thread previousThread; //上一个线程

    public ThreadJoinDemo2(Thread previousThread, int i) {
        this.previousThread = previousThread;
        this.i = i;
    }

    @Override
    public void run() {
        try {
            //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
            previousThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("num:" + i);
        // 如何做到连续 join 切换 线程
        System.out.println("当前线程" + previousThread);
    }

    public static void main(String[] args) {
        Thread previousThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            ThreadJoinDemo2 joinDemo = new ThreadJoinDemo2(previousThread, i);
            joinDemo.start();
            previousThread = joinDemo;
        }
    }
}