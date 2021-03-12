package com.acxie.leetcode.算法类型.快速选择;

import java.util.Arrays;

/**
 * @description:
 * @create: 2020/01/29 13:00
 */
public class TOPK {


    public static int select(int[] a, int k) {

        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int j = partion(a, low, high);

            System.out.println(Arrays.toString(a));
            if (j > k-1) {
                low = j + 1;
            } else if (j < k-1) {
                high = j - 1;
            }
            return a[k-1];
        }

        //如果只有一个元素
        return a[k-1];
    }

    private static int partion(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int flag = a[low];
        int temp;
        while (i < j) {

            while (i < j && a[j] >= flag) {
                j--;
            }
            while (i < j && a[i] <= flag) {
                i++;
            }
            if (i < j) {
                temp = a[i];
                a[i++] = a[j];
                a[j--] = temp;
            }
        }
        a[low] = a[i];
        a[i] = flag;
        return i;
    }


    public static void main(String[] args) {

        System.out.println(  select(new int[]{2,1,4,6,5},4));
    }
}
