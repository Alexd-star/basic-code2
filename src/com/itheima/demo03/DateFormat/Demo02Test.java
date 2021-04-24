package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
利用日期时间相关的API计算出一个人已经出生了多少天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        demo02();
    }
    private static void demo02() throws ParseException {
        //从键盘获取出生日期
        System.out.println("请输入您的出生日期："+"\n格式：yyyy年MM月dd日");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.next();

        //定义一个时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //将用户输入的字符串birthday格式化为时间
        Date date = sdf.parse(birthday);
        //将格式化后的时间转换为毫秒格式
        long birthdayTime = date.getTime();

        //获取今日的时间，转换为毫秒格式
        long todayTime = new Date().getTime();


        long day = (todayTime - birthdayTime)/86400000;
        System.out.println("截至今日，您一共活了"+day+"天");
    }
}
