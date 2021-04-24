package com.itheima03.ExceptionAndThread.demo06.Thread;
//1.创建一个Thread类的子类
public class MyThread extends Thread{
    //2.在Thread类的子类中直接重写Thread类中的run方法

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
