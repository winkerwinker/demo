package com.acxie.leetcode.leetcode算法题.全排列;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/01/30 22:58
 */
public class 全排列_2 {


    static List<List<Integer>> res = new LinkedList<>();


    static  public List<List<Integer>> permute(int[] nums) {
        backup(nums,0);

        return  res;
    }

    static  public void backup(int[] nums,int now) {
        if (now == nums.length-1){
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }

        for (int i = now; i <nums.length; i++) {
            swap(nums,i,now);
            backup(nums,now+1);
            swap(nums,now,i);
        }

    }

    static void swap(int[] nums,int i,int j) {
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {

        System.out.println(permute(new int[]{1, 2, 3}));
        //   permute(new int[]{1, 2, 8, 5, 4, 7});

    }
}



