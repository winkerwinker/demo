package com.acxie.leetcode.leetcode算法题.全排列;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @create: 2020/01/30 22:58
 */
public class 全排列_1 {


    static List<List<Integer>> res = new LinkedList<>();


    static List<List<Integer>> permute(int[] nums) {
        backup(new LinkedList<Integer>(), nums);
        return res;
    }

    static void backup(LinkedList<Integer> track, int[] nums) {
        if (track.size() == nums.length) {
            //这里要new 不然会变成引用；
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {

            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backup(track,nums);
            //注意
            track.removeLast();
        }


    }

    public static void main(String[] args) {

        System.out.println(permute(new int[]{1, 2, 3}));
        //   permute(new int[]{1, 2, 8, 5, 4, 7});

    }
}



