package com.itheima02.MapAndDebug.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快

    HashMap集合(之前学的所有集合):可以存储null值,null键
    Hashtable集合不可以存储null值,null键

    Hashtable与Vector集合一样，在jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> link = new HashMap<>();
        link.put(null,"b");
        link.put("d",null);
        System.out.println(link);//{null=b, d=null}

        Hashtable<String,String> hashtable = new Hashtable<>();
//        hashtable.put(null,"b");
//        hashtable.put("null",null);

        //Hashtable集合传null值进去，报空指针异常：java.lang.NullPointerException
        System.out.println(hashtable);
    }
}
