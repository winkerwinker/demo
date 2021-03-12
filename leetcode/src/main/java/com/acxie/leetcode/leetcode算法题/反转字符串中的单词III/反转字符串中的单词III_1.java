package com.acxie.leetcode.leetcode算法题.反转字符串中的单词III;

import java.util.Stack;

public class 反转字符串中的单词III_1 {
    /**
     * 使用栈实现
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            } else {

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
}
