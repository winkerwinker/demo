package com.acxie.leetcode.公司算法题.橙心优选.最长公共子序列;

/**
 * "ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
 * 不是连续子序列
 * 1. 枚举所有subseq
 * 2. 暴力
 */

public class 最长公共子序列 {

    public static int max;

    public static int subSeq(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) != -1) {
                return Math.max(
                        // 不算进去
                        subSeq(s1, subString(s2, i + 1)),
                        // 算进去
                        //如果 charat是最后的
                        subSeq(subString(s1, s1.indexOf(s2.charAt(i)) + 1), subString(s2, i + 1))) + 1;
            }
            //注意边界
            return subSeq(s1, subString(s2, i + 1));
        }
        return 0;
    }


    public static String subString(String s1, int a) {
        if (s1.length() <= a) {
            return "";
        }
        return s1.substring(a);
    }

    public static void main(String[] args) {
        int i = subSeq("bdfcq", "bqdfc");
        System.out.println(i);
    }
}
