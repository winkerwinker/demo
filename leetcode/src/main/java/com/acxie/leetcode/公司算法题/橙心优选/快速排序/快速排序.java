package com.acxie.leetcode.公司算法题.橙心优选.快速排序;

/**
 * @description: todo 记得复习边界
 * @create: 2021/01/24 23:35
 */
public class 快速排序 {

    public static int order(int[] ints, int from, int to) {

        // 始终保持在前一个

        int snetinel = ints[from];
        while (from < to) {
            while (from < to && ints[to] > snetinel) {
                to--;
            }
            ints[from] = ints[to];
            while (from < to && ints[from] >= snetinel) {
                from++;
            }
            ints[to] = ints[from];
        }

        ints[from] = snetinel;

        return from;
    }


    public static void quick_sort(int[] ints, int from, int to) {

        int loc = 0;
        if (from < to) {
            loc = order(ints, from, to);

            order(ints, from, loc - 1);
            order(ints, loc + 1, to);
        }
    }

    public static void main(String[] args) {

//        int[] order = order(new int[]{1, 2, 3, 4, 5, 6});
//        System.out.println(Arrays.toString(order));

    }


}
