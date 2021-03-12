package com.acxie.leetcode.设计模式.责任链设计模式.利用责任链模式设计一个拦截器;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @create: 2020/12/03 02:00
 */
public class MsgProcessChain {

    private List<java.lang.Process> chains = new ArrayList<>();
    //追加返回值

    /**
     * 添加责任链
     *
     * @param process
     * @return
     */
    public MsgProcessChain addChain(java.lang.Process process) {
        chains.add(process);
        return this;
    }

    /**
     * 执行处理
     *
     * @param msg
     */
    public void process(String msg) {
        for (java.lang.Process chain : chains) {
        }
    }


}
