package com.acxie.learnthread.lock.notifydemo;

/**
 * @description:那么wait方法及notify也是数据对象的，他们都是对某一个对象的锁的获取和释放
 * @create: 2020/12/01 22:27
 */
public class Test {


    public synchronized void testWait() {
        System.out.println(Thread.currentThread().getName() + " Start----");
        try{
            //如果一个线程调用了wait方法，那么该线程进入该对象的等待池中（释放锁），
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End------");
    }

    public static void main(String[] args) throws Exception{
        final Test test = new Test();
        for(int i = 0; i < 5; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.testWait();
                }
            }).start();
        }
        Thread.sleep(1000);


        //全部滚进等待池
        synchronized (test){
            //todo
            test.notify();
        }
        Thread.sleep(3000);

        System.out.println("---------------我是分割线-------------");

        synchronized (test){
            test.notifyAll();
        }
    }
}


//在notify方法调用时，只会去唤醒等待池中的一个线程，notifyAll是会唤醒所有的等待线程。
//如果没有被唤醒的线程，将一直处于等待池中，由于我们的线程没有设置成daemon线程，所以处于等待池中的线程如果一直没有被唤醒，那么我们的程序将不会停止。