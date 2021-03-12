package com.acxie.learnthread.future.completablefutur20.demo2;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/22 22:31
 */

public class Demo1 {


    /**
     * @Discription:可执行特定线程池或自定义线程池执行,否则默认使用ForkJoinPool.commonPool()线程池
     */
    @Test
    public void test1() {
        CompletableFuture.runAsync(() -> System.out.println("run test1"));


        //    runnable+ executor
        CompletableFuture.runAsync(() -> System.out.println("run test2"), Executors.newSingleThreadExecutor());


        //But suppyAsync takes Supplier as argument and returns the CompletableFuture<U> with result value, which means it does not take any input parameters but it returns result as output.
        // suppiler means  it does not take any inpuit but returns result as output

        CompletableFuture.supplyAsync(() -> {
            System.out.println("run test3");
            return new Random().nextInt();
        });


        CompletableFuture.supplyAsync(() -> {
            System.out.println("run test4");
            return new Random().nextInt();
        }, Executors.newSingleThreadExecutor());


        //这一步是用来做什么
        CompletableFuture<String> test = CompletableFuture.completedFuture("test");

        CompletableFuture<Object> objectCompletableFuture = new CompletableFuture<>();

    }

}
