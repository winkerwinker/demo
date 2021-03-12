package com.acxie.leetcode.leetcode算法题.求n内的和;

/**
 * @description:
 * @create: 2020/02/26 00:45
 */
public class 求n内的和 {

    public static int sumNums(int n) {
        boolean b = (n > 0) && ((n += sumNums(n - 1)) > 0);
        //n 一直在累计
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(9));
        ;
    }
}
//    return ((int) Math.pow(n, 2) + n) >> 1;