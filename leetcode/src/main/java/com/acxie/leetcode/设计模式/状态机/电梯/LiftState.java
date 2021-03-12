package com.acxie.leetcode.设计模式.状态机.电梯;

/**
 * @Description：todo 电梯类
 * @Author：oscar
 * @CreateTime：2021/2/8 2:41 下午
 */
public abstract class LiftState {

    protected Lift lift;

    public LiftState(Lift lift) {
        this.lift = lift;
    }

    /**
     * 行为：打开电梯门
     */
    public abstract void open();

    /**
     * 行为：关闭电梯门
     */
    public abstract void close();

    /**
     * 行为：电梯运行
     */
    public abstract void run();

    /**
     * 行为：电梯停止运行
     */
    public abstract void stop();
}
