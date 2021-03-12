package com.acxie.leetcode.剑指offer.I数组中数字出现的次数;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/10/07 22:22
 */
public class 数组中数字出现的次数 {

    public static int[] singleNumbers(int[] nums) {

        int total = 0;
        for (int a : nums) {
            total ^= a;
        }


        return null;
    }

    public static void main(String[] args) {

        String s = "4,1,4,6";
        int target = 9;
        int[] ints = Arrays.stream(s.split(",")).mapToInt(Integer::valueOf).toArray();
        int[] ints1 = singleNumbers(ints);
        System.out.println(Arrays.toString(ints1));
    }


}
