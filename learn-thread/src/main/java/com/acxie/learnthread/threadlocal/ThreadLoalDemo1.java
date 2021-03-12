package com.acxie.learnthread.threadlocal;

/**
 * @Description：todo
 * @Author：oscar
 * @CreateTime：2021/2/5 4:49 下午
 */
public class ThreadLoalDemo1 {

    public static ThreadLocal<String> local = new ThreadLocal<String>();//声明静态的threadlocal变量
    public static ThreadLocal<String> local2 = new ThreadLocal<String>();//声明静态的threadlocal变量

    public static void main(String [] args){
        for(int i=0;i<2;i++){
            TestThread testThread = new TestThread();//创建5个线程
            new Thread(testThread).start();
        }
    }

}

class TestThread implements Runnable{

    @Override
    public void run() {
        ThreadLoalDemo1.local.set(Thread.currentThread().getId()+":"+System.currentTimeMillis());
        ThreadLoalDemo1.local2.set(Thread.currentThread().getId()+"");
        firstStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        secondStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        thirdStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fourthStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fStep();
    }

    public void firstStep(){
        System.out.println(ThreadLoalDemo1.local.get().toString()+":first step");//获取本线程的threadlocal变量值并打印
    }
    public void secondStep(){
        System.out.println(ThreadLoalDemo1.local.get().toString()+":second step");
    }
    public void thirdStep(){
        System.out.println(ThreadLoalDemo1.local.get().toString()+":third step");
    }
    public void fourthStep(){
        System.out.println(ThreadLoalDemo1.local.get().toString()+":fourth step");
    }
    public void fStep(){
        System.out.println(ThreadLoalDemo1.local.get().toString()+":fifth step");
    }

}


