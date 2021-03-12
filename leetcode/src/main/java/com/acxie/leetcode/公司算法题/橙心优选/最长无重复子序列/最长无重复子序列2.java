package com.acxie.leetcode.公司算法题.橙心优选.最长无重复子序列;


import java.util.HashSet;

/**
 * 优化
 */
public class 最长无重复子序列2 {


    public static int subSeq(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        //记录一个index，标示当前的sentinel
        int sentinel = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        set.add(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            if (!set.contains(chars[i])) {
                set.add(chars[i]);
            } else {
                //注意要从不等于的位子开始，其实可以合并思路
                for (int i1 = sentinel; i1 < i; i1++) {
                    if (chars[i1] != chars[i]) {
                        set.remove(chars[i1]);
                    } else {
                        sentinel = i1 + 1;
                        break;
                    }
                }
            }

            max = Math.max(max, set.size());
        }
        return max;

    }


    public static void main(String[] args) {
        int dvdf = subSeq("bpfbhmipx");
        System.out.println(dvdf);
    }


}
