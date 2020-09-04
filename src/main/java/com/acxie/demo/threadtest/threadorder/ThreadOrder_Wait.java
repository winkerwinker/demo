package com.acxie.demo.threadtest.threadorder;

/**
 * @description:让线程按顺序执行8种方法
 * @author: xieaichen
 * @time: 2020/8/23 22:38
 */


//使用线程的wait方法
//wait():是Object的方法，作用是让当前线程进入等待状态，同时，wait()也会让当前线程释放它所持有的锁。“直到其他线程调用此对象的 notify() 方法或 notifyAll() 方法”，当前线程被唤醒(进入“就绪状态”)
//notify()和notifyAll():是Object的方法，作用则是唤醒当前对象上的等待线程；notify()是唤醒单个线程，而notifyAll()是唤醒所有的线程。
//wait(long timeout):让当前线程处于“等待(阻塞)状态”，“直到其他线程调用此对象的notify()方法或 notifyAll() 方法，或者超过指定的时间量”，当前线程被唤醒(进入“就绪状态”)。

public class ThreadOrder_Wait {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();


    private static Boolean t1Run = false;
    private static Boolean t2Run = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("产品");
                    t1Run = true;
                    lock1.notify();
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (lock1) {
                        if (!t1Run) {
                            lock1.wait();
                            System.out.println("开发先等等");
                            //不然会一直wait 在这里
                        }
                        synchronized (lock2) {
                            System.out.println("开发");
                            t2Run = true;
                            lock2.notify();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //如果在这里先拿到lock2，那就先测试了
                try {
                    synchronized (lock2) {
                        //他在这里先拿到了t2的锁
                        if (!t2Run) {
                            lock2.wait();
                            System.out.println("测试先等等");
                            //不然会一直wait 在这里
                        }

                        System.out.println("测试");
//                        lock1.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


//        for (int i = 0; i <80 ; i++) {
//            thread1.start();//已经开始了，是不能在开始的
//            thread2.start();
//            thread3.start();
//        }


        //但是这样必须是三个都是按顺序进入线程
        thread1.start();//已经开始了，是不能在开始的
        thread2.start();
        thread3.start();

//产品
//开发
//测试先等等
//测试


    }


}


/**
 notify和notifyAll的最主要的区别是：notify只是唤醒一个正在wait当前对象锁的线程，而notifyAll唤醒所有。
 值得注意的是：notify是本地方法，

 <h4>具体唤醒哪一个线程由虚拟机控制；<h4/>

 notifyAll后并不是所有的线程都能马上往下执行，它们只是跳出了wait状态，接下来它们还会是竞争对象锁
 */