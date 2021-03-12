package com.acxie.leetcode.leetcode算法题.分割平衡字符串;

//类似括号分割 进出栈

public class 分割平衡字符串_1 {
    public static int balancedStringSplit(String s) {

        int total = 0;
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'R') {
                total++;
            }
            if (s.charAt(i) == 'L') {
                total--;
            }
            if (total == 0) {
                result++;
            }
            i++;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(分割平衡字符串_1.balancedStringSplit("RLRRLLRLRL"));
    }
}
