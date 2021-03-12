package com.acxie.learnthread.helper;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @description: cyclicBarrier  给定时间限制，如果还有没有到达barrier 的  直接抛出异常并继续
 * @author: xieaichen
 * @time: 2020/10/23 15:38
 */

public class CyclicBarrierDemo_时间限制 {

    public static void main(String[] args) throws InterruptedException {
        final int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  -  addtion");
            }
        });

        for (int i = 0; i < N; i++) {
            if (i == N-1) {
                Thread.sleep(5000);
            }
            new Thread(new MyThread3(cyclicBarrier)).start();
        }

    }

}

/**
 * @Discription:　从结果可以看出，当四个线程都到达barrier状态后，会从四个线程中选择一个线程去执行Runnable。
 */
class MyThread2 implements Runnable {

    private CyclicBarrier barrier;

    public MyThread2(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        // 任务阻塞 1 秒
        try {
            //　　第一个版本比较常用，用来挂起当前线程，直至所有线程都到达barrier状态再同时执行后续任务；
            System.out.println(Thread.currentThread().getName() + "  -  waiting ...");
            //todo cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);
            barrier.await(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
    }
}

