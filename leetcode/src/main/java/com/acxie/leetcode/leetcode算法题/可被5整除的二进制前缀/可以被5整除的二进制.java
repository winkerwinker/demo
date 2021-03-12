package com.acxie.leetcode.leetcode算法题.可被5整除的二进制前缀;

import org.junit.Test;

import java.util.List;

public class 可以被5整除的二进制 {

    public static List<Boolean> prefixesDivBy5(int[] A) {
        int x = 0;
        int prenum = 0;
        boolean[] B = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            x = prenum * 2 + A[i];
            B[i] = x % 5 == 0 ? true : false;
            System.out.println(B[i]);
            prenum = x;
        }
        return null;
    }

    @Test
    public void test() {
        可以被5整除的二进制.prefixesDivBy5(new int[]{0, 1, 1});
    }
}
