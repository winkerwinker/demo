
package com.acxie.leetcode.leetcode算法题.用两个栈实现队列;

import java.util.Stack;

/**
 * @description: 前后拼接
 * @author: xieaichen
 * @time: 2020/9/2 21:34
 */

public class 用两个栈实现队列 {

}

class CQueue {
    Stack head = new Stack();
    Stack help = new Stack();

    public CQueue() {

    }

    public void appendTail(int value) {
        head.push(value);
    }

    public int deleteHead() {
        if (head.isEmpty()) {
            return -1;
        }

        while (!head.isEmpty()) {
            help.push(head.pop());
        }
        help.pop();
        if (!help.isEmpty()) {
            while (!help.isEmpty()) {
                head.push(help.pop());
            }
        }
        return 1;
    }
}
