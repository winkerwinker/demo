package com.acxie.learnthread.join;

/**
 * @description: 多线程传递参数
 * @author: xieaichen
 * @time: 2020/10/23 10:39
 */


import org.junit.Test;

/**
 * @Discription: 1. 构造参数传递
 */
class Mythre extends Thread {
    String name;

    public Mythre(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }
}


/**
 * @Discription: 1. 构造参数传递
 */
class Mythre1 extends Thread {
    String name;

    public Mythre1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }
}


public class ThreadJoinDemo_参数传递 {

    @Test
    public void test() {
        Thread thread = new Mythre("world");
        thread.start();
    }


    @Test
    public void test1() {
        Thread thread = new Mythre("world");
        thread.start();
    }


}