package com.acxie.leetcode.leetcode算法题.整数转罗马数字;

import java.util.Arrays;
import java.util.HashMap;

public class 罗马数字转整数 {
	static int num;
	static HashMap<Integer, Character> kv = new HashMap<Integer, Character>();
	
	static{
		
	kv.put(1, 'I');
	kv.put(5, 'V');
	kv.put(10, 'X');
	kv.put(50, 'L');
	kv.put(100, 'C');
	kv.put(500, 'D');
	kv.put(1000, 'M');}
	public static int romanToInt(String s) {
		
		num = 0;
				int i = 0;
		boolean start = false;
		int digit = 3;
		if (s.charAt(0) == 'M') {
			num += 10000;
			i++;
		}
		String[] strs = new String[20];
		StringBuilder temp = new StringBuilder();
		for (; i < s.length(); i++) {
			
			
			if (start) {
				System.err.println(Math.pow(10, digit-1) );
				System.out.println(kv.get((int)Math.pow(10, digit-1)));
				System.out.println(kv.get((int)Math.pow(10, digit)));
				System.out.println(kv.get((int)Math.pow(10, digit-1)*5));
				if (s.charAt(i) != kv.get((int)Math.pow(10, digit-1)) &&
						s.charAt(i) != kv.get((int)Math.pow(10, digit))&& 
						s.charAt(i) != kv.get((int)Math.pow(10, digit-1)*5)) {
					start = false;
					System.out.println(temp);
					strs[digit] = temp.toString();
					temp = new StringBuilder();
					digit--;
				} else {
					temp.append(s.charAt(i));

					continue;
				}

			}
			System.out.println((int)Math.pow(10, digit-1)*5 + " ninini  ");
			if (digit<1) {
				break;
			}
			if (s.charAt(i) ==kv.get((int)Math.pow(10, digit-1)) || s.charAt(i) ==kv.get((int)Math.pow(10, digit-1)*5)) {
				temp.append(s.charAt(i));
				start = true;
				
			}else {
				digit--;
				i--;
			}
			System.out.println(digit);
		}
		System.out.println(digit);
		strs[digit] = temp.toString();
		System.out.println(Arrays.toString(strs));

		return 0;
	}
	//健值反转
//	public void digitToNum(String diString,int digit) {
//		int dinum=0;
//		if (diString.charAt(0)==kv.get(digit * 5)) {
//			return Math.pow(10, digit-1)*5
//		}
//		for (int i = 0; i < diString.length(); i++) {
//			
//		}
//
//	}
	
	
	
	

	public static void main(String[] args) {
		romanToInt("MCMXCIV");
	}
}
