package com.acxie.leetcode.leetcode算法题.寻找重复数;

import java.util.HashSet;

/**
 * @description: hashset
 * @create: 2020/01/29 16:35
 */
public class 寻找重复数 {


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
