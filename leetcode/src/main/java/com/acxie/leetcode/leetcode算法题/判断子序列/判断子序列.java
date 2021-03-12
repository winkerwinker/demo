package com.acxie.leetcode.leetcode算法题.判断子序列;

import java.util.Stack;

/**
 * @description:
 * @create: 2020/01/28 15:20
 */
public class 判断子序列 {

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("leeeeetcode", "yyyyylyyyyyyyyyyy"));
    }

}
