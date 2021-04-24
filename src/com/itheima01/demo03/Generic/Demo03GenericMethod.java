package com.itheima01.demo03.Generic;
/*
    测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args){
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /*
            调用含有泛型的方法method01
            传递什么类型，泛型就是什么类型
         */
        gm.method01("你哈珀");
        gm.method01(124);
        gm.method01(2.01);
        gm.method01(false);


        gm.method02("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名(参数)可以直接调用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
