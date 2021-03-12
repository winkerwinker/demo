package com.acxie.leetcode.leetcode算法题.至少有K个重复字符的最长子串;

/**
 * @description:
 * @create: 2020/02/22 21:02
 */
public class 至少有K个重复字符的最长子串_4 {

    public static int longestSubstring(String s, int k) {
        if (k < 2) {
            return s.length();
        }
        return longestSubstring(s.toCharArray(), 0, s.length() - 1, k);
    }


    public static int longestSubstring(char[] chars, int left, int right, int k) {
        int[] times = new int[26];
        for (int i = left; i <= right; i++) {
            ++times[chars[i] - 'a'];
        }
        while (right - left + 1 > k && times[chars[left] - 'a'] < k) {
            left++;
        }
        while (right - left + 1 > k && times[chars[right] - 'a'] < k) {
            right--;
        }

        if (right - left + 1 < k) return 0;
        for (int i = left; i <= right; ++i) {
            //  如果第i个不符合要求，切分成左右两段分别递归求得
            if (times[chars[i] - 'a'] < k) {
                return Math.max(longestSubstring(chars, k, left, i - 1), longestSubstring(chars, k, i + 1, right));
            }
        }
        //todo
        return right - left + 1;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("bbaaacbd", 3));
    }
}

//将string装进数组
//    int[] times = new int[26];  //  26个字母
////  统计出现频次
//        for (int i = p1; i <= p2; ++i) {
//                ++times[chars[i] - 'a'];
//                }