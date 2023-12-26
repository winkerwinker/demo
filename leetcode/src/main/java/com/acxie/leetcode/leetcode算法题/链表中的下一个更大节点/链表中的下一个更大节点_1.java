package com.acxie.leetcode.leetcode算法题.链表中的下一个更大节点;


import com.acxie.leetcode.struct.listnode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/next-greater-node-in-linked-list/solutions/442247/5chong-jie-jue-fang-shi-tu-wen-xiang-jie-by-sdwwld/
 * 转list 暴力计算
 */
public class 链表中的下一个更大节点_1 {


    public static int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        //三句话，链表转数组
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }


        int[] res = new int[list.size()];
        // for循环一下
        for (int i = 0; i < list.size() - 1; i++) {

// 从第二个层次for 循环一下
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(i)) {
//如果有更大的就break
                    res[i] = list.get(j);
                    break;
                }


            }
        }

        return res;
    }


    public static void main(String[] args) {
//        ListNode node = new ListNode(new int[]{2,7,4,3,5});
//        ListNode node = new ListNode(new int[]{7,4,3,2});
        ListNode node = new ListNode(new int[]{1, 7, 5, 1, 9, 2, 5, 1});
        System.out.println(node);
        int[] x = 链表中的下一个更大节点_1.nextLargerNodes(node);
        System.out.println(Arrays.toString(x));

    }
}
