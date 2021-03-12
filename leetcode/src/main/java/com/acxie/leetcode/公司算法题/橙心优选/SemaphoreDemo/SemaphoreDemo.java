package com.acxie.leetcode.公司算法题.橙心优选.SemaphoreDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        final Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 20; i++) {
            final int NO = i;
            Runnable runnable = () -> {
                try {
                    semaphore.acquire();
                    System.out.println("accessing:" + NO);
                    Thread.sleep((long) (Math.random() * 10000));
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            };
            executorService.execute(runnable);

        }
        executorService.shutdown();
    }
}
