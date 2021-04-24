package com.itheima01.demo04.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
    斗地主综合案例：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个存储牌的花色，一个存储牌的序号
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colors = {"♥","♠","♣","♦"};
        //先把大小王存到poker集合中
        poker.add("大王");
        poker.add("小王");

        //循环遍历2个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //把组装好的牌放到poker集合中
                poker.add(color+number);
            }
        }
//        System.out.println(poker);

        Collections.shuffle(poker);
//        System.out.println(poker);

        //发牌
        //定义4个集合，储存玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> DiPai = new ArrayList<>();

        /*
        遍历poker集合，获取每一张牌
        使用poker集合索引值%3来给3个玩家轮流发牌
        剩余3张牌放到底牌中
        注意：
            先判断底牌（i>=51），否则就发没了
         */

        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            if (i>=51){
                DiPai.add(p);
            }else if (i % 3 == 0){
                player01.add(p);
            }else if (i % 3 == 1){
                player02.add(p);
            }else if (i % 3 == 2){
                player03.add(p);
            }
        }

        //看牌
        System.out.println("玩家一："+player01);
        System.out.println("玩家二："+player02);
        System.out.println("玩家三："+player03);
        System.out.println("底牌："+DiPai);

        //给玩家抢地主身份，抢到地主的玩家拿到底牌
        Scanner sc = new Scanner(System.in);
        System.out.println("请确定哪位玩家成为地主：（输入1，2，3）");
        int i = sc.nextInt();
        switch (i){
            case 1 : {
                System.out.println("玩家一成为地主!");
                player01.addAll(DiPai);
                System.out.println("地主需要明牌吗？(填“是”或“否”)");
                String s = sc.next();
                if (s.equals("是")) {
                    System.out.println("地主的牌：" + player01);
                }
                break;
            }
            case 2 : {
                System.out.println("玩家二成为地主!");
                player02.addAll(DiPai);
                System.out.println("地主需要明牌吗？(填“是”或“否”)");
                String d = sc.next();
                if (d.equals("是")) {
                    System.out.println("地主的牌：" + player02);
                }
                break;
            }
            case 3 : {
                System.out.println("玩家三成为地主!");
                player03.addAll(DiPai);
                System.out.println("地主需要明牌吗？(填“是”或“否”)");
                String m = sc.next();
                if (m.equals("是")) {
                    System.out.println("地主的牌：" + player03);
                }
                break;
            }
        }

    }
}
