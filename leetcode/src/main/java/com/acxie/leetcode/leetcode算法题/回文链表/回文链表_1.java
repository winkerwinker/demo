package com.acxie.leetcode.leetcode算法题.回文链表;



import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 将值复制到数组中后用双指针法
 *          数组指针 用于判断是否回文
 * @author: xieaichen
 * @date: 2020-01-28
 */
public class 回文链表_1 {


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
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (!list.get(i++).equals(list.get(j--))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(new int[]{-129, -129})));

    }
}


