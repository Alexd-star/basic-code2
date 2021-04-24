package com.itheima04.Thread.demo02.setName;
/*
    设置线程的名称：(了解)
        1.使用Thread类中的方法setName(名字)
            void setName(String name)改变线程名字，
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread thread = new MyThread();
        thread.setName("小强");
        thread.start();

        new MyThread("旺财").start();
    }
}
