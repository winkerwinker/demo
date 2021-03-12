package com.acxie.leetcode.leetcode算法题.有效的括号;


import java.util.*;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 15:51
 */

public class Answer_有效的括号 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        //todo 记住这种写法
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.print(isValid(""));
    }
}
