package com.acxie.leetcode.leetcode算法题.替换后的最长重复字符;

/**
 * @description:
 * @create: 2020/02/06 11:59
 */
public class 替换后的最长重复字符_1 {

    // TODO: 2020-02-06 滑动窗口不会写
    public static int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] mark = new int[26];
        int maxCount = 0;

        for (int left = 0, right = 0; right < len; right++) {
            maxCount = Math.max(maxCount, ++mark[chars[right] - 'A']);
            //if判断即可，无须while循环，因为缩小一次之后肯定满足
            if (right - left + 1 - maxCount > k) {
                mark[chars[left] - 'A']--;
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
