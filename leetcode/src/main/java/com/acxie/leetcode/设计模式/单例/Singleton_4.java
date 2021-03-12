package com.acxie.leetcode.设计模式.单例;

/**
 * @description:饿汉，在方法内部一部分代码块加锁、双重校验锁
 * @create: 2020/02/22 14:16
 */
public class Singleton_4 {

    private Singleton_4 singleton;

    public Singleton_4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {//用类当持有锁的对象到底是什么意思
                if (singleton == null) {
                    singleton = new Singleton_4();
                }
            }
        }
        return singleton;

    }

}
