package com.acxie.leetcode.leetcode算法题.摆动序列;

/**
 * @description:是一个完全可以使用贪心解决对问题
 * @create: 2020/02/02 14:29
 */
public class 摆动序列 {


    public static int wiggleMaxLength(int[] nums) {
        //我的思路是首先预处理，去掉nums里连续的重复的数

        if (nums.length <= 1) {
            return nums.length;
        }
        //  int count = 1;
        int t = 1;
        while (t < nums.length) {
            if (nums[0] != nums[t]) {
                break;
            } else t++;
        }
        if (t == nums.length) {
            return 1;
        }
        System.out.println(nums[t]);
        boolean flag = nums[0] - nums[t] > 0;//true：后面需要一个更大
        int index = nums[t];
        t++;
        int count = 2;
        for (int i = t; i < nums.length; i++) {

            if ((flag && nums[i] < index) || (!flag && nums[i] > index)) {//成立
                index = nums[i];
                System.out.println(nums[i]);
                flag = !flag;
                count++;
            } else {
                index = nums[i];
            }

        }
        return count;
    }


    public static void main(String[] args) {
        // 1 17 5 2 3
//        int[] test = new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
       //   int[] test = new int[]{1,2,3,4,5,6,7,8,9};
        int[] test = new int[]{33, 53, 12, 64, 50, 41, 45, 21, 97, 35, 47, 92, 39, 0, 93, 55, 40, 46, 69, 42, 6, 95, 51, 68, 72, 9, 32, 84, 34, 64, 6, 2, 26, 98, 3, 43, 30, 60, 3, 68, 82, 9, 97, 19, 27, 98, 99, 4, 30, 96, 37, 9, 78, 43, 64, 4, 65, 30, 84, 90, 87, 64, 18, 50, 60, 1, 40, 32, 48, 50, 76, 100, 57, 29, 63, 53, 46, 57, 93, 98, 42, 80, 82, 9, 41, 55, 69, 84, 82, 79, 30, 79, 18, 97, 67, 23, 52, 38, 74, 15};
        //  int[] test = new int[]{0,0};
        System.out.println(wiggleMaxLength(test));
    }
}
