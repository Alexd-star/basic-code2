package com.itheima04.Thread.demo10.WaitAndNotify;
/*
    进入到TimeWaiting(计时等待)有两种等待方式
    1.使用sleep(long m)方法，在毫秒结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，
      线程睡醒进入到Runnable/Blocked状态

    唤醒的方法：
        void notify() 唤醒此对象监视器上等待的单个线程
        void notifyAll() 唤醒此对象监视器上等待的所有线程
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj1 = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj1) {
                        System.out.println("告知老板要的包子的种类和数量");
                        try {
                            obj1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好了，顾客1开吃！");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        //Lambda 表达式，也可称为闭包
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj1) {
                        System.out.println("告知老板要的包子的种类和数量");
                        try {
                            obj1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好了，顾客2开吃！");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        //创建一个老板线程（生产者）
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(1000);//花了五秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能由一个执行，需要使用同步技术
                    synchronized (obj1) {
                        System.out.println("老板五秒之后做好包子，告诉顾客可以吃包子了");
                        //做好包子后，调用notifyAll方法，唤醒所有的顾客吃包子
                        //obj.notify;//如果有多个等待的线程，随机唤醒一个
                        obj1.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
