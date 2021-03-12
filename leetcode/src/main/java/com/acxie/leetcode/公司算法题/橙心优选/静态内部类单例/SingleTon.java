package com.acxie.leetcode.公司算法题.橙心优选.静态内部类单例;

public class SingleTon {


    public static SingleTon getInstance() {
        return SingleTonHoler.INSTANCE;
    }

    public static void main(String[] args) {


    }

    private static class SingleTonHoler {
        private static SingleTon INSTANCE = new SingleTon();
    }


}
