package com.acxie.learnthread.lock.notifydemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 当条件不满足时，线程进入等待状态；当条件满足时，线程被唤醒，继续执行任务。
 * @create: 2020/12/01 22:27
 */
public class 生产者消费者模型_1 {

    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notify(); // 唤醒在this锁等待的线程
    }


    //因为线程在执行while()循环时，已经在getTask()入口获取了this锁，其他线程根本无法调用addTask()，
    // 因为addTask()执行条件也是获取this锁。
    public synchronized String getTask() throws InterruptedException {
        while (queue.isEmpty()) {

            // 释放this锁:
            this.wait();
            // 重新获取this锁
        }
        System.out.println(queue.peek());
        return queue.remove();
    }


    public static void main(String[] args) {

        生产者消费者模型_1 生产者消费者模型_1 = new 生产者消费者模型_1();


        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        生产者消费者模型_1.getTask();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                     生产者消费者模型_1.addTask("----1");
                }
            }).start();

        }

    }
}


