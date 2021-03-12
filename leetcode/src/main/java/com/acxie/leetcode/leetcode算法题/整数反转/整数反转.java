package com.acxie.leetcode.leetcode算法题.整数反转;

import org.junit.Test;

//则其数值范围为 [−2^31,  2^31 − 1]。
//option+command+t 快速插入
//-2147483412

public class 整数反转 {
    public static int reverse(int x) {
        if (x == 0) return 0;
        int real = x;
        x = (x < 0) ? -x : x;

        System.out.println(x);
        long temp = (long)x * 10;
        StringBuilder sb = new StringBuilder();
        if (real < 0) sb.append("-");
        while (temp >= 10) {
            temp = temp / 10;
            long now = temp % 10;
            System.out.println(now);
            sb.append(now);
        }

        System.out.println(sb);
        int result;
        try {
            result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;
    }

    @Test
    public void test() {
        //2147483647
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(-2147483412 >= Integer.MIN_VALUE);
        整数反转.reverse(-2147483412);
    }
}

//Integer:max为21亿