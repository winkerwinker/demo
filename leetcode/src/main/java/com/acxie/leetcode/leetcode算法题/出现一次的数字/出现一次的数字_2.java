package com.acxie.leetcode.leetcode算法题.出现一次的数字;

/**
 * @description: 异或
 * @create: 2020/01/28 18:12
 * <p>
 * 任何数于0异或为任何数 0 ^ n => n
 * 相同的数异或为0: n ^ n => 0
 */
public class 出现一次的数字_2 {
    public static int singleNumber(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{-129, -129, 1}));
    }
}
