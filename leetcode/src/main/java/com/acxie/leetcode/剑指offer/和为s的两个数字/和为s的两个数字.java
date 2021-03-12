package com.acxie.leetcode.剑指offer.和为s的两个数字;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/10/07 21:01
 */
public class 和为s的两个数字 {

    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < nums.length && j > 0) {
            if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }

        }

        return null;

    }

    public static void main(String[] args) {

        String s = "2,7,11,15";
        int target = 9;
        int[] ints = Arrays.stream(s.split(",")).mapToInt(Integer::valueOf).toArray();
        int[] ints1 = twoSum(ints, target);
        System.out.println(Arrays.toString(ints1));
    }
}
