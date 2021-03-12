package com.acxie.leetcode.公司算法题.盒马;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @create: 2020/12/01 03:07
 */
public class 合并区间 {

    //注意获取大区间

    public static int[][] merge(int[][] intervals) {
        int count = 0;
        List<int[]> collect = Arrays.stream(intervals).sorted((o1, o2) -> {
            if (o1[0] - o2[0] != 0) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        }).collect(Collectors.toList());


        // 应该可以使用reduce
        List<int[]> collect1= new ArrayList<>();
        for (int i = 0; i < collect.size() - 1; i++) {
            if (collect.get(i)[1] >= collect.get(i + 1)[0]) {
                collect.set(i + 1, new int[]{collect.get(i)[0], Math.max(collect.get(i + 1)[1], collect.get(i)[1])});
                count++;
//                if (i==collect.size()-1){
//                    collect1.add(collect.get(i));
//                }
            }else {
                collect1.add(collect.get(i));
            }
        }
        collect1.add(collect.get(collect.size()-1));

        int[][] ints1 = collect.subList(count, intervals.length).toArray(new int[][]{});
        int[][] ints2 = collect1.toArray(new int[][]{});

        System.out.println(Arrays.deepToString(ints1));

        System.out.println(Arrays.deepToString(ints2));

        return ints2;
    }






    public static void main(String[] args) {
        String str = "[[2,3],[2,2],[3,3],[1,3],[5,7],[2,2],[4,6]]";

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
