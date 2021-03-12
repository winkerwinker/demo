package com.acxie.leetcode.设计模式.单例;

/**
 * @description:饿汉，静态内部类实现单例
 * @create: 2020/02/22 14:16
 */
public class Singleton_5 {

    private static class SingletonHolder {
        private static final Singleton_5 INSTANCE = new Singleton_5();
    }

    //因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
    public Singleton_5 getInstance() {
        //静态内部类不一定被装载
        return SingletonHolder.INSTANCE;
    }

}
