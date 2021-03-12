package com.acxie.leetcode.剑指offer.n1中缺失的数字;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 18:01
 */

public class n1中缺失的数字_双指针 {


    //二分法
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < nums.length && right >= 0 && left <= right) {
            if (nums[right] - nums[left] == 2 && right - left == 1) {
                return left+1;
            } else if (right == left) {
                return left == nums[left] ? left + 1 : right ;
            }

            if (nums[left] != left) {
                right--;
            }else {
                left++;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int missingNumber = missingNumber(new int[]{});
        System.out.println(missingNumber);

    }
}
