package com.acxie.leetcode.公司算法题.橙心优选.回文子串1;

/**
 * class Solution {
 * public int countSubstrings(String s) {
 * <p>
 * }
 * todo 错误 ，这个是计算个数
 * }
 */
public class 回文子串 {


    public static int countSubstrings(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < i + 1; j++) {
                int temp = 0;
                int left = i;
                int right = j;
                if (left == right) {
                    temp++;
                    left--;
                    right++;
                }
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    temp = temp + 2;
                    left--;
                    right++;
                }
                max = Math.max(max, temp);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int aabbbc = countSubstrings("aabbbc");
        System.out.println(aabbbc);

    }
}
