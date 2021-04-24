package com.itheima02.MapAndDebug.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同，也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是意义对应的
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点：
        1.HashMap集合的底层是哈希表：查询速度非常快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树
     java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
     LinkedHashMap的特点：
            1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
            2.LinkedHashMap集合是一个有序的集合，存储元素和取出的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    /*
    boolean containKey(Object key) 判断集合中是否包含指定的键
    包含返回true,不包含返回false
     */
    private static void show04() {
        //创建Map集合对象
        Map<String,Integer> map  = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        boolean b = map.containsKey("赵丽颖");
        System.out.println("b:"+b);
        boolean b1 = map.containsKey("赵颖");
        System.out.println("b1:"+b1);
    }

    /*
        public V get(Object key)根据指定的值，在Map集合中获取对应的值
            返回值:
                key存在，v返回对应的value值
                key不存在，v返回null
     */
    private static void show03() {
        //创建Map集合对象
        Map<String,Integer> map  = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Integer v1 = map.get("杨颖");
        System.out.println("v1:"+v1);

        Integer v2 = map.get("迪丽热巴");
        System.out.println("v2:"+v2);
    }

    /*

     */
    private static void show02() {
        //创建Map集合对象
        Map<String,Integer> map  = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);


        Integer remove = map.remove("林志玲");
        System.out.println(remove);
        System.out.println(map);//{赵丽颖=168, 杨颖=165}

        /*
            public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
                返回值:V
                    key不存在,v返回被删除的值
                    key不存在,v返回null
         */

//        int remove2 = map.remove("林志颖");//自动拆箱
        //会报错，java.lang.NullPointerException，返回空，null不能返回给int类型
        Integer remove2 = map.remove("林志颖");
        System.out.println(remove);
    }

    /*
        public V put (K key,V value): 把指定的键与指定的值添加到Map集合中
            返回值：v
                存储键值对的时候,key不重复，返回的V是null
                存储键值对的时候,key重复，会使用新的value代替map中重复的value,返回被替代的value值
     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<>();

        String put = map.put("迪丽热巴", "鹿晗1");
        System.out.println("put:"+put);
        String put1 = map.put("迪丽热巴", "鹿晗2");
        System.out.println("put1:"+put1);
        System.out.println(map);
    }
}
