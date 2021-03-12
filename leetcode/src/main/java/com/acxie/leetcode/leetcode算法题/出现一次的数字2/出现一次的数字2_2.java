package com.acxie.leetcode.leetcode算法题.出现一次的数字2;

import java.util.HashSet;

/**
 * @description: 除了三次，就是一次
 * @create: 2020/01/28 18:28
 */
public class 出现一次的数字2_2 {

    //TODO 逻辑电路设计，需要消化
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int k : nums) {
            if (set.contains(k)) {
                set.remove(k);
            } else {
                set.add(k);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 3, 2}));
    }
}
