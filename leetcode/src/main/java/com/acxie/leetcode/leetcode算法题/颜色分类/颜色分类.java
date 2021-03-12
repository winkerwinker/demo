package com.acxie.leetcode.leetcode算法题.颜色分类;

import java.util.Arrays;

/**
 * @description: dutch national flag question(荷兰国旗问题)
 * 一趟扫描算法
 * @create: 2020/01/29 10:29
 */
public class 颜色分类 {


    public static void sortColors(int[] nums) {
        int p0=0,curr=0;//p0和p2并没有坐稳位子
        int p2=nums.length-1;
        //while (curr <= p2)
        int temp;
        while (curr<p2){
            if (nums[curr]==0){
                //00
                //01110
            temp=nums[p0];
            nums[p0++]=nums[curr];
            nums[curr++]=temp;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else if (nums[curr]==2){
                temp=nums[p2];
                nums[p2--]=nums[curr];
                nums[curr]=temp;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] nums = new int[]{2,0,1};
        //cur 到p2上，此时p2=0
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
