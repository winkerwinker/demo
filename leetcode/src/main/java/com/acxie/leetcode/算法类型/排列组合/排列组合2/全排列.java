package com.acxie.leetcode.算法类型.排列组合.排列组合2;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:普通
 * @create: 2020/02/01 17:58
 */
public class 全排列 {

    //注意里面的泛型两边必须完全一致，因为另一边是不解析的，所有没有那种接口的写法
    static List<List<Integer>> list = new LinkedList<List<Integer>>();

    public static void backup(int[] nums, LinkedList<Integer> track) {

        if (track.size() == nums.length) {
            //track 最后都会清空
            list.add(new LinkedList<>(track));
            return;
        }

        for (int a : nums) {
            if (track.contains(a)) {
                continue;
                //这里跳过
            }
            track.add(a);
            backup(nums, track);
            track.removeLast();
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        backup(nums, new LinkedList<Integer>());
        System.out.println(list);
    }
}
