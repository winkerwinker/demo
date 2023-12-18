package com.acxie.leetcode.leetcode算法题.merge;/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */

import java.util.Arrays;

/**
 *
 * @author xichang 88
 * @version merge.MergeTwoList.java, v 0.1 2023年12月15日 11:14 AM xichang
https://leetcode.cn/problems/merge-sorted-array/description/

用了新的空间，覆盖也没有用
 */
public class MergeTwoList1 {
	public static void main(String[] args) {
		MergeTwoList1 mergeTwoList = new MergeTwoList1();
		int[] ints = {4,5,6,0,0,0};
		int[] ints1 = {1,2,3};

		mergeTwoList.merge(ints, 3, ints1, 3);


	}

//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//			if (m!=0 && n!=0){
//if (nums1[0]>nums2[0]){
//	merge1(  nums2,  n,nums1, m);
//}
//			}
//		merge1(nums1, m,  nums2,  n);
//
//	}
	// 非递减顺序
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int leftIndex = 0;
		int rightIndex = 0;



		while (rightIndex < n && leftIndex < m) {
			if (nums1[leftIndex] <= nums2[rightIndex] ) {
				leftIndex++;
				System.out.println(Arrays.toString(nums1));
			} else {
				// temp这个数据代表了最小的数据， 那么应该放到第一个分组里面去，并且从第一个分组汰换下来数据重新放入temp
				// 这个时候temp 是汰换下来的数据， 需要根据temp 和right 的index 的对比。如果right

				int temp =nums1[leftIndex];
				nums1[leftIndex]= nums2[rightIndex];
				nums2[rightIndex]	=temp;
				leftIndex++;

				// 需要保持第二个数组最前面的那个是最小的. 和他的后一个调换，并不代表就是确实最小的，需要
				int nowTag=rightIndex;
				while (nowTag+1< n && nums2[nowTag]> nums2[nowTag+1]){
					 temp =nums2[nowTag+1];
					 nums2[nowTag+1]=nums2[nowTag];
					nums2[nowTag]=temp;
					nowTag++;
				}



				//System.out.println(Arrays.toString(nums1));
				//System.out.println(Arrays.toString(nums2));
				//System.out.println("-------");
			}

		}

		while (rightIndex < n) {


			nums1[leftIndex++] = nums2[rightIndex++];
		}


		System.out.println(Arrays.toString(nums1));

	}

}