package com.acxie.leetcode.leetcode算法题.摆动排序2;

import java.util.Arrays;

/**
 * @description: 排序+双指针
 * @create: 2020/01/28 21:21
 */

/**
 * 注意反转
 * 用例 4 5 5 6
 */
public class 摆动排序2 {


    public static int[] wiggleSort(int[] nums) {
        int[] result = new int[nums.length];
        quickSort(nums);
        int i = (nums.length + 1) / 2 - 1;
        //直接：后面一个或者中间那个
        //+1：中间后面那个，或者后面一个：：前一个或者中间那个的后一个

//注意从后往前
        int j = nums.length - 1;
        int k = 0;
        while (j > (nums.length + 1) / 2 - 1) {
            result[k++] = nums[i--];
            result[k++] = nums[j--];
        }

        if (nums.length % 2 == 1) {
            result[k++] = nums[i--];
        }
//        nums=Arrays.copyOf(result,nums.length);
        for (int l = 0; l < nums.length; l++) {
            nums[l] = result[l];
        }
        System.out.println(Arrays.toString(nums));
        return result;
    }


    public static void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }


    public static void sort(int[] nums, int low, int high) {
        int i = low;
        int j = high;
//        int index = low;
        int flag = nums[low];
        int temp;

        while (i < j) {
            /**
             * 这里要注意
             */
            while (i < j && nums[j] >= flag) {
                j--;
            }
            while (i < j && nums[i] <= flag) {
                i++;
            }

            if (i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[low] = nums[i];
        nums[i] = flag;

        if (low < i - 1) {
            sort(nums, low, i - 1);
        }
        if (i + 1 < high) {
            sort(nums, i + 1, high);
        }
    }


    public static void main(String[] args) {

        int[] nums = wiggleSort(new int[]{4, 5, 5, 6});
        System.out.println(Arrays.toString(nums));
    }
}
