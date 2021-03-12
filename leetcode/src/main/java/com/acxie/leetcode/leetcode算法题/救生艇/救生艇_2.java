package com.acxie.leetcode.leetcode算法题.救生艇;

import java.util.Arrays;

public class 救生艇_2 {
    public static void sort(int a[], int low, int high) {
        if (low >= high) {
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
            while (i < j && a[i] >= index) {
                i++;
            }
            if (i < j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }


        }
        a[low] = a[i];
        a[i] = index;

        sort(a, low, j - 1);
        //递归调用右半数组
        sort(a, j + 1, high);
    }


    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }


    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        quickSort(people);
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            i++;
            if (people[i] + people[j] <= limit) {
                j--;
            }
            count++;
        }

        return count;
    }


    public static void main(String[] args) {
//        System.out.println(救生艇_2.numRescueBoats(new int[]{2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10}, 50));
        System.out.println(救生艇_2.numRescueBoats(new int[]{3, 4, 3, 5}, 6));
    }
}
