package com.acxie.leetcode.leetcode算法题.整数转罗马数字;

public class 整数转罗马数字_贪心算法 {
	public static String intToRoman(int num) {
		// 有自身的特殊规律
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();
		int index = 0;
		while (index < 13) {
			while (num >= nums[index]) {
				sb.append(romans[index]);
				num -= nums[index];
			}
			index++;

		}

		return sb.toString();

	}

	public static void main(String[] args) {
	
		System.out.println(intToRoman(58));
	}
}
