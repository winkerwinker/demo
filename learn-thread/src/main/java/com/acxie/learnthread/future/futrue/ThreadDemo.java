package com.acxie.learnthread.future.futrue;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/26 14:42
 */

public class ThreadDemo {


    /**
     * @Discription:threadPool.execute(()
     */

    @Test
    public void threadTest() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService threadPool = Executors.newCachedThreadPool();//线程池里面的线程数会动态变化，并可在线程线被移除前重用
        for (int i = 1; i <= 3; i++) {
            final int task = i;   //10个任务
            //去掉第6行的注释其输出如下：（始终重复利用一条线程，因为newCachedThreadPool能重用可用线程）
            TimeUnit.SECONDS.sleep(2);
            threadPool.execute(() -> System.out.println("线程名字： " + Thread.currentThread().getName() + "  任务名为： " + task));
        }
        System.out.println("All Task Speed Time: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    /**
     * @Discription:
     */
    @Test
    public void threadTest1() throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> submit = executor.submit(() -> Math.random() * 10 + "");
        System.out.println(submit.get());

        System.out.println("All Task Speed Time: " + (System.currentTimeMillis() - startTime) + "ms");
    }


    /**
     * @Discription: ExecutorCompletionService:实现了CompletionService，将执行完成的任务放到阻塞队列中，通过take或poll方法来获得执行结果
     * take或poll的区别
     * 队列的方法列举
     * 1. 添加
     * 1. add：队列满，抛出异常
     * 1. offer ：队列满，返回false
     * 1. put： 队列满，阻塞、
     * 2. 移除： remove、 poll、 take
     * 3. 返回： element、peek
     */
    @Test
    public void threadTes2() throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        //   ExecutorService接口定义了线程池应该具有的行为特征，它具有以下主要方法
        ExecutorService executor = Executors.newFixedThreadPool(10);

        CompletionService completionService = new ExecutorCompletionService(executor);

        for (int i = 0; i < 10; i++) {
            completionService.submit(() -> new Random().nextInt(10));
        }

        for (int i = 0; i < 11; i++) {
            //如果有一个拿不到，那会一直阻塞
            System.out.println(completionService.take().get());
        }

        System.out.println("All Task Speed Time: " + (System.currentTimeMillis() - startTime) + "ms");
    }


}




