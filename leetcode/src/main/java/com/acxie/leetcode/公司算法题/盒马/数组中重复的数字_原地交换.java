
package com.acxie.leetcode.公司算法题.盒马;

import java.util.Arrays;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 10:15
 */

public class 数组中重复的数字_原地交换 {


    public static int findRepeatNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if (nums[i] != nums[nums[i]]) {
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            } else {
                return nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber(ints);
        System.out.println(repeatNumber);
    }
}
