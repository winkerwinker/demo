package com.acxie.leetcode.leetcode算法题.分割等和子集;

import java.util.Arrays;

/**
 * @description:事实上，这是一个典型的“动态规划”问题，并且它的“原形”是“0-1 背包问题”。
 * 使用“动态规划”解决问题的思路是“以空间换时间”，“规划”这个词在英文中就是“填表格”的意思，代码执行的过程，也可以称之为“填表格”。
 * 做这道题需要做这样一个等价转换：是否可以从这个数组中挑选出一些正整数，使得这些数的和等于整个数组元素的和的一半。
 * 前提条件是：数组的和一定得是偶数，即数组的和一定得被 22 整除，这一点是特判。
 * @create: 2020/02/03 18:48
 * <p>
 * 递归做法
 */
public class 分割等和子集 {

    // TODO: 2020-02-03 动态规划
    //组合数
    //剪枝，所以先排序
    public static boolean canPartition(int[] nums) {
        if (nums.length == 0) return false;
        Arrays.sort(nums);
        int total = 0;
        for (int a : nums) {
            total += a;
        }
//每个的有无

        if (total % 2 == 1) return false;
        total = total / 2;
        return canPartition(nums, 0, 0, total);

    }


    public static boolean canPartition(int[] nums, int now, int index, int total) {
        //只要有一个true就行

        if (index >= nums.length || now > total) {
            return false;
        }

        if (now == total) {
            return true;
        }
        return canPartition(nums, now + nums[index], index + 1, total) || canPartition(nums, now, index + 1, total);


    }


    public static void main(String[] args) {

        System.out.println(canPartition(new int[]{1}));
    }
}
