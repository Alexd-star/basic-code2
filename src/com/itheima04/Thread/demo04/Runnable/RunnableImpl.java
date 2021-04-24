package com.itheima04.Thread.demo04.Runnable;
//1.创建一个Runnable接口的实现类
public class RunnableImpl implements Runnable {
    //2.在实现类中直接重写Runnable接口中的run方法，设置线程任务（开启线程要做什么）
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }


}
