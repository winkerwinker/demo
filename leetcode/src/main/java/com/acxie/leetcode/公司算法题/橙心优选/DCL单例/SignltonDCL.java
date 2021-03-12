package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

/**
 * @description:懒加载
 * @create: 2021/01/17 13:44
 * <p>
 * 不能忘记的关键点
 * <p>
 * 1. 私有化变量
 * 2. 私有化构造方法
 *
 */
public class SignltonDCL {


    private SignltonDCL dcl;

    public SignltonDCL getSignltonDCL() {
        synchronized (SignltonDCL.class) {
            if (dcl == null) {
                dcl = new SignltonDCL();
            }
        }
        return dcl;
    }



}
