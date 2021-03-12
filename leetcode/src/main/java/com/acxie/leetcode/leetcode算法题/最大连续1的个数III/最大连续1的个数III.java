package com.acxie.leetcode.leetcode算法题.最大连续1的个数III;

/**
 * @description:
 * @create: 2020/02/06 15:33
 */
public class 最大连续1的个数III {
    public static int longestOnes(int[] A, int K) {

        int count1 = 0;
        int maxcount = 0;
        for (int left = 0, right = 0; right < A.length; right++) {
            if (A[right] == 1) {
                maxcount = Math.max(maxcount, ++count1);
            }
            if (count1 + K < right - left + 1) {
                if (A[left]==1){
                    count1--;
                }
                left++;
            }
        }
        return Math.min(A.length, maxcount + K);
    }

    public static void main(String[] args) {
        // int[] a = new int[]{1, 1,  0, 0,1,0,1, 1, 0};
    //    int[] a = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int[] a = new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1};
        int resu = longestOnes(a, 8);
        System.out.println(resu);
    }
}
