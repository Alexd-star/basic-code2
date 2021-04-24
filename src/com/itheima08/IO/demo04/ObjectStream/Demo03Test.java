package com.itheima08.IO.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;
/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进序列化和反序列化
    分析:
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> arrayList = new ArrayList<>();
        //2.往ArrayList集合中存储Person对象
        arrayList.add(new Person("留言",18));
        arrayList.add(new Person("夹打",112));
        arrayList.add(new Person("个阿斯蒂芬",23));

        //3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\com\\itheima08\\IO\\demo01\\in.txt"));
        //4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        oos.writeObject(arrayList);

        //5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\com\\itheima08\\IO\\demo01\\in.txt"));
        //6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object o = ois.readObject();

        //8.遍历ArrayList集合
        ArrayList<Person> arrayList1 = (ArrayList<Person>)o;
        for (Person p :
                arrayList1) {
            System.out.println(p);
        }

        //9.释放资源
        ois.close();
        oos.close();
    }
}
