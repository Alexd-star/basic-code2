package com.itheima01.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Coll {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("He");
        coll.add("llo");
        coll.add("Wo");
        coll.add("rld");

        //boolean remove(E e);  删除集合中的某个元素
        coll.remove("Wo");
        //void.clear    清空集合的所有元素
        //        coll.clear();

        System.out.println(coll);
        //创建Collection集合的遍历迭代器
        for (Iterator<String> iterator = coll.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("======================");
        //多态，接口指向对象
        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        //boolean contains(E e);   判断集合中是否包含某个元素
        boolean result = coll.contains("rld");
        System.out.println("\n"+result);

        //void.isEmpty();   判断集合是否为空  无返回值
        boolean empty = coll.isEmpty();
        System.out.println(empty);

        //int size获取集合的长度
        System.out.println(coll.size());

        //Object[] toArray();  将集合转成一个数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
