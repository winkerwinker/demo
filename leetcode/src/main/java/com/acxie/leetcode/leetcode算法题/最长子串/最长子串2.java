package com.acxie.leetcode.leetcode算法题.最长子串;

public class 最长子串2 {
	
	public static void main(String[] args) {
		StringBuilder result=new StringBuilder();
		StringBuilder s=new StringBuilder();
		
		char[] a= {'c','c','c','d','d','d','d'};
		System.out.println(a.length);
		int count=0;
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]==a[i-1]) {
				s.append(a[i]);
				count++;
			}else if (a[i]!=a[i-1]) {
				System.out.println(count);
				if (count>result.length()) {
					System.out.println(result);
					result=s;
					count=0;
					s=new StringBuilder("");
				}
			}
		}
		if (count>result.length()) {
			System.out.println(result);
			result=s;
			count=0;
			s=new StringBuilder("");
		}
		System.out.println("===="+result.append(result.charAt(0)));
	}

}
