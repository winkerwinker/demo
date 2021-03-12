package com.acxie.leetcode.leetcode算法题.整数转罗马数字;

import java.util.HashMap;

public class 整数转罗马数字 {
	public  static String intToRoman(int num) {//
		HashMap<Integer,String> kv=new HashMap<Integer,String>();
		StringBuilder sb=new StringBuilder();
		int digit=1000;
		kv.put(1, "I");
		kv.put(4, "IV");
		kv.put(5, "V");
		kv.put(9, "IX");
		kv.put(10, "X");
		kv.put(40, "XL");
		kv.put(50, "L");
		kv.put(90, "XC");
		kv.put(100, "C");
		kv.put(400, "CD");
		kv.put(500, "D");
		kv.put(900, "CM");
		kv.put(1000, "M");
		
		while (digit>=1) {
			int currentdigit=num/digit % 10;
			if (currentdigit!=0) {
				System.out.println(currentdigit*digit);
				if (kv.get(currentdigit*digit)!=null) {
					sb.append(kv.get(currentdigit*digit));
				}else {
					if (currentdigit>5) {
						sb.append(kv.get(5*digit));
						for (int i = 0; i < currentdigit-5 ; i++) {
							sb.append(kv.get(digit));//位数
						}
					}else {
						for (int i = 0; i < currentdigit ; i++) {
							sb.append(kv.get(digit));//位数
						}
					}
				}
				
				System.out.println(sb);
			}
			digit/=10;
		}
		return sb.toString();
	
		
		
	}

	public static void main(String[] args) {
		intToRoman(58);
	}
}
