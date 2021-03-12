package com.acxie.leetcode.剑指offer.栈的压入弹出序列;

import java.util.Stack;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 14:06
 */

public class 栈的压入弹出序列_贪心 {


    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int popindex = 0;

        for (int push : pushed
        ) {
            stack.push(push);
            while (!stack.isEmpty() && popped[popindex] == stack.peek()) {
                popindex++;
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed = new int[]{};
        int[] popped = new int[]{};
        boolean b = validateStackSequences(pushed, popped);
        System.out.println(b);

    }
}
