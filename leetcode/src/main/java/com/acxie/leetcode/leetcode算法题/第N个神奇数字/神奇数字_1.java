package com.acxie.leetcode.leetcode算法题.第N个神奇数字;


import org.junit.Test;

public class 神奇数字_1 {
    public static int nthMagicalNumber(int N, int A, int B) {
      //先求一个最小公倍数
        int MOD = 1_000_000_007;
        int commonMultiple=minCommonMultiple(A,B);
        int total=commonMultiple/A+commonMultiple/B-1;
        int r=N%total;
        int counta = 0;
        int countb = 0;
        int temp = 0;
        while (r > 0) {
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
            r--;
        }
        System.out.println(temp);
        return  (int)((temp+((long)N/total*commonMultiple))%MOD);


    }

    //递归法求最大公约数
    public static int maxCommonDivisor(int m,int n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {// 若余数为0,返回最大公约数
            return n;
        } else { // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonDivisor(n, m % n);
        }
    }

    public static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor(m, n);
    }

    @Test
    public void test() {
       int a= 神奇数字_1.nthMagicalNumber(887859796,29911,37516);
        System.out.println(a);
//        神奇数字_1.maxCommonDivisor(32,40);
    }
}



