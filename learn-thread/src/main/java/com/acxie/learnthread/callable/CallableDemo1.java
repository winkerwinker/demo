package com.acxie.learnthread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 15:10
 */

public class CallableDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable myCallable = new MyCallable("acxie");

        //FutureTask 包裹 MyCallback
        FutureTask<String> integerFutureTask = new FutureTask<String>(myCallable);

        new Thread(integerFutureTask).start();

        // 会阻塞线程
        String s = integerFutureTask.get();
        System.out.println(s);
    }
}


class MyCallable implements Callable {

    private String acceptStr;

    public MyCallable(String acceptStr) {
        this.acceptStr = acceptStr;
    }


    @Override
    public String call() throws Exception {
        // 任务阻塞 1 秒
        Thread.sleep(1000);
        return this.acceptStr + " append some chars and return it!";
    }


}
