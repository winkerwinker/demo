package com.acxie.leetcode.leetcode算法题.替换后的最长重复字符;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @create: 2020/02/06 11:59
 */
public class 替换后的最长重复字符 {

    // TODO: 2020-02-06 滑动窗口不会写
    public static int characterReplacement(String s, int k) {

        return 0;
    }

    public static void main(String[] args) {
        ArrayList lists = new ArrayList(Arrays.asList("A", "_", "A", "_", "A", "A", "_", "_"));
        int a = preCharacterReplacement(lists, 2);
        System.out.println(a);
    }

    //滑动窗口问题简化：list A_A_AA__ 替换两个，最长连续数字是多少
    public static int preCharacterReplacement(ArrayList lists, int k) {
        int resultmax = 0;
        int max = 0;
        //使用双指针
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < lists.size() && lists.size() - i + 1 > resultmax) {
            max = j - i + 1;//当前窗口的长度

            if (lists.get(j) == "A") {
                j++;
            } else if (lists.get(j) == "_" && count < k) {
                j++;
                count++;
            } else if (lists.get(i) == "A") {
                i++;
            } else if (lists.get(i) == "_") {
                i++;
                count--;
            }
            if (count == k) {
                resultmax = Math.max(resultmax, max);
            }
        }
        return resultmax;
    }

}
