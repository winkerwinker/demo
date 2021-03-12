package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

/**
 * @description:静态内部类实现单例
 * @create: 2021/01/17 13:44
 */
public class SignltonDCL5 {

    private SignltonDCL5 signltondcl5 = new SignltonDCL5();

    private SignltonDCL5() {

    }

    public SignltonDCL5 gen() {
        return signltondcl5;
    }

    public static class Singleton {

    }

}
