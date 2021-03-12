package com.acxie.learnthread.lock.notifydemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:那么wait方法及notify也是数据对象的，他们都是对某一个对象的锁的获取和释放
 * @create: 2020/12/01 22:27
 */
public class 生产者消费者模型 {

    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
    }


    //因为线程在执行while()循环时，已经在getTask()入口获取了this锁，其他线程根本无法调用addTask()，
    // 因为addTask()执行条件也是获取this锁。
    public synchronized String getTask() {
        while (queue.isEmpty()) {
        }
        return queue.remove();
    }


}


