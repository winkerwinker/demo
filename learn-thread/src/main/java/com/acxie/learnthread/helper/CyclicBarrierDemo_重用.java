package com.acxie.learnthread.helper;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description: cyclicBarrier  而CountDownLatch无法进行重复使用。
 * @author: xieaichen
 * @time: 2020/10/23 15:38
 */

public class CyclicBarrierDemo_重用 {

    public static void main(String[] args) throws InterruptedException {
        final int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "  -  addtion");
            }
        });

        for (int i = 0; i < N; i++) {
            new Thread(new MyThread3(cyclicBarrier)).start();
        }


        for (int i = 0; i < N; i++) {
            new Thread(new MyThread3(cyclicBarrier)).start();
        }

    }

}

/**
 * @Discription:　可以重用
 */
class MyThread3 implements Runnable {

    private CyclicBarrier barrier;

    public MyThread3(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        // 任务阻塞 1 秒
        try {
            //　　第一个版本比较常用，用来挂起当前线程，直至所有线程都到达barrier状态再同时执行后续任务；
            System.out.println(Thread.currentThread().getName() + "  -  waiting ...");
            //todo cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
    }
}

