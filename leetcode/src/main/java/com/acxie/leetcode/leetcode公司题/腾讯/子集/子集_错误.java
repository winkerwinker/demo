package com.acxie.leetcode.leetcode公司题.腾讯.子集;

import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/23 17:41
 */

public class 子集_错误 {

    static List<List<Integer>> lists;

    public static List<List<Integer>> subsets(int[] nums) {
        //        lists = null;
        //        int j = 0;
        //        //以每一个节点作为开头
        //        for (int length = nums.length; length > 0; length--) {
        //            subsets1(nums, length, 0, new ArrayList<>());
        //        }
        //        return lists;
        //    }
        //
        //
        //    public static List<Integer> subsets1(int[] nums, int i, int j, List<Integer> integers) {
        //        if (j == nums.length) {
        //            return integers;
        //        }
        //        integers.add(nums[i]);
        //        lists.add(integers);
        //        subsets1(nums, i, j + 1, integers);
        //        integers.remove(i);
        //        return integers;
        return null;
    }


    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        List<List<Integer>> subsets = subsets(ints);
        System.out.println(subsets);

    }
}
