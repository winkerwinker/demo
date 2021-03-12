package com.acxie.leetcode.剑指offer.栈的压入弹出序列;

import java.util.Arrays;
import java.util.Stack;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/10 14:06
 */

public class 栈的压入弹出序列 {


    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        //防御
        if (pushed.length != popped.length) {
            return false;
        }


        Stack<Integer> stack = new Stack<>();
        int popindex = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && popped[popindex] == stack.peek()) {
                popindex++;
                stack.pop();
            }
            System.out.println(stack);
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
