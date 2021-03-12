package com.acxie.learnthread.join;

/**
 * @description: join()方法的异常测试
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


public class ThreadJoinDemo4 extends Thread {

    public ThreadJoinDemo4() {
        super("mydemo3");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run.....");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        String name = Thread.currentThread().getName();
        System.out.println("当前线程" + name);


        ThreadJoinDemo4 threadJoinDemo3 = new ThreadJoinDemo4();

        //在我的Java程序主线程中不会被中断。为什么
        Thread.currentThread().interrupt();

        threadJoinDemo3.start();
//        Thread.currentThread().interrupt();
        threadJoinDemo3.join();

        System.out.println("all done");

    }
}