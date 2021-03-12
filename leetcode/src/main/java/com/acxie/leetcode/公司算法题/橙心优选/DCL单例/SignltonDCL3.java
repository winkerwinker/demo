package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

/**
 * @description:乐观锁 https://zhuanlan.51cto.com/art/201709/551753.htm
 * @create: 2021/01/17 13:44
 */
public class SignltonDCL3 {

    private SignltonDCL3 signltondcl3;

    //todo 错误点
//    private SignltonDCL3(SignltonDCL3 signltondcl3) {
//        this.signltondcl3 = signltondcl3;
//    }

    private SignltonDCL3() {

    }

//    public SignltonDCL3 gen() {
//        if (signltondcl3 == null) {
//            signltondcl3 = new SignltonDCL3();
//        }
//        return signltondcl3;
//    }


    public SignltonDCL3 gen() {
        if (signltondcl3 == null) {
            synchronized (SignltonDCL3.class) {
                if (signltondcl3 == null) {
                    signltondcl3 = new SignltonDCL3();
                }
            }
        }
        return signltondcl3;
    }

}
