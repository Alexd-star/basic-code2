package com.itheima01.demo03.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2();
        gi2.method(123);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2();
        gi3.method(20.122);
    }
}
