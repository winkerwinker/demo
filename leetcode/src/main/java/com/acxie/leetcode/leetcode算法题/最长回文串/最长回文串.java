package com.acxie.leetcode.leetcode算法题.最长回文串;

import java.util.HashSet;

/**
 * @description:
 * @create: 2020/01/29 17:17
 */
public class 最长回文串 {

    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {


        HashSet<Character> set = new HashSet();
        for (Character c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return set.size() == 0 ? s.length() - set.size() : s.length() - set.size() + 1;
    }
}
