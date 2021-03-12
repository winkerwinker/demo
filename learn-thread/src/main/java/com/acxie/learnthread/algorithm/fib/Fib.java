package com.acxie.learnthread.algorithm.fib;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 11:56
 */

public class Fib implements Callable<Integer> {


    int n;

    public Fib(int n) {
        this.n = n;
    }


    // 递归 fib 不带 备忘录循环
/*    @Override
    public Integer call() throws Exception {
        if (n < 1) {
            return n;
        }
        //使用 Future  框架去写 fib
        return fib(n - 1) + fib(n - 2);
    }*/




    public static void main(String[] args) {


    }


    @Override
    public Integer call() throws Exception {
        return null;
    }
}
