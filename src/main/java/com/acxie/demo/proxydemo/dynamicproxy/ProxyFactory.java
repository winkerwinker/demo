package com.acxie.demo.proxydemo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:用于生成一个代理类
 * @author: xieaichen
 * @time: 2020/8/29 1:46
 */

public class ProxyFactory {


    //目标对象----
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //invocation handler 的本质是什么
    //为对象目标生成代理对象

    //    ClassLoader loader,用于装载类
    //    Class<?>[] interfaces, 获得接口
    //    InvocationHandler h,
    public Object getProxyInstance() {
        //todo 动态生成字节码
        Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        // 执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务");
                        return null;
                    }
                });

        return result;
    }

}
