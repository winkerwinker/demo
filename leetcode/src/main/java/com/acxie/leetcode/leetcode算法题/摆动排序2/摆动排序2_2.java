package com.acxie.leetcode.leetcode算法题.摆动排序2;

import java.util.Arrays;

/**
 * @description: 只进行一次排序然后进行反序列, 是不行的，因为排了第一次不一定是中位的
 *              所以要是用3-way-partition
 * @create: 2020/01/28 21:21
 */

/**
 * 注意反转
 * 用例 4 5 5 6
 */
public class 摆动排序2_2 {


    public static int[] wiggleSort(int[] nums) {

        return null;
    }


    public static void main(String[] args) {

        //  int[] nums=  wiggleSort(new int[]{4,5,5,6});
        int[] nums = wiggleSort(new int[]{1, 5, 1, 1, 6, 4});
        System.out.println(Arrays.toString(nums));
    }
}
