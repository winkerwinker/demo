package com.acxie.leetcode.leetcode算法题.出现一次的数字2;

/**
 * @description: 除了三次，就是一次
 * @create: 2020/01/28 18:28
 */
public class 出现一次的数字2 {

    //TODO 逻辑电路设计，需要消化
    public static int singleNumber(int[] nums) {
        int a = 0, b = 0;

        // for i 会增加内存消耗
        for (int x :
                nums) {
            a = (x ^ a) & ~b;
            b = (x ^ b) & ~a;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 3, 2}));
    }
}
