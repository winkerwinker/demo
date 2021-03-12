package com.acxie.designmode.proxydemo.staticproxy;

import com.acxie.designmode.proxydemo.IUserDao;
import com.acxie.designmode.proxydemo.UserDao;
import org.junit.Test;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/29 1:33
 */

public class UserDapProxy implements IUserDao {


    private IUserDao target;

    public UserDapProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        //todo 但是这里的事情就会被写死
        System.out.println("开启事务");//扩展了额外功能
        target.save();
        System.out.println("提交事务");
    }

}

class StaticUserProxyTest {
//    @Test
    public void testStaticProxy() {
        //目标对象
        IUserDao target = new UserDao();
        //代理对象
        UserDapProxy proxy = new UserDapProxy(target);
        proxy.save();
    }

    public static void main(String[] args) {

        System.out.printf("111");
    }
}