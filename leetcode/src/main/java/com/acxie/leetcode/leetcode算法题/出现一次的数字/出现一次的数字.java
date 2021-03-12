package com.acxie.leetcode.leetcode算法题.出现一次的数字;

import java.util.HashSet;

/**
 * @description: 哈希表
 * @create: 2020/01/28 18:12
 */
public class 出现一次的数字 {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();

        for (int k : nums) {
            if (set.contains(k)) {
                set.remove(k);
            } else {
                set.add(k);
            }
        }

        return set.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{-129, -129, 1}));
    }
}
