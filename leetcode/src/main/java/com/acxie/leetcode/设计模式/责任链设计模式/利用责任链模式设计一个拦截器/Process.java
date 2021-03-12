package com.acxie.leetcode.设计模式.责任链设计模式.利用责任链模式设计一个拦截器;

public interface Process {


    /**
     * 执行处理
     * @param msg
     */
    void doProcess(String msg);

}


class SensitiveWordProcess implements Process {
    @Override
    public void doProcess(String msg) {
        System.out.println(msg + "敏感词处理");
    }
}


class CorrectProcess implements Process {
    @Override
    public void doProcess(String msg) {
        System.out.println(msg + "版权处理");
    }
}

class CopyrightProcess implements Process {
    @Override
    public void doProcess(String msg) {
        System.out.println(msg + "版权处理");
    }
}