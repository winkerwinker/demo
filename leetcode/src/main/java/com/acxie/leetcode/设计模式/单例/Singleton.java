package com.acxie.leetcode.设计模式.单例;

/**
 * @description:普通单例、懒汉
 * @create: 2020/02/22 14:16
 */
public class Singleton {

    private Singleton singleton = new Singleton();

    public Singleton getInstance() {
        return singleton;
    }

}




