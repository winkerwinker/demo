package com.acxie.leetcode.leetcode算法题.缺失数字;

import java.util.Arrays;

/**
 * @description:普通写法
 * @create: 2020/10/07 19:26
 */
public class 缺失数字_排序 {

    //查询每个数字是否在其中，复杂度n*n
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        String s = "1,2";
//todo 构造int数组

//        Integer[] integers = Arrays.stream(s.split(",")).map((a -> Integer.valueOf(a))).toArray(Integer[]::new);
        int[] ints = Arrays.stream(s.split(",")).mapToInt(Integer::valueOf).toArray();
        int i = missingNumber(ints);
        System.out.println(i);

    }


}
