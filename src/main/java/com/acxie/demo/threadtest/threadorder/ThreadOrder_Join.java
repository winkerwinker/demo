package com.acxie.demo.threadtest.threadorder;

/**
 * @description:让线程按顺序执行8种方法
 * @author: xieaichen
 * @time: 2020/8/23 22:38
 */


//1.早上；2.测试人员、产品经理、开发人员陆续的来公司上班；3.产品经理规划新需求；4.开发人员开发新需求功能；5.测试人员测试新功能
//1.使用线程的join方法
//join():是Theard的方法，作用是调用线程需等待该join()线程执行完成后，才能继续用下运行。


public class ThreadOrder_Join {

    Thread thread1 =new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("产品");
        }
    });

    Thread thread2 =new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开发");
        }
    });

    Thread thread3 =new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("测试");
        }
    });


    public static void main(String[] args) {
        ThreadOrder_Join threadOrder=new ThreadOrder_Join();
        threadOrder.thread1.start();
        threadOrder.thread2.start();
        threadOrder.thread3.start();
    }


}
