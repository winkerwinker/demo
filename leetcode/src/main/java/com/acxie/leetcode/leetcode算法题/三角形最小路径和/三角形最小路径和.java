package com.acxie.leetcode.leetcode算法题.三角形最小路径和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @create: 2020/01/29 14:05
 */
public class 三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {

        List<Integer> result = Arrays.asList(0);
        List<Integer> temp;//上一组的成绩
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            temp = result;
            result = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                int min = 0;
                if (j == 0) {
                    min = temp.get(0);
                } else if (j == list.size() - 1) {
                    min = temp.get(j - 1);
                } else {
                    min = Math.min(temp.get(j - 1), temp.get(j));
                }
                result.add(min + list.get(j));
            }
        }

        int min = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) < min) {
                min = result.get(i);
            }
        }
        return min;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2);
        List<Integer> list1 = Arrays.asList(3, 4);
        List<Integer> list2 = Arrays.asList(6, 5, 7);
        List<Integer> list3 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangle = Arrays.asList(list, list1, list2, list3);
        minimumTotal(triangle);
    }
}
