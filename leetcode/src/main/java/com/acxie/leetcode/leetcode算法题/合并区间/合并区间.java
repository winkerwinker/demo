package com.acxie.leetcode.leetcode算法题.合并区间;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @create: 2020/10/13 00:59
 */
public class 合并区间 {


    static ArrayList<int[]> res;

    public static int[][] merge(int[][] intervals) {
        intervals = Arrays.stream(intervals).sorted(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
            //后面的 同样排序
        }).toArray(int[][]::new);

        if (intervals.length == 0) {
            return intervals;
        }
        res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (res.get(res.size() - 1)[1] < intervals[i][0]) {
                res.add(intervals[i]);
            } else {
                int left = Math.min(res.get(res.size() - 1)[0], intervals[i][0]);
                int right = Math.max(res.get(res.size() - 1)[1], intervals[i][1]);
                int[] temp = new int[]{left, right};
                res.remove(res.get(res.size() - 1));
                res.add(temp);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(Arrays.toString(res.get(i)));
        }

        //todo liu
        int[][] ints = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            ints[i] = res.get(i);
        }
        return ints;
    }


    public static void main(String[] args) {
        String str = "[[1,4],[0,0]]";

        int[][] ints = toTwoDim(str);
        merge(ints);
    }


    //    two-dimensional array
    public static int[][] toTwoDim(String str) {
        str = str.replace("[[", "");
        str = str.replace("]]", "");
        String[] split = str.split("\\],\\[");
        int[][] ints = new int[split.length][];
        for (int i = 0; i < split.length; i++) {
            int[] ints1 = Arrays.stream(split[i].split(",")).map(a -> Integer.valueOf(a.trim())).mapToInt(Integer::intValue).toArray();
            ints[i] = ints1;
        }
//        System.out.println(Arrays.deepToString(ints));
        return ints;
    }


}
