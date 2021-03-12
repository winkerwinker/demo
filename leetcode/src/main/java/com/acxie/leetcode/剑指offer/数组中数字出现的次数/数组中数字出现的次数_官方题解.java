package com.acxie.leetcode.剑指offer.数组中数字出现的次数;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/13 15:22
 */

//里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
public class 数组中数字出现的次数_官方题解 {


    public static int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            //其他位置返回的肯定都是0
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }




    public static void main(String[] args) {
        int[] ints = singleNumbers(new int[]{4, 1, 4, 6});
        System.out.println(Arrays.toString(ints));
    }
}
