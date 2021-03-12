package com.acxie.leetcode.剑指offer.斐波那契数列;

/**
 * @description:
 * @create: 2020/10/07 21:23
 */
public class 斐波那契数列_超时 {

    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fib(n - 1) + fib(n - 2);

    }
}
