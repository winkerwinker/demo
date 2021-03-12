package com.acxie.leetcode.leetcode算法题.可被5整除的二进制前缀;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class 可以被5整除的二进制_2 {

    public static List<Boolean> prefixesDivBy5(int[] A) {
        int prenum = 0;
        List B = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            //位运算优先级比较低，要打上括号
            prenum = ((prenum << 1) + A[i]) % 5;
            B.add(prenum == 0 ? true : false);
        }
//        System.out.println(B);
        return B;
    }

    @Test
    public void test() {
        可以被5整除的二进制_2.prefixesDivBy5(new int[]{0, 1, 1});
    }
}
