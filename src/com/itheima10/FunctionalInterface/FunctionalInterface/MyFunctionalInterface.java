package com.itheima10.FunctionalInterface.FunctionalInterface;
/*
    函数式接口:有且只有一个抽象方法的接口，称之为函数式接口
    当然接口中可以包含其他的方法（默认,静态,私有）
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();

}
