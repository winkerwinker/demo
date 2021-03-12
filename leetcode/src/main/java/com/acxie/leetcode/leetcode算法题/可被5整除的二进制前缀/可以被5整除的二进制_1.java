package com.acxie.leetcode.leetcode算法题.可被5整除的二进制前缀;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class 可以被5整除的二进制_1 {

    public static List<Boolean> prefixesDivBy5(int[] A) {
        int x = 0;
        int prenum = 0;
        Boolean[] B = new Boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            x = prenum * 2 + A[i];
            prenum=x % 5;
            B[i] = prenum == 0 ? true : false;
//            System.out.println( B[i]);
        }
//        System.out.println(Arrays.asList(B).toString());
        return Arrays.asList(B);
    }

    @Test
    public void test() {
        可以被5整除的二进制_1.prefixesDivBy5(new int[]{0, 1, 1});
    }
}
