package com.itheima04.Thread.demo02.setName;

public class MyThread extends Thread {
    public MyThread(){}

    public MyThread(String name){
        super(name);//把线程名称传递给父类，让父类(Thread)给子类线程起一个名字
    }
    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
