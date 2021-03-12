package com.acxie.learnthread.future.completablefutur20.demo1;


import org.junit.Test;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ShopTest {


    @Test
    public void executor() {
        /*java8以前异步执行*/
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Double> future = executor.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                //正在计算
                return doSomeLongComputation();
            }
        });
        doSomethingElse();
        try {
            Double res = future.get(1, TimeUnit.SECONDS);
            System.out.println(res);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
            System.out.println("ExecutionException:计算抛出一个异常 | InterruptedException:当前线程在等待过程中被中断 | TimeoutException:在Future对象完成之前超过已过期");
        }
    }

    private void doSomethingElse() {
        System.out.println("Do Something Else!!!!");
    }

    private Double doSomeLongComputation() {
        return IntStream.rangeClosed(1, 10000).asDoubleStream().sum();
    }


    //    客户所有要执行的工作都依赖于商品价格时，再调用 Future 的 get 方法。执行
    //        * 了这个操作后，客户要么获得 Future 中封装的值（如果异步任务已经完成），要么发生阻塞，直
    //        * 到该异步任务完成，期望的值能够访问



    @Test
    public void async() {
        Shop shop = new Shop();
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("my produce");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("invocation time:" + invocationTime + "msecs.");
        // 执行更多任务
        // 可以去做别的事情
        doSomethingElse();
        // 在计算商品价格的同时
        try {
            double price = futurePrice.get();
            System.out.printf("Price is %.2f%n", price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price returned after " + retrievalTime + " msecs");
        /*Result:
         * invocation time:39msecs.
         * Do Something Else!!!!
         * Price is 50000005000000.00
         * Price returned after 1126 msecs
         */
    }


}