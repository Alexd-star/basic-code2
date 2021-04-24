package com.itheima04.Thread.demo07.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的二种方案:
            定义同步方法
            同步方法也会把方法内部的代码锁住
            只让一个线程运行
    格式：
        public static synchronized void payTicket(){
            可能会出现线程安全的代码(访问了共享数据的代码)
        }

    注意：
        同步方法的锁对象：就是实现类对象  new RunnableImpl();
        也就是this

        静态的同步方法
        锁对象：不能是this，this是创建对象之后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性-->class文件对象
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj =new Object();

    //设置线程任务:卖票
    @Override
    public void run() {
        System.out.println(this);//com.itheima04.Thread.demo07.Synchronized.RunnableImpl@312b1dae
        //使用死循环，让卖票操作重复执行
        while (true) {
            payTicket();
        }
    }

    public static /*synchronized*/ void payTicket(){
        synchronized (RunnableImpl.class){
            //先判断票是否存在
            if (ticket > 0) {
                //提高安全问题发生的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
