package com.acxie.leetcode.设计模式.单例;

/**
 * @description:普通单例、静态代码块创建
 * @create: 2020/02/22 14:16
 */
public class Singleton_1 {

    private Singleton_1 singleton;

    {
        singleton = new Singleton_1();
    }

    public Singleton_1 getInstance() {
        return singleton;
    }

}
