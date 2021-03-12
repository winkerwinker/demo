package com.acxie.leetcode.leetcode算法题.回文链表;



import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @date: 2020-01-28
 */
public class 回文链表 {


    public static boolean isPalindrome(ListNode head) {
        boolean flag = true;
        ArrayList<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
        return isReverse(list);
    }

    public static boolean isReverse(List list) {

        /**
        * @description: 需要注意-129和-129不能直接使用
        */
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals( list.get(list.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println( isPalindrome(new ListNode(new int[]{-129, -129})));

    }
}
