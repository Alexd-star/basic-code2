package com.itheima05.ThreadAndLambda.demo03.Lambda;

/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();
        //创建Thread线程类，传入runnable对象
        Thread thread = new Thread(runnable);
        //开启线程
        thread.start();

        //使用匿名内部类，实现多线程程序
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        };
        new Thread(runnable1).start();

        //简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        }).start();
    }
}
