package com.acxie.leetcode.leetcode算法题.煎饼排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 煎饼排序 {

    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static List<Integer> pancakeSort(int[] A) {
        int maxindex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxindex]) {
                maxindex = i;
            }
        }
        //得到了最大的
        if (A.length > 1) {
            if (maxindex == 0) {
                reverse(A, A.length);
                list.add(A.length);
                A = Arrays.copyOf(A, A.length - 1);
                pancakeSort(A);
            } else if (maxindex == A.length - 1) {
                A = Arrays.copyOf(A, A.length - 1);
                pancakeSort(A);
            } else {
                reverse(A, maxindex + 1);
                list.add(maxindex + 1);
                reverse(A, A.length);
                list.add(A.length);
                A = Arrays.copyOf(A, A.length - 1);
                pancakeSort(A);
            }
        }


        return list;

    }


    public static void reverse(int[] A, int len) {
//后面一个
        for (int i = 0; i < len / 2; i++) {
            int temp = A[i];
            A[i] = A[len - 1 - i];
            A[len - 1 - i] = temp;
        }
    }


    public static void main(String[] args) {
       int[] a =new int[]{3, 2, 4, 1};
        System.out.println(pancakeSort(a));
        System.out.println(pancakeSort(a));
        System.out.println(Arrays.toString(a));
    }
}
