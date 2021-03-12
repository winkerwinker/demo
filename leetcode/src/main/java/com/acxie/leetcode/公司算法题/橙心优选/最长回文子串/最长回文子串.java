package com.acxie.leetcode.公司算法题.橙心优选.最长回文子串;

/**
 * @description: 使用中心扩展枚举所有方案、或者dp
 * @create: 2021/01/25 00:42
 */
public class 最长回文子串 {

    public static String longestPalindrome(String s) {
        String max = "";
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= i + 1; j++) {
                // todo要注意复制变量， 而不要一直用下去
                while (i >= 0 && j < s.length() && s.charAt(i--) == s.charAt(j++)) {
                    int left = i+1;
                    int right = j-1;

                    if (left == right) {
                        temp.append(s.charAt(left));
                    } else {
                        temp.insert(0, s.charAt(left));
                        temp.append(s.charAt(right));
                    }
                }
            }
            if (temp.length() > max.length()) {
                max = temp.toString();
            }
            temp = new StringBuffer();
        }
        return max;
    }


    public static void main(String[] args) {

        String babad = longestPalindrome("babad");
        System.out.println(babad);

    }
}
