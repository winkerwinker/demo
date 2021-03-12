package com.acxie.leetcode.leetcode算法题.两数相加;


import com.acxie.leetcode.struct.listnode.ListNode;

/**
 * 
 * 转成
 * 
 * @author xieaichen
 *
 */
public class TwoAdd_Linklist {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long num1 = 0;
		long num2 = 0;
		long digits = 1;
		while (l1 != null) {
			num1 = num1 + (long)l1.val * digits;
			digits *= 10;
			l1 = l1.next;
		}

		digits = 1;
		while (l2 != null) {
			num2 = num2 + (long)l2.val * digits;
			//。。。
			digits *= 10;
			l2 = l2.next;
		}

		System.out.println(num1 + " " + num2);
		long result =num1+num2 ;
		System.out.println(result);
		int unit;
		  digits = 10;
		ListNode r1 = new ListNode((int) (result % digits));
		ListNode temp = r1;
		while ((result / digits) >=1) {
			digits *= 10;
			unit = (int) (result % digits / (digits / 10));
			temp.next = new ListNode(unit);
			temp = temp.next;
		}

	//	return r1;

	long num3 = 0;
		digits = 1;
		while (r1 != null) {
			num3 = num3 +  (long)r1.val * digits;
			digits *= 10;
			r1 = r1.next;
		}
		System.out.println(num3);
		
 return null;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
//	l1.next = new data_structure.ListNode(4);
//		l1.next.next = new data_structure.ListNode(3);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

		addTwoNumbers(l1, l2);
	}

}

//测试
