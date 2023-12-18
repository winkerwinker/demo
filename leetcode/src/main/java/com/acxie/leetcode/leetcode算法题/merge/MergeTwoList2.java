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

按照从大的方向覆盖的思路，因为第一个list的范围总是够用的
https://leetcode.cn/problems/merge-sorted-array/solutions/126371/88-by-ikaruga/
 */
public class MergeTwoList2 {
	public static void main(String[] args) {
		MergeTwoList2 mergeTwoList = new MergeTwoList2();
		int[] ints = {4, 5, 6, 0, 0, 0};
		int[] ints1 = {1, 2, 3};

		mergeTwoList.merge(ints, 3, ints1, 3);

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int leftIndex = m-1;
		int rightIndex = n-1;
		int index = nums1.length-1;

		while (index >= 0){
			if ((rightIndex>=0 && leftIndex<0) ){
				nums1[index--] = nums2[rightIndex];
				rightIndex--;
				continue;
			}
			if ((rightIndex<0 && leftIndex>=0) ){
				nums1[index--] = nums1[leftIndex];
				leftIndex--;
				continue;
			}
			if (nums1[leftIndex] <= nums2[rightIndex]) {
				// 选择右边的进入
				nums1[index--] = nums2[rightIndex];
				rightIndex--;
			} else {
				nums1[index--] = nums1[leftIndex];
				leftIndex--;
			}

		}

		System.out.println(Arrays.toString(nums1));

	}

}