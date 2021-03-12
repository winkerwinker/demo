package com.acxie.leetcode.leetcode算法题.合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-intervals
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create: 2020/10/13 00:59
 */
public class 合并区间1 {

    static int[][] ints;

    public static int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        // 按1 排序
        List<int[]> collect = Arrays.stream(intervals).sorted(Comparator.comparingInt(o -> o[0])).collect(Collectors.toList());

//        for (int i = 0; i < collect.; i++) {
//
//        }


        return null;
    }


    public static void main(String[] args) {
        int[][] intervals =
                new int[][]{
                        {1, 3},
                        {2, 6},
                        {8, 10},
                        {15, 18},
                };


        ints = new int[intervals.length][2];

        int[][] ints = merge(intervals);
        merge(ints);
    }


}
