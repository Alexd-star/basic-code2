package com.itheima02.MapAndDebug.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

/*
    计算用户输入的字符串，每一个字符出现的次数(用HashMap集合统计)

    分析：
       1.用Scanner类获取用户输入的字符串
       2.创建Map集合,key是字符串中的字符，value是字符的个数
       3.遍历字符串，获取每一个字符（将字符串转换为字符数组后遍历-->toCharArray()方法）
       4.使用获取到的字符，去Map集合判断key是否存在
              key存在：
                    通过字符key获取value(字符个数)
                    value++
                    put(key,value)把新的字符串储存在Map集合中
              key不存在：
                    put(key,1)
       5.遍历Map集合输出结果
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        //1.用Scanner类获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        //2.创建Map集合,key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //3.遍历字符串，获取每一个字符
        for (char c :
                s.toCharArray()) {
            //4.使用获取到的字符，去Map集合判断key是否存在
            if (hashMap.containsKey(c)) {
                //key存在
                Integer value = hashMap.get(c);
                value++;
                hashMap.put(c, value);
            } else {
                //key不存在
                hashMap.put(c, 1);
            }
        }

        //5.遍历Map集合输出结果
        for (char k :
                hashMap.keySet()) {
            Integer v = hashMap.get(k);
            System.out.println(k + "=" + v);
        }
    }
}
