package com.acxie.leetcode.剑指offer.数组中重复的数字;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 10:15
 */

public class 数组中重复的数字_原地交换 {

    /*public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //位置正确，先不用管
            if (i == nums[i])
                continue;
            //出现了重复，直接返回
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            //交换
            int temp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = temp;
            //这里的i--是为了抵消掉上面的i++，
            //交换之后需要原地再比较
            i--;
        }
        return -1;
    }*/


    public static int findRepeatNumber(int[] nums) {

        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber(ints);
        System.out.println(repeatNumber);
    }
}
