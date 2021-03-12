package com.acxie.leetcode.leetcode算法题.整数反转;

import org.junit.Test;

//要在没有辅助堆栈 / 数组的帮助下 “弹出” 和 “推入” 数字，我们可以使用数学方法。/

public class 整数反转_1 {
    public static int reverse(int x) {
        int rev = 0;
       // while (x > 0) {
        while (x != 0) {
            int pop = x % 10;
            x/=10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10 && pop <-8 )) return 0;
            rev = rev * 10 + pop;

        }
        return rev;
    }

    @Test
    public void test() {
        整数反转_1.reverse(-123);
    }
}

//Integer:max为21亿