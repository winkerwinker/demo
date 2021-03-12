package com.acxie.leetcode.leetcode算法题.一和零;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/9/2 16:33
 */

//在计算机界中，我们总是追求用有限的资源获取最大的收益。
//现在，假设你分别支配着 m 个0和 n 个1。另外，还有一个仅包含0和1字符串的数组。
//你的任务是使用给定的m 个0和 n 个1，找到能拼出存在于数组中的字符串的最大数量。每个0和1至多被使用一次。

//多维数组的背包问题
public class 一和零_dp {


    static int[][] ints;

    public static int findMaxForm(String[] strs, int m, int n) {
//        strs转数组
        ints = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                ints[i][j] = -1;
            }
        }
        findMaxForm1(Arrays.asList(strs), m, n);
        System.out.println(Arrays.deepToString(ints));
        return ints[m][n];
    }


    public static int findMaxForm1(List<String> strs, int m, int n) {
        if (m < 0 || n < 0 || (m == 0 && n == 0)) {
            return 0;
        }

        int tempmax = 0;
        for (String str : strs) {
            int[] helper = helper(str);
            List<String> temp = new ArrayList<>();
            temp.addAll(strs);
            temp.remove(str);

            int i = (m < helper[0] || n < helper[1]) ? 0 : 1;


            // TODO: 2020/10/12   不选择当前考虑的字符串，至少是这个数值 ||  因此会出错
//            if (m - helper[0] >= 0 && n - helper[1] >= 0 && ints[m - helper[0]][n - helper[1]] != -1) {
//                tempmax = Math.max(tempmx, i + ints[m - healper[0]][n - helper[1]]);
//            } else {
//                tempmax = Math.max(tempmax, i + findMaxForm1(temp, m - helper[0], n - helper[1]));
//            }
            tempmax = Math.max(tempmax, i + findMaxForm1(temp, m - helper[0], n - helper[1]));
            System.out.println(Arrays.deepToString(ints));
        }
        ints[m][n] = tempmax;
        return tempmax;
    }


    public static int[] helper(String str) {
        int[] ints = new int[2];
        int count1 = 0;
        for (char c : str.toCharArray()
        ) {
            if (c == '1') {
                count1++;
            }
        }
        ints[0] = str.length() - count1;
        ints[1] = count1;
        return ints;
    }


    public static void main(String[] args) {
//        String[] a = new String[]{"10", "0001", "111001", "1", "0"};
//        int maxForm = findMaxForm(a, 5, 3);

        String[] a = new String[]{"10", "0", "1"};
        int maxForm = findMaxForm(a, 2, 1);
        System.out.println(maxForm);
    }
}
