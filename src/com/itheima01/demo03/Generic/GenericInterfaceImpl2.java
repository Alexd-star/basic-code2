package com.itheima01.demo03.Generic;
/*
    含有泛型的接口，第二种使用方式：接口使用什么类型，实现类就使用什么类型，类跟着接口走
    就相当于定义了一个含有泛型的类，创建对象的时候确定泛型使用的类型
    public interface list<E>{
        boolean add(E e);
        E get(int index);
    }
    public class ArrayList<E> implements List<E>{
        public boolean add(E e){}
        public E get(int index){}
    }
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
