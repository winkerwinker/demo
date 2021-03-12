package com.acxie.leetcode.剑指offer.数组中数字出现的次数2;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/10/14 14:16
 */


//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
public class 数组中数字出现的次数2_有限状态自动机 {


    //    1 <= nums[i] < 2^31
    public static int singleNumber(int[] nums) {


        int[] counts = new int[32];
        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                counts[j] += num & 1;
                num >>>= 1;
            }
        }


        int x = 1;
        int a = 0;
        for (int i = 0; i < counts.length; i++) {
            a += counts[i] % 3 * x;
            x <<= 1;
        }
        return a;
    }


    public static void main(String[] args) {
        int i = singleNumber(new int[]{8});
        System.out.println(i);
    }


}


//        int[] res = new int[32];
//
//        for (int j = 0; j < 32; j++) {
//            int temp = 0;
//            System.out.println(Arrays.toString(nums));
//            for (int k : nums) {
//                temp += k & 1;
//                //在这里移动位子是没有用的
//            }
//            System.out.println("-----------------");
//            res[j] = temp;
//        }