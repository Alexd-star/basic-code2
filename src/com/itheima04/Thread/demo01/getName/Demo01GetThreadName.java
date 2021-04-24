package com.itheima04.Thread.demo01.getName;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
