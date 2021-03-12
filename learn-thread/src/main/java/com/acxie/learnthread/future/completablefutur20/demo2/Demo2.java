package com.acxie.learnthread.future.completablefutur20.demo2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * @description:allOf 、 anyOf
 * @author: xieaichen
 * @time: 2020/10/22 22:31
 */


@Slf4j
public class Demo2 {


    /**
     * @Discription： all of 的testcase
     */
    @Test
    public void test1() {


        long start = System.currentTimeMillis();

        CompletableFuture<Void> void1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(start - System.currentTimeMillis() + "I have done Nothing");
        });

        CompletableFuture<Void> void2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(start - System.currentTimeMillis() + "Metoo");
        }, Executors.newSingleThreadExecutor());

        // 并行异步执行


        //: aLL OF 的Testcase
        CompletableFuture.allOf(void1, void2).thenRun(() -> {
            System.out.println(start - System.currentTimeMillis() + "all done");
        }).join();


    }


    /**
     * @Discription： any of 的testcase
     */
    @Test
    public void test2() {


        long start = System.currentTimeMillis();

        CompletableFuture<Void> void1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(start - System.currentTimeMillis() + "I have done Nothing");
        });

        CompletableFuture<Void> void2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(start - System.currentTimeMillis() + "Metoo");
        }, Executors.newSingleThreadExecutor());

        //: any OF 的Testcase
        CompletableFuture.anyOf(void1, void2).thenRun(() -> {
            System.out.println(start - System.currentTimeMillis() + "all done");
        }).join();

    }

}


// join  的区别

//        .join()的作用是什么