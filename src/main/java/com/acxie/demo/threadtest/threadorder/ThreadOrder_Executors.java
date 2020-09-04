package com.acxie.demo.threadtest.threadorder;

/**
 * @description:让线程按顺序执行8种方法
 * @author: xieaichen
 * @time: 2020/8/23 22:38
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JAVA通过Executors提供了四种线程池
 * <p>
 * 单线程化线程池(newSingleThreadExecutor);
 * 可以用于串行执行所有的任务
 * submit()：提交任务。
 * shutdown()：方法用来关闭线程池，拒绝新任务。
 * PS: 可以用于循环顺序打印
 * <p>
 * 可控最大并发数线程池(newFixedThreadPool);
 * <p>
 * 可回收缓存线程池(newCachedThreadPool);
 * <p>
 * 支持定时与周期性任务的线程池(newScheduledThreadPool)。
 */


public class ThreadOrder_Executors {


    static ExecutorService executorService = Executors.newSingleThreadExecutor();


    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开发人员开发新需求功能");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试人员测试新功能");
            }
        });


        for (int i = 0; i < 10; i++) {

            executorService.submit(thread1);
            executorService.submit(thread2);
            executorService.submit(thread3);
        }

        executorService.shutdown();
    }
}
