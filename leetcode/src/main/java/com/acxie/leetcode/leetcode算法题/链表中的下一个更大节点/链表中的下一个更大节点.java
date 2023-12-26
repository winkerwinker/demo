package com.acxie.leetcode.leetcode算法题.链表中的下一个更大节点;


import com.acxie.leetcode.struct.listnode.ListNode;
import lombok.val;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 链表中的下一个更大节点 {





    public static int[] nextLargerNodes(ListNode head) {

        List<Integer> integers = new ArrayList<>();

        // 还需要找到len
        int index=0;
        ListNode now = head;
        while (now!=null) {
            int presentNum = nextLargerNodes1(now);
            now = now.next;
            integers.add(presentNum);
        }

        return integers.stream().mapToInt(Integer::valueOf)
                .toArray();
    }


    public static int nextLargerNodes1(ListNode head) {
        // 寻找到当前这个数字往后的最大数字
        int oldNum=head.val;
        int flagNum=head.val;

        ListNode now = head.next;
        while (now!=null) {
            // TODO ，如果用逆向思维思考
            // 一直找比当前最大的数字，有更大的就覆盖，一直到没有更大的
            if (flagNum<now .val){
                flagNum= now.val;
                break;
            }
            now = now.next;
        }
        if (oldNum==flagNum){
            return 0;
        }

        return flagNum;


    }


    public static void main(String[] args) {
//        ListNode node = new ListNode(new int[]{2,7,4,3,5});
//        ListNode node = new ListNode(new int[]{7,4,3,2});
        ListNode node = new ListNode(new int[]{1,7,5,1,9,2,5,1});
        System.out.println(node);
        int[] x = 链表中的下一个更大节点.nextLargerNodes(node);
        System.out.println(Arrays.toString(x));

    }
}
