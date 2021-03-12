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

// 是一个线程方法
public class ThreadJoinDemo1 extends Thread {


    int i;
    Thread preThr;

    public ThreadJoinDemo1(int i, Thread preThr) {
        this.i = i;
        this.preThr = preThr;
    }


    @Override
    public void run() {
        try {
            //调用上一个线程的join方法
            preThr.join();
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程" + preThr);
        System.out.println("当前线程" + i);
    }

    //   ThreadGroup group = getThreadGroup();
    //   todo 为什么会有 group
    public static void main(String[] args) {
        Thread preThr = Thread.currentThread();
        for (int s = 0; s < 10; s++) {
            //将上一个线程传递给下一个线程
            ThreadJoinDemo1 threadJoinDemo1 = new ThreadJoinDemo1(s, preThr);
            threadJoinDemo1.start();
            preThr = threadJoinDemo1;
        }

    }


}

