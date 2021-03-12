package com.acxie.leetcode.leetcode算法题.第N个神奇数字;


import org.junit.Test;

public class 神奇数字 {
    public static int nthMagicalNumber(int N, int A, int B) {
        int counta = 0;
        int countb = 0;
        int temp = 0;
        while (N > 0) {
            if ((counta + 1) * A > (countb + 1) * B) {
                temp = (countb + 1) * B;
                countb++;
            } else if ((counta + 1) * A < (countb + 1) * B) {
                temp = (counta + 1) * A;
                counta++;
            } else {
                temp = (counta + 1) * A;
                counta++;
                countb++;
            }
            N--;
        }
        System.out.println(temp);
        return temp;
    }


    @Test
    public void test() {
        神奇数字.nthMagicalNumber(5,2,4);
    }
}

