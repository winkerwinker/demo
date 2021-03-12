package com.acxie.leetcode.leetcode算法题.两数之和2_输入有序数组;

import org.junit.Test;

/**
 * 内层使用二分法
 */
public class 两数之和2_2 {
    public static int[] twoSum(int[] numbers, int target) {
        //对null 进行for循环会出错
        int j;

        for (int i = 0; i < numbers.length - 1; i++) {
            int min=i+1;
            int max=numbers.length-1;
           do {
               j = (min + max) / 2;
               if (numbers[i]+numbers[j]==target) {
                   //System.out.println(i + "    " + j);
                   return new int[]{i+1 , j + 1};
               }
               else if (numbers[i]+numbers[j]>target){
                   max=j-1;
               }else{
                   min=j+1;
               }

           }while(min<=max);
        }
        return null;
    }

    @Test
    public void test() {
        两数之和2_2.twoSum(new int[]{2, 7,11,15}, 9);
        两数之和2_2.twoSum(new int[]{2, 3,4}, 6);
        两数之和2_2.twoSum(new int[]{5, 25,75}, 100);
    }


}
