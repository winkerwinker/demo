package com.acxie.leetcode.剑指offer.数组中数字出现的次数;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/13 15:22
 */

//里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
public class 数组中数字出现的次数_优化 {


    public static int[] singleNumbers(int[] nums) {
        String all = Integer.toBinaryString(Arrays.stream(nums).reduce(0, (acc, item) -> acc ^ item));

        int bit = 0;
        for (int i = all.length() - 1; i >= 0; i--) {
            if (all.charAt(i) - '0' == 0) {
                //和最右边距离多少位
                bit <<= 1;
            }
        }

        //计算出div的位置

        int reduce = 0;
        int reduce1 = 0;
        for (int i : nums) {
            char c = '0';
            int i1 = bit ^ i;

            if (c == '1') {
                reduce ^= i;
            } else {
                reduce1 ^= i;
            }
        }


        return new int[]{reduce, reduce1};
    }

    public static void main(String[] args) {
        int[] ints = singleNumbers(new int[]{4, 1, 4, 6});
        System.out.println(Arrays.toString(ints));
    }
}
