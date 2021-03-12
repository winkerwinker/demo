package com.acxie.leetcode.leetcode算法题.连续子数组的最大和;

/**
 * @description:
 * @create: 2020/02/23 20:05
 */
public class 连续子数组的最大和_1 {


    public static int maxSubArray(int[] nums) {
        int left;
        int right;

        int res = nums[0];
        for (left = 0, right = 0; right <= nums.length - 1 && left <= nums.length - 1; ) {
            int sum = 0;
            //计算子数组和
            for (int j = left; j <= right; j++) {
                sum += nums[j];
            }
            res = Math.max(sum,res);
            if (sum >= 0) {
                right++;
            } else {
                left=++right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,-1};
        System.out.println(maxSubArray(nums));

    }
}
