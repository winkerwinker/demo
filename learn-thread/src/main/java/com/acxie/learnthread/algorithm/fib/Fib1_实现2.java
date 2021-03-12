package com.acxie.learnthread.algorithm.fib;


import java.util.concurrent.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 14:10
 */


public class Fib1_实现2 {

    private int getVal(int n) {
        if (n < 3)
            return 1;
        else
            return getVal(n - 1) + getVal(n - 2);
    }


    private void fibMain(int n) {

        // 多线程执行
        long start = System.currentTimeMillis();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);


        Future<Integer> submit = threadPool.submit(new MyCallable(n));
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start + " -  多线程用时间 ");

        // 多线程执行

        start = System.currentTimeMillis();

        System.out.println(getVal(n));

        end = System.currentTimeMillis();
        System.out.println(end - start + " -  单线程用时间 ");
    }


    public static void main(String[] args) {

        new Fib1_实现2().fibMain(20);
    }
}


class MyCallable implements Callable<Integer> {
    private int n;

    MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        return getVal(n);
    }

    private int getVal(int n) {
        if (n < 3)
            return 1;
        else
            //内嵌部分不是多线程，只有最外面一层是走的多线程
            return getVal(n - 1) + getVal(n - 2);
    }
}