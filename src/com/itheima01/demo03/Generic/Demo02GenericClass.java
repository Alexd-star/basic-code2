package com.itheima01.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("任意类型");
        Object name = gc.getName();

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(2);
        Integer name1 = gc2.getName();
        System.out.println(name1);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name2 = gc3.getName();
        System.out.println(name2);
    }
}
