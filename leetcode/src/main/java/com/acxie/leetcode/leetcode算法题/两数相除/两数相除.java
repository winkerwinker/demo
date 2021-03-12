package com.acxie.leetcode.leetcode算法题.两数相除;


//越界问题只要对除数是1和-1单独讨论就完事了啊
/**
超时
 */
public class 两数相除 {
//如何溢出
    public static int divide(int dividend, int divisor) {
        long dived=(long)dividend<0?-(long)dividend: (long)dividend;
        long disor=(long)divisor<0?-divisor:divisor;
        long count =0;
        while(dived>=disor){
            dived-=disor;
            count++;
        }
        System.out.println(count);
        //相同则为0
        if (((long)dividend^divisor)<0){
            count=-count;
        }
        try {
            return  Integer.parseInt(count+"");
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }


    }

    public static void main(String[] args) {

        System.out.println(两数相除.divide(-2147483648,1));
    }
}
