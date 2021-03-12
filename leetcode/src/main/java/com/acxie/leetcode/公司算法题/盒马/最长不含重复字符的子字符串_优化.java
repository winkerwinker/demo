package com.acxie.leetcode.公司算法题.盒马;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:https://juejin.cn/post/6844904132441014279
 * @create: 2020/12/01 00:18
 */
public class 最长不含重复字符的子字符串_优化 {

    // 最长的，不包含重复字符的

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        if (s.length() < 2) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            char c = s.charAt(right++);
            String substring = s.substring(left, right);

            //存在重复的字符，则移动左指针，直到滑动窗口中不含有该字符,难道不应该是个list吗
            while (set.contains(c)) {
                set.remove(s.charAt(left++));
            }

            set.add(c);
            max = Math.max(max, right - left);


        }


        return max;

    }

    public static void main(String[] args) {


        //如果是不连续要把不连续前的所有都remove
        int abcabcb = 最长不含重复字符的子字符串_优化.lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcb);


    }
}
