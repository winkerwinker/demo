package com.acxie.leetcode.公司算法题.盒马.双亲委派机制;

import java.io.*;

/**
 * @description:
 * @create: 2020/12/02 00:01
 */
public class TestClassLoaderN  extends ClassLoader{


    private String name;

    public TestClassLoaderN(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }




    @Override
    public String toString() {
        return this.name;
    }



    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class<?> clazz = null;

        //获得系统的classloader
        ClassLoader system = getSystemClassLoader();
        try {
            //通过类名去加载一个类
            clazz = system.loadClass(name);
        } catch (Exception e) {
            // ignore
        }
        if (clazz != null)
            return clazz;
        clazz = findClass(name);
        return clazz;
    }


    @Override
    public Class<?> findClass(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(new File("d:/Test.class"));
            int c = 0;
            while (-1 != (c = is.read())) {
                baos.write(c);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return this.defineClass(name, data, 0, data.length);
    }

    public static void main(String[] args) {
        TestClassLoaderN loader = new TestClassLoaderN(
                TestClassLoaderN.class.getClassLoader(), "TestLoaderN");
        Class clazz;
        try {
            // 获得类信息
            clazz = loader.loadClass("公司算法题.盒马.双亲委派机制.Test");
            Object object = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}










