package com.acxie.leetcode.算法类型.快速选择;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/01/29 13:36
 */
public class 无序数组的中位数 {


    public static void main(String[] args) {

        System.out.println(select(new int[]{2, 1, 4, 6, 5}));
    }


    private static int even(int[] nums, int k1, int k2) {
        int low = 0;
        int high = nums.length - 1;
        int result1 = -1;
        int result2 = -1;

        while (low < high) {
            int result = partion(nums, low, high);
            System.out.println(Arrays.toString(nums));
            if (result1 != -1 || result2 != -1) {
                break;
            }
            if (result == k1) {
                result1 = nums[k1];
            } else if (result == k2) {
                result2 = nums[result];
            } else if (result > k1) {
                low = result + 1;
            } else if (result < k1) {
                high = result - 1;
            }
        }
        System.out.println("第一个是：" + result1);
        System.out.println("第二个是：" + result2);
        return nums[k1];
    }

    private static int odd(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        int target = k;
        while (low < high) {
            int result = partion(nums, low, high);

            System.out.println(Arrays.toString(nums));
            if (result == target) {
                return nums[target];
            } else if (result > target) {
                low = result + 1;
            } else if (result < target) {
                high = result - 1;
            }
        }
        return nums[target];
    }

    private static int partion(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int flag = a[low];
        int temp;
        while (i < j) {
            while (i < j && a[j] >= flag) {
                j--;
            }
            while (i < j && a[i] <= flag) {
                i++;
            }
            if (i > j) {
                temp = a[i];
                a[i++] = a[j];
                a[j++] = temp;
            }
        }
        a[low] = a[i];
        a[i] = flag;

        return i;
    }


    private static int select(int[] nums) {
        if (nums.length % 2 == 0) return even(nums, nums.length / 2 - 1, nums.length / 2);
        else return odd(nums, nums.length / 2);
    }
}
