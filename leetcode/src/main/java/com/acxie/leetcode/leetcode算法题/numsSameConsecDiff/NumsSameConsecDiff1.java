package com.acxie.leetcode.leetcode算法题.numsSameConsecDiff;/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author xichang 88
 * @version merge.MergeTwoList.java, v 0.1 2023年12月15日 11:14 AM xichang

https://leetcode.cn/problems/numbers-with-same-consecutive-differences/description/

记住可利用的源头
 */
public class NumsSameConsecDiff1 {

	public static void main(String[] args) {
		//List<Integer> integers = new NumsSameConsecDiff().numsSameConsecDiff(3, 7);
		//
		//
		//System.out.println(integers);
		//
		//List<Integer> integers1 = new NumsSameConsecDiff().numsSameConsecDiff(2, 2);
		//
		//
		//System.out.println(integers1);
	}

	public int[] numsSameConsecDiff( int n, int k) {
		return new NumsSameConsecDiff1().numsSameConsecDiff1(0, n, k, n).stream().mapToInt(Integer::valueOf)
			.toArray();


	}
	public List<Integer> numsSameConsecDiff1(int limit, int n, int k, int totalN) {
		List<Integer> result = new ArrayList();
		List<Integer>  tempresult ;

		for (int i = 0; i <=9; i++) {
			if (n!=totalN && !(Math.abs(i-limit)==k)){
				continue;
			}
			if (n==totalN && i ==0 ){
				continue;
			}
			//  说明已经是最后一层了
			List<Integer> arrayList=new ArrayList<>();
			if (n==1 ){
				arrayList.add(0);
			}else {
				 arrayList = numsSameConsecDiff1(i, n - 1, k,totalN);
				// 前面加上当前的位数就是结果
			}

			// 输出下一个层级的list


			int finalI = i;
			 tempresult = arrayList.stream().map(a -> {
				double v = finalI * Math.pow(10, n-1);
				return (int)v + (int)a;
			}).collect(Collectors.toList());
			result.addAll(tempresult);
		}
		//System.out.println( tempresult);

		return result;
	}

}