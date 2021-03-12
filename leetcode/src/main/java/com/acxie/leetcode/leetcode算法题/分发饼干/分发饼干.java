package com.acxie.leetcode.leetcode算法题.分发饼干;

import java.util.Arrays;

/**
 * @description:g是胃口，s是饼干尺寸
 * @create: 2020/02/02 13:23
 */
public class 分发饼干 {

    public static int findContentChildren(int[] g, int[] s) {
        if (s.length == 0 || g.length == 0) {
            return 0;
        }

        // Arrays.sort(g);
        //Arrays.sort(s);


        //对两组都进行排序
        sort(g, 0, g.length - 1);
        sort(s, 0, s.length - 1);
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(s));
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] > s[j]) {
                j++;
            } else {
                i++;
                j++;
                count++;
            }
        }


        System.out.println(count);
        return count;
    }


    /**
     * @description: 快速排序
     * @author: xieaichen
     * @date: 2020-02-02
     */
    public static void sort(int[] a, int low, int high) {
        //对两组都进行排序
        //对空数组不能排序
        int i = low;
        int j = high;
        int flag = a[low];
        while (i < j) {
            while (i < j && a[j] >= flag) {
                j--;
            }
            while (i < j && a[i] <= flag) {
                i++;
                //i一定要死在小到位置
            }
            if (i < j) {
                //交换了之后如果移动到同一个位置，那么那个位置就不会进行比较了，直接进行交换
                int temp;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[i];
        a[i] = flag;
//        System.out.println(i);
//        System.out.println(Arrays.toString(a));
        if (low < i - 1) {
            sort(a, low, i - 1);
        }
        if (i + 1 < high) {
            sort(a, i + 1, high);
        }
    }

    public static void main(String[] args) {
//        int[] test = new int[]{6, 4,11,1,3, 5, 9};
//        int[] test = new int[]{3, 4, 5, 1};
//        sort(test, 0, test.length - 1);
//        System.out.println(Arrays.toString(test));

        int[] test = new int[]{2, 1, 3};
        int[] test1 = new int[]{};
        findContentChildren(test, test1);
    }

}
