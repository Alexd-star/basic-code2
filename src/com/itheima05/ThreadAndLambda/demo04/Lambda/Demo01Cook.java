package com.itheima05.ThreadAndLambda.demo04.Lambda;
/*
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，里面传入参数Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("煮饭了");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
