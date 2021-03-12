package com.acxie.learnthread.helper;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 15:34
 */

public class CountDownLatchDemo_自定义 {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < 2; i++) {
            new Thread(new MyThread4(latch)).start();
        }
    }


}


/**
 * @Discription: 仿造cyclicBarrier传参
 */
class MyThread4 implements Runnable {

    private CountDownLatch latch;

    public MyThread4(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        // 任务阻塞 1 秒
        try {
            Thread.sleep(1000);
            //　　第一个版本比较常用，用来挂起当前线程，直至所有线程都到达barrier状态再同时执行后续任务；
            System.out.println(Thread.currentThread().getName() + "  -  waiting ...");
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
    }
}