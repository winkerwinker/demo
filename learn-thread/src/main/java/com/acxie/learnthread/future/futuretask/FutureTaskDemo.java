package com.acxie.learnthread.future.futuretask;


import org.junit.Test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/22 16:47
 */

public class FutureTaskDemo {


    @Test
    public void test1() throws InterruptedException, ExecutionException {

        long starttime = System.currentTimeMillis();

        //input2生成， 需要耗费3秒
        FutureTask<Integer> input2_futuretask = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 5;
            }
        }) {
            @Override
            protected void done() {
                try {
                    System.out.println(get() + " FurtureTask!!!!!！");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        new Thread(input2_futuretask).start();

        //input1生成，需要耗费2秒
        FutureTask<Integer> input1_futuretask = new FutureTask(() -> {
            Thread.sleep(2000);
            return 3;
        }){
            @Override
            protected void done() {
                try {
                    System.out.println(get() + " FurtureTask2222!!!!!！");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        new Thread(input1_futuretask).start();

        Integer integer2 = input2_futuretask.get();
        Integer integer1 = input1_futuretask.get();
        System.out.println(algorithm(integer1, integer2));
        long endtime = System.currentTimeMillis();
        System.out.println("用时：" + (endtime - starttime));
    }

    //这是我们要执行的算法
    public int algorithm(int input, int input2) {
        return input + input2;
    }


}


/**
 * @Discription:我的FutureTask
 */
class MyFutureTask extends FutureTask<String> {


    //FutureTask实现了RunnableFuture接口，而RunnableFuture又是继承了Runnable和Future的，所以FutureTask就是实现了Runnable和Future的。所以它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值,管理任务。
    //
    //为什么一定要匹配构造函数
    public MyFutureTask(Callable<String> callable) {
        super(callable);
    }

    //回调函数，当任务完成时就会被出发
    @Override
    protected void done() {


        try {
            System.out.println(get() + " 线程执行完毕！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}


//创建一个任务，随机睡眠10s之内
class Task1 implements Callable<String> {
    public String call() throws Exception {
        Random rand = new Random();
        Thread.sleep(rand.nextInt(10));
        return Thread.currentThread().getName();
    }

}