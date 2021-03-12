package com.acxie.leetcode.leetcode算法题.四的幂;

/**
 * 之前在小吴的文章中判断一个是是否是 2 的幂次方数使用的是
 * 位运算 n & ( n - 1 )。同样的，这里依旧可以使用位运算：将这个数与特殊的数做位运算。
 */
public class 四的幂 {

    public boolean isPowerOfFour(int num) {

        if (num <= 0)
            return false;
        //先判断是否是 2 的幂
        if ((num & num - 1) != 0)
            return false;
        //如果与运算之后是本身则是 4 的幂
        if ((num & 0x55555555) == num)
            return true;
        return false;
    }
}