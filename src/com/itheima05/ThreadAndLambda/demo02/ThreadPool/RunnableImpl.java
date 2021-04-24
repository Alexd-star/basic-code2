package com.itheima05.ThreadAndLambda.demo02.ThreadPool;

public class RunnableImpl implements Runnable{
    //2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
    @Override
    public void run() {
        //currentThread()-->获取当前线程
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
