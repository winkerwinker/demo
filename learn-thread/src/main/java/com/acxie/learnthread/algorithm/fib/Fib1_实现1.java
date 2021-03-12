package com.acxie.learnthread.algorithm.fib;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 14:10
 */

public class Fib1_实现1 implements  Runnable{


    public static int num = 2;   //用于记录角标，静态变量实现多线程共享
    public int numRe;     //用于记录角标，常量实现线程内角标持久化

    public static int a = 0;     //f[n-2]
    public static int b = 1;     //f[n-1]
    public int c;          //f[n]

    public Fib1_实现1() {
        c = a + b;
        a = b;
        b = c;
        numRe = num++;
    }

    @Override
    public void run() {
        System.out.println("F[" + numRe + "]=" + c);
        Thread.yield();
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 它的计算逻辑其实在初始化里面，多线程只做了打印的工作其实严格意义上不算多线程fib
            new Thread(new Fib1_实现1()).start();
        }
    }


/*
    F[2]=1
    F[4]=3
    F[3]=2
    F[5]=5
    F[6]=8
    F[7]=13
    F[8]=21
    F[9]=34
    F[10]=55
    F[11]=89
*/


}
