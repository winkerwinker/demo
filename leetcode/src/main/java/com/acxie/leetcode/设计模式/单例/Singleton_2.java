package com.acxie.leetcode.设计模式.单例;

/**
 * @description:饿汉\线程不安全
 * @create: 2020/02/22 14:16
 */
public class Singleton_2 {

    private Singleton_2 singleton;

    public Singleton_2 getInstance() {
        if (singleton != null) {
            return singleton;
        } else {
            singleton = new Singleton_2();
            return singleton;
        }
    }

}
