package com.acxie.leetcode.剑指offer.在排序数组中查找数字1;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 14:59
 */

public class 在排序数组中查找数字1_双指针 {


    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < nums.length && j >= 0 && i <= j) {

            if (nums[i] == target && nums[j] == target) return j - i + 1;
            if (nums[i] != target) i++;
            if (nums[j] != target) j--;
            if (nums[j] != target) j--;
        }

        return 0;

    }


    public static void main(String[] args) {
        int[] ints = {1};
        int i = search(ints, 1);
        System.out.println(i);

    }
}
