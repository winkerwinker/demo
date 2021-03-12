package com.acxie.leetcode.leetcode算法题.两数之和2_输入有序数组;

import org.junit.Test;

/**
 * 双指针
 */
public class 两数之和2_1 {
    public static int[] twoSum(int[] numbers, int target) {
        //对null 进行for循环会出错
        if (numbers == null) return null;
        int i=0,j=numbers.length-1;
        while(i<j){
            if (numbers[i]+numbers[j]==target){
//                System.out.println(i+"   "+j);
                return new int []{i+1,j+1};
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }


        return null;
    }

    @Test
    public void test() {
        两数之和2_1.twoSum(new int[]{2, 7, 11, 15}, 9);
    }


}
