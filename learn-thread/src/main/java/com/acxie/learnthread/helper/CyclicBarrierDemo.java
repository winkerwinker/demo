package com.acxie.learnthread.helper;

import java.util.concurrent.CyclicBarrier;

/**
 * @description: cyclicBarrier 卡住所有线程让线程继续下去
 * @author: xieaichen
 * @time: 2020/10/23 15:38
 */

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        final int N = 4;
        //        CyclicBarrier barrier  = new CyclicBarrier(N);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);

        for (int i = 0; i < N; i++) {
            new Thread(new MyThread3(cyclicBarrier)).start();
        }

    }

}


class MyThread implements Runnable {

    private CyclicBarrier barrier;

    public MyThread(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        // 任务阻塞 1 秒
        try {
            Thread.sleep(1000);
            //　　第一个版本比较常用，用来挂起当前线程，直至所有线程都到达barrier状态再同时执行后续任务；
            System.out.println(Thread.currentThread().getName() + "waiting ...");
//            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        catch (BrokenBarrierException e) {
//            e.printStackTrace();
//        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
    }
}

