package com.itheima05.ThreadAndLambda.demo04.Lambda;

import java.util.Arrays;
import java.util.Comparator;
/*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo02Arrays {
    public static void main(String[] args) {
        Person[] arr ={
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19),
        };

        /*//对数组中的Person对象使用Arrays中的sort方法，再通过其中的匿名内部类Comparator自动排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getAge()-t1.getAge();
            }
        });*/

        //使用Lambda表达式，简化匿名内部类代码
        Arrays.sort(arr,(Person person, Person t1)->{
            return person.getAge()-t1.getAge();
        });

        //优化省略Lambda
        Arrays.sort(arr,(person,t1)->person.getAge()-t1.getAge());

        //遍历数组
        for (Person r :
                arr) {
            System.out.println(r);
        }
    }
}
