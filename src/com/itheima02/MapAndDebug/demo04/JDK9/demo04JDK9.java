package com.itheima02.MapAndDebug.demo04.JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9新特性：
        List接口，Set接口，Map接口：里面增加了一个静态方法of,可以给集合一次性添加多个元素
        static<E> List<E> of(E...elements)
        使用前提：
            当集合中存储的元素的个数已经确定了，不再改变时使用
        注意：
            1.of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
            2.of方法返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
            3.Set接口和Map接口不能在添加的时候有重复的元素，否则会抛出异常
 */
public class demo04JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","e");
        System.out.println(list);
//        list.add("f");//java.lang.UnsupportedOperationException不支持操作异常

        //java.lang.IllegalArgumentException非法参数异常，含有重复元素
//        Set<String> set1 = Set.of("a","b","c","d","e","a");
        Set<String> set = Set.of("a","b","c","d","e");
        System.out.println(set);
//        set.add("f");//java.lang.UnsupportedOperationException不支持操作异常

        //java.lang.IllegalArgumentException非法参数异常，含有重复元素
//         Map<String,String> map = Map.of("a","c","a","b","c","c","d","d");
        Map<String,String> map = Map.of("a","c","b","b","c","c","d","d");
        System.out.println(map);
//        map.add("f");//java.lang.UnsupportedOperationException不支持操作异常
    }
}
