package com.acxie.leetcode.快速排序;

import java.util.Arrays;

public class 快速排序 {


    public static void sort(int a[], int low, int high) {
        if (low>=high){
            return;
        }
        int i = low;
        int j = high;
        int index = a[low];
        int t;
        while (i < j) {
            while (i < j && a[j] <= index) {
                j--;
            }
            while (i<j&&a[i] >= index) {
                i++;
            }
            if (i<j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }

            System.out.println(Arrays.toString(a));
        }
        a[low]=a[i];
        a[i]=index;
        System.out.println(Arrays.toString(a));
        sort(a, low, j-1);
        //递归调用右半数组
        sort(a, j+1, high);
    }


    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }


    public static void main(String[] args) {
        int[] array = { 5,1,4,2 };
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }


}
