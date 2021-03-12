package com.acxie.leetcode.公司算法题.橙心优选.二分查找;

/**
 * todo 跑demo
 */
public class 二分查找 {


    public static int binarySearch(int[] ints, int target) {
        // 永远是前一个
        int sentinel;
        int from = 0;
        int to = ints.length - 1;
        while (from <= to && from < ints.length && to >= 0) {
            // todo
            //  sentinel = ？ ; 出现的bug
            sentinel = (to - from) / 2 + from;
            if (target == ints[sentinel]) {
                return sentinel;
            }
            if (target < ints[sentinel]) {
                to = sentinel - 1;
            } else {
                from = sentinel + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int i = binarySearch(new int[]{1, 2, 3, 8, 9}, 9);
        System.out.println(i);

    }

}