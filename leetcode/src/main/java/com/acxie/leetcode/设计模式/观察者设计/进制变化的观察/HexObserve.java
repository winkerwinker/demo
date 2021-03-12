package com.acxie.leetcode.设计模式.观察者设计.进制变化的观察;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/7 10:13
 */

public class HexObserve implements  Observe{
    @Override
    public void modify() {
        System.out.println("-----------------------------");
        System.out.println(this.getClass().getName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
        System.out.println("-----------------------------");
    }
}
