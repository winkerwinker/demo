package com.acxie.leetcode.公司算法题.盒马;

/**
 * @description:https://juejin.cn/post/6844904132441014279
 * @create: 2020/12/01 00:18
 */
public class 最长不含重复字符的子字符串 {

    // 最长的，不包含重复字符的

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int left = 0;
        int right = 1;

        int max
                = 0;
        // ArrayList<Character> objects = new HashSet<>();
        // objects.add(s.charAt(left));
        //放入set
        while (right < s.length()) {
            String substring = s.substring(left, right);


            int i = substring.indexOf(s.charAt(right));
            if (i == -1) {
                right++;
            } else {
                left += substring.indexOf(s.charAt(right)) + 1;
            }
            System.out.println(s.substring(left, right).length());
            System.out.println(s.substring(left, right));

            max = Math.max(s.substring(left, right).length(), max);
        }


        return max;

    }

    public static void main(String[] args) {


        //如果是不连续要把不连续前的所有都remove
        int abcabcb = 最长不含重复字符的子字符串.lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcb);


    }
}
