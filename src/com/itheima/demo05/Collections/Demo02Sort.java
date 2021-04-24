package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
        import java.util.Collections; 是集合工具类，用来对集合进行操作。部分方法如下:
            public static <T> void sort (list<T> list):将集合中的元素按照默认规则排序
        注意：
            sort(list<T> list)使用前提
            被排序的集合里面储存的元素，必须是实现Comparable,重写接口中的方法compareTo定义排序规则
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,12,13,14);
        System.out.println(arrayList);

        //public static <T extends Comparable<? super T>> void sort(List<T> list) {
        //        list.sort((Comparator)null);
        //    }     将集合中的元素按照默认规则排序
        Collections.sort(arrayList);//默认是升序
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2,"a","12","c");
        System.out.println(arrayList2);
        Collections.sort(arrayList2);
        System.out.println(arrayList2);
        Collections.shuffle(arrayList2);
        System.out.println(arrayList2);

        ArrayList<Person> arrayList3 = new ArrayList<>();
        arrayList3.add(new Person("张三",18));
        arrayList3.add(new Person("李四",38));
        arrayList3.add(new Person("王五",21));

        System.out.println(arrayList3);//[Person{name='张三', age=18}, Person{name='李四', age=38}, Person{name='王五', age=21}]
        Collections.sort(arrayList3);
        System.out.println(arrayList3);
    }
}
