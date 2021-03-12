package com.acxie.leetcode.leetcode算法题.两数之和2_输入有序数组;

import org.junit.Test;

public class 两数之和2 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
//                    System.out.println(i+"     "+j);
                    return new int[]{i+1, j+1};
                }
            }
        }

        return null;
    }

    @Test
    public void test() {
        两数之和2.twoSum(new int[]{2, 7, 11, 15}, 9);
    }


}
