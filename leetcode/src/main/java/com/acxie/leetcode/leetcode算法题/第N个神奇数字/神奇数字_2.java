package com.acxie.leetcode.leetcode算法题.第N个神奇数字;


import org.junit.Test;

public class 神奇数字_2 {

    public static int nthMagicalNumber(int N, int A, int B) {
        int MOD = 1_000_000_007;
        int L = A / gcd(A, B) * B;
        int M = L / A + L / B - 1;
        int q = N / M, r = N % M;

        long ans = (long) q * L % MOD;
        if (r == 0)
            return (int) ans;

        int[] heads = new int[]{A, B};
        for (int i = 0; i < r - 1; ++i) {
            if (heads[0] <= heads[1])
                heads[0] += A;
            else
                heads[1] += B;
        }

        ans += Math.min(heads[0], heads[1]);
        return (int) (ans % MOD);
    }

    public static int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }

    @Test
    public void test() {
        int a = 神奇数字_2.nthMagicalNumber(1000000000, 40000, 40000);
        System.out.println(a);
//        神奇数字_1.maxCommonDivisor(32,40);
    }
}

