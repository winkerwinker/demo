package com.acxie.leetcode.设计模式.状态机.电梯;

/**
 * @Description：todo
 * @Author：oscar
 * @CreateTime：2021/2/8 3:39 下午
 */
public class Lift {

    //定义当前的状态
    private LiftState state;
    private final LiftState openningState;
    private final LiftState closingState;
    private final LiftState runningState;
    private final LiftState stoppingState;


    /**
     * 执行开门动作
     */
    public void open() {
        // state 在执行之后，同时也需要替换掉当前的状态
        state.open();
    }

    /**
     * 执行关门动作
     */
    public void close() {
        state.close();
    }

    /**
     * 执行运行动作
     */
    public void run() {
        state.run();
    }

    /**
     * 执行停止动作
     */
    public void stop() {
        state.stop();
    }

    /**
     * 构造方法
     */
    public Lift() {
        openningState = new OpenLiftState(this);
        closingState = new CloseLiftState(this);
        runningState = new RunningLiftState(this);
        stoppingState = new StoppingState(this);
    }


    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
    }

    public LiftState getOpenningState() {
        return openningState;
    }

    public LiftState getClosingState() {
        return closingState;
    }

    public LiftState getRunningState() {
        return runningState;
    }

    public LiftState getStoppingState() {
        return stoppingState;
    }
}
