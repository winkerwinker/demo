package com.acxie.leetcode.leetcode算法题.验证回文串;

/**
 * @description:
 * @create: 2020/02/03 12:08
 */
public class 验证回文串 {
//    String aa = "223 3 #d 的 是个很__  EEE=+";
//    aa = aa.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", "");  //去除数字，英文，汉字  之外的内容
//　　　 　System.out.println(aa);  //输出为   2233d的是个很EEE
//　　    replaceAll("[\\s*|\t|\r|\n]", "");  // 去除所有空格，制表符

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        int left =0;
        int right=s.length()-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {


        System.out.println(isPalindrome("     Aqman, a plan, a canal: Panama"));

    }
}
