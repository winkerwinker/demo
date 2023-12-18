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
public class MergeTwoList {
	public static void main(String[] args) {
		MergeTwoList mergeTwoList = new MergeTwoList();
		int[] ints = {1, 2, 3, 0, 0, 0};
		int[] ints1 = {2, 5, 6};

		int[] merge = mergeTwoList.merge(ints, 3, ints1, 3);
		System.out.println(Arrays.toString(merge));


		 ints = new int[]{1,2 };
		ints1 = new int[]{1};
		System.out.println(Arrays.toString(mergeTwoList.merge(ints, 1, ints1, 0)));
	}

	// 非递减顺序
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int leftIndex = 0;
		int rightIndex = 0;

		int[] result = new int[n+m] ;
		int resultIndex = 0;
		while (leftIndex < m && rightIndex < n) {
			if (nums1[leftIndex] < nums2[rightIndex]) {
				result[resultIndex] = nums1[leftIndex];
				leftIndex++;
				resultIndex++;
			} else {
				result[resultIndex] = nums2[rightIndex];
				rightIndex++;
				resultIndex++;
			}
		}

		while (leftIndex < m) {
			result[resultIndex] = nums1[leftIndex];
			leftIndex++;
			resultIndex++;
		}

		while (rightIndex < n) {
			result[resultIndex] = nums2[rightIndex];
			rightIndex++;
			resultIndex++;
		}

		nums1=result;

		System.out.println(Arrays.toString(nums1));

		return null;
	}

}