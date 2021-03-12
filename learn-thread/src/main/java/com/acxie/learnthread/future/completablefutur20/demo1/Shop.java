package com.acxie.learnthread.future.completablefutur20.demo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/22 22:06
 */

public class Shop {


    /**
     * 同步阻塞式调用
     */
    public double getPrice(String product) {
        delay();
        return calcPrice(product);
    }

    /**
     * @Discription: 异步获得价格
     */
    public Future<Double> getPriceAsync(String product) {
        //开启一个线程去查询价格

        CompletableFuture<Double> futurePrice = new CompletableFuture<>();

        new Thread(() -> {
            try {
                double price = calcPrice(product);
                //如果价格计算正常结束，完成 Future 操作并设置商品价格
                futurePrice.complete(price);
            } catch (Exception e) {
                //否则就抛出导致失败的异常，完成这次 Future 操作
                futurePrice.completeExceptionally(e);
            }
        }).start();

        return futurePrice;
    }


    private double calcPrice(String product) {
        delay();
        // 执行一些其他耗时的任务
        return IntStream.rangeClosed(1, 10000000).asDoubleStream().sum();
    }


    /**
     * 模拟调用1秒钟
     */
    private static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
