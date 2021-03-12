package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

/**
 * @description:饿汉实现单例
 * @create: 2021/01/17 13:44
 */
public class SignltonDCL4 {

    private SignltonDCL4 signltondcl4 = new SignltonDCL4();

    private SignltonDCL4() {

    }


    public SignltonDCL4 gen() {
        return signltondcl4;
    }

}
