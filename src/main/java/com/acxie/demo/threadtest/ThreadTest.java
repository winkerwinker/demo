package com.acxie.demo.threadtest;

/**
 * @description:使用Jion关键字、使用Lock
 * @author: xieaichen
 * @time: 2020/8/14 19:26
 */



public class ThreadTest {


    //顺序执行线程
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner("A"));
        Thread t2 = new Thread(new Runner("B"));
        Thread t3 = new Thread(new Runner("C"));
        //不能使用for 循环
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();

    }
}


class Runner implements Runnable{
    public String name;
    Runner(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"");
    }
}
