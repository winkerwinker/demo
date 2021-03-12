package com.acxie.leetcode.leetcode算法题.位1的个数;

/**
 * @description: 普通
 * @create: 2020/01/28 20:11
 */
public class 位1的个数 {


    public static int hammingWeight(int num) {
        boolean flag = num < 0;
        if (flag) {
            num = -(num + 1);
        }
        int count = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return flag ? 32 - count : count;
    }


    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(-7247555541308586214L));
        System.out.println(Long.toBinaryString(-6L));
        System.out.println(Long.toBinaryString(5L));
//        System.out.println(Long.toBinaryString(1L));
        System.out.println(hammingWeight(-79469));

    }

}
