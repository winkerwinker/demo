package com.acxie.leetcode.算法类型.排列组合.排列组合1;

public class 可重复组合数 {
	//
	 static char[] nums=new char[]{'1','2','3','4'};
	static char[] result = new char[4];
	// 首先,先让我们来看第一个问题, 有1,2,3,4这4个数字.可以重复的在里面选4次,问能得到多少种结果.easy
	static StringBuilder sb = new StringBuilder("    ");
	static int count =0;

	public static void sloution(int i) {

		if (i == 4) {
			System.out.println(sb);
			count++;
		
		} else {
			for (int j = 0; j < nums.length; j++) {
				sb.setCharAt(i, nums[j]);
				sloution(i + 1);
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		sloution(0);
	}

}
