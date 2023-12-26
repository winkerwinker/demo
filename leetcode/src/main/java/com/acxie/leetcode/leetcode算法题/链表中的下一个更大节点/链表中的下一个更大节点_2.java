package com.acxie.leetcode.leetcode算法题.链表中的下一个更大节点;


import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.cn/problems/next-greater-node-in-linked-list/solutions/442247/5chong-jie-jue-fang-shi-tu-wen-xiang-jie-by-sdwwld/
 * 使用栈求解
 */
public class 链表中的下一个更大节点_2 {


    public static int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        //三句话，链表转数组
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Stack<Integer> stack = new Stack<>();

        int[] res = new int[list.size()];
        // for循环一下
        for (int i = 0; i < list.size(); i++) {
            while (!stack.empty() && stack.peek()!=null && list.get(stack.peek()) < list.get(i)) {
                // 看当前的栈顶小于当前待对比的
                res[stack.peek()] = list.get(i);
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }


    public static void main(String[] args) {
//        ListNode node = new ListNode(new int[]{2,7,4,3,5});
//        ListNode node = new ListNode(new int[]{7,4,3,2});
        ListNode node = new ListNode(new int[]{2,1,5});
        System.out.println(node);
        int[] x = 链表中的下一个更大节点_2.nextLargerNodes(node);
        System.out.println(Arrays.toString(x));

    }
}
