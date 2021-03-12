package com.acxie.leetcode.leetcode算法题.寻找重复数;

import java.util.HashSet;

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n)
 *
 * @description: 弗洛伊德的乌龟和兔子（循环检测）
 * @create: 2020/01/29 16:35
 */
public class 寻找重复数_1 {


    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : nums) {

            if (set.contains(a)) return a;
            set.add(a);

        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 4}));
//        System.out.println(1 ^ 1);
    }
}
