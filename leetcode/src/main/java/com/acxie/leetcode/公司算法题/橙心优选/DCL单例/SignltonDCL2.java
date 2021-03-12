package com.acxie.leetcode.公司算法题.橙心优选.DCL单例;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @description:乐观锁 https://zhuanlan.51cto.com/art/201709/551753.htm
 * @create: 2021/01/17 13:44
 */
public class SignltonDCL2 {


    private AtomicReference<SignltonDCL2> dcl = new AtomicReference();

    public SignltonDCL2 getSignltonDCL() {
        for (; ; ) {
            SignltonDCL2 temp = dcl.get();
            if (temp != null) {
                return dcl.get();
            }
            SignltonDCL2 dcl = new SignltonDCL2();
            if (this.dcl.compareAndSet(null, dcl)) {
                return dcl;
            }
        }

    }


}
