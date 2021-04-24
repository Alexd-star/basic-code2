package com.itheima02.MapAndDebug.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口由哈希表和链表列表实现，具有可预知的迭代顺序
    底层原理：
        哈希表+链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> link = new HashMap<>();
        link.put("c","b");
        link.put("d","e");
        link.put("b","a");
        link.put("b","c");

        System.out.println(link);//  key不允许重复，无序(存跟取的顺序不同)

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c","b");
        linkedHashMap.put("d","e");
        linkedHashMap.put("b","a");
        linkedHashMap.put("b","c");

        System.out.println(linkedHashMap);//  key不允许重复，有序(存跟取的顺序相同)
    }
}
