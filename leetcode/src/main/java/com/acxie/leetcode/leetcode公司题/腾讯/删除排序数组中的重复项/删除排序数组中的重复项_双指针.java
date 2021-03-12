package com.acxie.leetcode.leetcode公司题.腾讯.删除排序数组中的重复项;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/16 15:55
 */

//!!!!!!!!!!!!!!排序数组
public class 删除排序数组中的重复项_双指针 {

    //    O(1)
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int i = 0;
        int i1 = 1;
        while (i < nums.length && i1 < nums.length) {
            if (nums[i1] == nums[i]) {
                i1++;
            } else {
                nums[i + 1] = nums[i1];
                i++;
            }
        }
        return i + 1;


    }

    public static void main(String[] args) {

        int i = removeDuplicates(new int[]{-1, 0, 0, 0, 0, 3, 3});
        System.out.println(i);

    }

}