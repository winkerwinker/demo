package com.acxie.designmode.proxydemo;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/29 1:33
 */

public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}