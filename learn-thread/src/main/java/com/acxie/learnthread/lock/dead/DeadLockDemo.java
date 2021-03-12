package com.acxie.learnthread.lock.dead;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/4 18:23
 */

public class DeadLockDemo {


    static Object object = new Object();
    static Object object1 = new Object();

    //或者用匿名函数来写
    static Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println("get resource1");

                System.out.println("waiting get resource2");
                synchronized (object1) {
                    System.out.println("get resource2");
                }
            }

        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (object1) {
                System.out.println("get resource2");

                System.out.println("waiting get resource1");
                synchronized (object) {
                    System.out.println("get resource1");
                }
            }
        }
    });


//1. 互斥条件：该资源任意⼀个时刻只由⼀个线程占⽤。
//2. 请求与保持条件：⼀个进程因请求资源⽽阻塞时，对已获得的资源保持不放。
//3. 不剥夺条件:线程已获得的资源在末使⽤完之前不能被其他线程强⾏剥夺，只有⾃⼰使⽤完毕后
//才释放资源。
//4. 循环等待条件:若⼲进程之间形成⼀种头尾相接的循环等待资源关系

    public static void main(String[] args) {
        thread2.start();
        thread.start();

    }
}


