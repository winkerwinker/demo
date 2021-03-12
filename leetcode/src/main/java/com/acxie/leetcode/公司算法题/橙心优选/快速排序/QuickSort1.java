package com.acxie.leetcode.公司算法题.橙心优选.快速排序;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort1 {


    public static void sort(int a[], int low, int high) {
        if (low >= high) {
            return;
        }
        int partion = partion(a, low, high);
        sort(a, partion + 1, high);
        sort(a, low, partion - 1);

    }

    public static int partion(int a[], int low, int high) {
        int standard = a[low];
        int sentinel = low;

        int index = sentinel + 1;

        for (int i = index; i <= high; i++) {
            if (a[index] < standard) {
                int temp = a[index];
                a[index] = a[sentinel];
                a[sentinel] = temp;

                sentinel = index;
                index++;
            }
        }

        return sentinel;
    }


    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }


    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }


}
