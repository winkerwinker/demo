package com.acxie.leetcode.公司算法题.橙心优选.回文子串1;

/**
 * class Solution {
 * public int countSubstrings(String s) {
 * <p>
 * }
 * <p>
 * }
 */
public class 回文子串1 {


    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= i + 1; j++) {
                int left = i;
                int right = j;
                if (left == right) {
                    left--;
                    right++;
                    count++;
                }
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    count++;
                    left--;
                    right++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        // 返回6
        int aabbbc = countSubstrings("aaa");
        System.out.println(aabbbc);

    }
}
