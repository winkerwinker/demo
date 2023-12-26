/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.acxie.leetcode.leetcode算法题.插入区间;

/**
 * @author xichang
 * @version 插入区间.java, v 0.1 2023年12月18日 2:07 PM xichang
 * <p>
 * 关联 【合并区间】这个题目
 */
public class 插入区间 {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        // 排除极端场景就是，整个东西就在x 和y 的范围内


        // 找到左边点，所在的区间，如果没有那么以左边为起点。如果有以所在区间的x 为起点
        // 向右扩展
        for (int i = 0; i < intervals.length; i++) {
            int[] oneLine = intervals[i];


        }



    }


    public static int intersect(int x, int y, int x1, int y1) {
        // 这个方法的基础是按X排序， x 肯定是小于等于x1的
        // 1 表示 A直接包含B
        // 0 表示 完全相等
        // 2表示交错相交
        // -2表示完全不相交
        if (x == x1 && y == y1) {
            return 0;
        }
        if (y >= y1) {
            return 1;
        }

        if (y < x1) {
            return -2;
        }
        return 2;
    }

    public static void main(String[] args) {
        int[][] intervals =
                new int[][]{
                        {1, 3},
                        {6, 9},
                };

        int[] intervals1 =
                new int[]{2, 5};


        insert(intervals, intervals1);


    }

}



