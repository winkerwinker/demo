package com.acxie.leetcode.设计模式.状态机.电梯;

/**
 * @Description：电梯开关状态
 * @Author：oscar
 * @CreateTime：2021/2/8 2:45 下午
 */
public class RunningLiftState extends LiftState {
    public RunningLiftState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println(-1);
    }

    @Override
    public void close() {
        this.lift.setState(new CloseLiftState(new Lift()));
        System.out.println("open -> close");
    }

    @Override
    public void run() {
        System.out.println(-1);
    }

    @Override
    public void stop() {
        System.out.println(-1);
    }
}
