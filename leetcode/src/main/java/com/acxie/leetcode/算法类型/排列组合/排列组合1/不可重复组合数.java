package com.acxie.leetcode.算法类型.排列组合.排列组合1;

public class 不可重复组合数 {
	//全排列
	static char[] nums = new char[] { '1', '2', '3', '4' };
	static char[] result = new char[4];
	static StringBuilder sb = new StringBuilder("    ");
	static int count = 0;
	public static void sloution(int i) {
		if (i == 4) {
			System.out.println(sb);
			count++;
		} else {
			for (int j = 0; j < nums.length; j++) {
				if (!sb.toString().contains(new StringBuilder(1).append(nums[j]))) {
					sb.setCharAt(i, nums[j]);
					sloution(i + 1);
					sb.setCharAt(i, ' ');
				}
			}
		}
	}
	public static void main(String[] args) {
		sloution(0);
	}
}
