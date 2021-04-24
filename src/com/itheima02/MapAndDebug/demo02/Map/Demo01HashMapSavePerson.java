package com.itheima02.MapAndDebug.demo02.Map;

import java.util.*;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("==============================");
        show02();
    }

    private static void show01() {
        HashMap<Person,String> map = new HashMap<>();

        map.put(new Person("赵六",18),"北京");
        map.put(new Person("李四",21),"杭州");
        map.put(new Person("王五",15),"上海");
        map.put(new Person("赵六",18),"广州");

        Set<Person> set = map.keySet();
        for (Person key :
                set) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("==============================");
        Set<Map.Entry<Person,String>> set1 = map.entrySet();
        for (Map.Entry<Person, String> entry :
                set1) {
            Person key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "=" + value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals,可以保证key唯一
        key:HashMap存储自定义类型键值
            作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
     */
    private static void show02() {
        HashMap<String,Person> map = new HashMap<>();

        map.put("北京",new Person("张三",18));
        map.put("广州",new Person("李四",21));
        map.put("上海",new Person("王五",15));
        map.put("广州",new Person("赵六",28));

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Person value = map.get(key);

            System.out.println(key+"="+value);
        }
    }
}
