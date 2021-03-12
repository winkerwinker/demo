package com.acxie.leetcode.leetcode算法题.出现一次的数字;

import java.util.ArrayList;

/**
 * @description: 哈希表
 * @create: 2020/01/28 18:12
 */
public class 出现一次的数字_1 {
    public static int singleNumber(int[] nums) {


        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i <nums.length ; i++) {
            if (list.contains(nums[i])){
                //TODO 报错
//                list.remove(nums[i]);
            }else {
                list.add(nums[i]);
            }
        }
        return list.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(   singleNumber(new int[]{-129,-129,1}));
    }
}
