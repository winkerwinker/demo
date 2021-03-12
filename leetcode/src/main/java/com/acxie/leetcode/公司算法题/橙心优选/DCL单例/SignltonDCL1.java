package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

/**
 * @description:懒加载 https://juejin.cn/post/6844903800830967816
 * @create: 2021/01/17 13:44
 */
public class SignltonDCL1 {


    SignltonDCL1 dcl;

    public SignltonDCL1 getSignltonDCL() {
        if (dcl == null) {
            synchronized (SignltonDCL1.class) {
                if (dcl == null) {
                    dcl = new SignltonDCL1();
                }
            }
        }
        return dcl;
    }


}
