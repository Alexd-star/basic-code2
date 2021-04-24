package com.itheima05.ThreadAndLambda.demo03.Lambda;

/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程启动了");
    }
}
