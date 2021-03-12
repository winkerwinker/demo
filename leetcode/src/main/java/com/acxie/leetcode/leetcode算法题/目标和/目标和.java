package com.acxie.leetcode.leetcode算法题.目标和;

/**
 * @description:暴力法
 * @create: 2020/02/03 16:08
 */
public class 目标和 {

    static int count;

    public static int findTargetSumWays(int[] nums, int S) {

        dfs(nums, 0, 0, S);
        return count;
    }

    public static void dfs(int[] nums, int index, int now, int target) {
        if (index == nums.length) {
            if (now == target) {
                count++;
                return;
            } else {
                return;
            }
        } else {
            dfs(nums, index + 1, now + nums[index], target);
            dfs(nums, index + 1, now - nums[index], target);
        }
    }


    public static void main(String[] args) {

        int count = findTargetSumWays(new int[]{}, 3);

        System.out.println(count);
    }
}
