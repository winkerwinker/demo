package com.acxie.leetcode.leetcode算法题.重复字符的最长子串;

/**
 * @description:
 * @create: 2020/02/06 14:29
 */
public class 重复字符的最长子串 {

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] chars = s.toCharArray();
        if (s.length() == 1) {
            return 1;
        }

        for (int left = 0, right = 1; right < chars.length; right++) {
            max = Math.max(max, right - left);
            if (s.substring(left, right).contains(chars[right] + "")) {
                left = s.substring(left, right).indexOf(chars[right])+1+left;
                right = left ;
            } else {
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("aab");
    //    int a = lengthOfLongestSubstring("dvdf");
    //  int a = lengthOfLongestSubstring("bbbbb");
        System.out.println(a);

    }
}
