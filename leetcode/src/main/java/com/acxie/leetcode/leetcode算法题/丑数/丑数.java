package com.acxie.leetcode.leetcode算法题.丑数;

/**
 * @description: 丑数就是只包含质因数 2, 3, 5 的正整数。
 * @create: 2020/02/07 15:38
 */

public class 丑数 {

    public static boolean isUgly(int num) {
        if (num == 0) return true;
        if (num == 1) return true;
        if (num % 2 == 0) return isUgly(num / 2);
        if (num % 3 == 0) return isUgly(num / 3);
        if (num % 5 == 0) return isUgly(num / 5);
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(0));
    }
}
