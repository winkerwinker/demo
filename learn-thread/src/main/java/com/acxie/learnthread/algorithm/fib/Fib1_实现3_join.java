package com.acxie.learnthread.algorithm.fib;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 14:10
 */

public class Fib1_实现3_join {
    public static void main(String[] args) throws Exception {

        Fib f = new Fib(10);
        Integer call = f.call();
        System.out.println(call);

    }
}

class MyFib implements Callable {

    int x;

    public MyFib(int x) {
        this.x = x;
    }

    @Override
    public Integer call() throws Exception {

        if (x <= 2)
            return 1;
        else {
            MyFib f1 = new MyFib(x - 1);
            MyFib f2 = new MyFib(x - 2);
            // 去call 返回什么
            Integer call = f1.call();
            Integer call1 = f2.call();
            return call + call1;
        }
    }


}
