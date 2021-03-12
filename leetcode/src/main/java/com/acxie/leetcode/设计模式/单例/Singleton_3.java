package com.acxie.leetcode.设计模式.单例;

/**
 * @description:饿汉、加锁、线程安全
 * @create: 2020/02/22 14:16
 */
public class Singleton_3 {

    private Singleton_3 singleton;

    public synchronized Singleton_3 getInstance() {
        if (singleton != null) {
            return singleton;
        } else {
            singleton = new Singleton_3();
            return singleton;
        }
    }

}
