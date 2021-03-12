package com.acxie.leetcode.leetcode公司题.字节跳动.无重复字符的最长子串;

/**
 * @Description：todo
 * @Author：oscar
 * @CreateTime：2021/2/8 5:34 下午
 * <p>
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class 无重复字符的最长子串_1 {


    // dp思想，如果不包含+1 ，如果包含需要重启长度（难点）
    public static int lengthOfLongestSubstring(String s) {


        return -1;
    }

    public static void main(String[] args) {

        int abcabcbb = lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);

    }


}
