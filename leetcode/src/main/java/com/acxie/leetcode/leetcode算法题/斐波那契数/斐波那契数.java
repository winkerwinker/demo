package com.acxie.leetcode.leetcode算法题.斐波那契数;

public class 斐波那契数 {


    public static int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);
    }


    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
