package com.acxie.leetcode.leetcode算法题.四数之和;

import java.util.Arrays;
import java.util.List;

/**
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。 //这种是带有重复的 满足要求的四元组集合为： [ [-1,
 * 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2] ]
 *
 * @param args
 */

//.StackOverflowError
public class 四数之和 {
    static int[] nums = new int[]{1, 0, -1, 0, -2, 2};
    static int[] result = new int[4];

    // 得到所有的组合数
    public static void next(int i) {
        if (i == 4) {
            System.out.println(Arrays.toString(result));
        } else {
            for (int j = 0; j < nums.length; j++) {
                result[i] = nums[j];
                next(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        next(0);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        return null;
    }
}
