package com.acxie.leetcode.leetcode公司题.腾讯.删除排序数组中的重复项;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/16 15:55
 */

public class 删除排序数组中的重复项 {

    //    O(1)
    public static int removeDuplicates(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[i] == nums[k]) {
                        nums[i] = Integer.MAX_VALUE;
                        count++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == Integer.MAX_VALUE) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        nums =  Arrays.copyOfRange(nums, 0, nums.length - count);
        System.out.println(Arrays.toString(nums));

        return nums.length;
    }

    public static void main(String[] args) {

        int i = removeDuplicates(new int[]{-1,0,0,0,0,3,3});
        System.out.println(i);

    }

}