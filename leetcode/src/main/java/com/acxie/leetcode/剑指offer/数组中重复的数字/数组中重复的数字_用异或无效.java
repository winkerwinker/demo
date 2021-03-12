
package com.acxie.leetcode.剑指offer.数组中重复的数字;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/9 10:15
 */

public class 数组中重复的数字_用异或无效 {


    public static int findRepeatNumber(int[] nums) {
        int temp = -1;
        for (int a : nums) {
            temp ^= a;

            if (temp == 0) {
                return a;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber(ints);
        System.out.println(repeatNumber);
    }
}
