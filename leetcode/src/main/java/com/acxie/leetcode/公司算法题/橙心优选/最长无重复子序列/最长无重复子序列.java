package com.acxie.leetcode.公司算法题.橙心优选.最长无重复子序列;

import java.util.HashSet;

/**
 * 无重复子序列！=无连续子序列
 */
public class 最长无重复子序列 {


    public static int subSeq(int[] ints) {

        int max = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(ints[0]);

        for (int i = 1; i < ints.length; i++) {

            if (!set.contains(ints[i])) {
                set.add(ints[i]);
            } else {
                if (ints[i] == ints[i - 1]) {
                    set = new HashSet<>();
                    set.add(ints[i]);
                } else {

                }
            }

            max = Math.max(max, set.size());
        }
        return max;

    }


    public static void main(String[] args) {

    }


}
