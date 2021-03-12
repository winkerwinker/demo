package com.acxie.leetcode.leetcode公司题.腾讯.子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * @author: xieaichen
 * @time: 2020/10/23 17:41
 */

public class 子集 {

    static List<List<Integer>> lists;

    // 数字是不重复的
    public static List<List<Integer>> subsets(int[] nums) {
        lists = new ArrayList<List<Integer>>();
        List<Integer> rest = Arrays.stream(nums).boxed().collect(Collectors.toList());
        ArrayList<Integer> now = new ArrayList<>();
        subsets1(nums, rest, now);
        return lists;

    }


    public static void subsets1(int[] nums, List<Integer> rest, List<Integer> now) {
        if (rest.isEmpty() || now.size() == nums.length) {
            return;
        }
        for (int j = 0; j < rest.size(); j++) {
            now.add(nums[j]);

            lists.add(now);
            int num = nums[j];

            List<Integer> rest1 = rest;
            for (int i = 0; i < num; i++) {
                if (rest1.get(i) == num) {

                }
            }

            rest1.remove((Integer) nums[j]);

            subsets1(nums, rest1, now);

            now.remove(now.size() - 1);
        }
    }


    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        List<List<Integer>> subsets = subsets(ints);
        System.out.println(subsets);

    }
}
