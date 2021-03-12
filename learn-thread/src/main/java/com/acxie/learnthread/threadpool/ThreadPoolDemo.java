package com.acxie.learnthread.threadpool;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/22 21:29
 */

public class ThreadPoolDemo {


    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.execute(new Task("a"));
        threadPool.execute(new Task("c"));
        threadPool.execute(new Task("d"));

        //todo 主程序卡顿
        while (threadPool.isTerminated()) {

        }

        System.out.println();
    }


}


class Task implements Runnable {
    private String id;

    Task(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread " + id + " is working");
        try {
            //每个任务随机延时1s以内的时间以模拟线程的运行
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + id + " over");
    }
}



