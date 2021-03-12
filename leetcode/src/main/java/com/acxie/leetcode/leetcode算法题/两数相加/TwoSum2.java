package com.acxie.leetcode.leetcode算法题.两数相加;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {

	//不能使用两个相同的数字
	 public static int[] twoSum(int[] nums, int target) {
		   int[] indexs = new int[2];
	        
	        // 建立k-v ，一一对应的哈希表
	        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(hash.containsKey(nums[i])){
	                indexs[0] = i;
	                indexs[1] = hash.get(nums[i]);
	                return indexs;
	            }
	            // 将数据存入 key为补数 ，value为下标
	            hash.put(target-nums[i],i);
	        }
	        System.out.println(hash.toString());
	        System.out.println("-----");
	        // // 双重循环 循环极限为(n^2-n)/2 
	        // for(int i = 0; i < nums.length; i++){
	        //     for(int j = nums.length - 1; j > i; j --){
	        //         if(nums[i]+nums[j] == target){
	        //            indexs[0] = i;
	        //            indexs[1] = j; 
	        //            return indexs;
	        //         }
	        //     }
	        // }
	        return indexs;
	        
	    }
	 
	 
	 public static void main(String[] args) {

		 int[] nums= {2, 7, 11, 15}; 
		
		 System.out.println(Arrays.toString(twoSum(nums,9)));
	}
}
