package com.acxie.leetcode.剑指offer.n1中缺失的数字;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 18:01
 */

public class n1中缺失的数字_官方二分 {


    //二分法
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int m = (left + right) / 2;
            if (nums[m] == m) left = m + 1;
            else right = m - 1;
            //只会有一步移动

        }
        return left;

    }

    public static void main(String[] args) {
        int missingNumber = missingNumber(new int[]{});
        System.out.println(missingNumber);

    }
}
