package com.acxie.leetcode.leetcode算法题.替换后的最长重复字符;

/**
 * @description:
 * @create: 2020/02/06 11:59
 */
public class 替换后的最长重复字符_2 {

    // TODO: 2020-02-06 滑动窗口不会写
    public static int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] mark = new int[26];
        int maxCount = 0;
        for (int left = 0, right = 0; right < len; right++) {
            maxCount = Math.max(maxCount, ++mark[chars[right] - 'A']);
            //maxCount肯定没有增大
            if (maxCount + k < right - left + 1) {
                mark[chars[left] - 'A']--;
                //这里-- 了 对maxcount没有影响吗
                left++;
            }
        }
        return Math.min(len, maxCount + k);
    }


    public static void main(String[] args) {
        //  ArrayList lists = new ArrayList(Arrays.asList("A", "_", "A", "_", "A", "A", "_", "_"));
        String s = "ABABAABB";
        int a = characterReplacement(s, 2);
        System.out.println(a);
    }


}
