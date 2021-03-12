package com.acxie.leetcode.leetcode算法题.两数相加;

import java.util.Arrays;

public class TwoSum {

    //不能使用两个相同的数字
    public static int[] twoSum(int[] nums, int target) {
        //先去重复
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {nums[i], nums[j]};
                    return result;
                }
            }
        }
        return null;

    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
