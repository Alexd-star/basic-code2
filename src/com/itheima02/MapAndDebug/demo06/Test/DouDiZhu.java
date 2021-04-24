package com.itheima02.MapAndDebug.demo06.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/*
    斗地主案例(升级)
        1.利用HashMap集合，将牌的索引当作key(以便排序)，将牌的花色+牌号当作value
        2.使用ListOf方法，固定花色与牌号两个集合(不可改变)
        3.利用Collections的shuffle()方法洗牌
        4.定义一个lookPoker的方法，通过遍历到的key(索引)，用map集合poker的get方法获取到对应的value值(花色+牌号)
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个HashMap集合，用来存放牌的 {索引(key)，花色+牌号(value)}
        //创建一个ArrayList集合，先将索引放到该集合中，最后再统一遍历存到poker集合的key位置

        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //使用of方法，使得两个集合不可改变
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //先将大王、小王存进poker牌中，索引++
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        //循环遍历花色与牌号，放进poker集合中：poker({索引,花色+牌号})
        for (String n :
                numbers) {
            for (String c :
                    colors) {
                //给map集合(扑克)加一列索引
                poker.put(index, c + n);
                pokerIndex.add(index);
                //添加完一张牌，索引加一
                index++;
            }
        }

        //2.洗牌
        Collections.shuffle(pokerIndex);
//        System.out.println(poker);

        //3.放牌
        //仅仅存放牌的索引，将索引添加到ArrayList集合中
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> DiPai = new ArrayList<>();

        //循环遍历pokerIndex，通过get索引方法，将索引加到玩家和底牌的ArrayList集合中
        for (int i = 0; i < pokerIndex.size(); i++) {
            //取出每一个索引
            Integer in = pokerIndex.get(i);
            //先将三张牌放到底牌中
            if (i >= 51) {
                DiPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else {
                player03.add(in);
            }
        }

        //4.排序：给放好牌的索引的玩家集合排序，使得最后输出的牌是有序的
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(DiPai);

        //5.看牌：调用lookPoker方法
        lookPoker("刘德华", poker, player01);
        lookPoker("周星驰", poker, player02);
        lookPoker("周润发", poker, player03);
        lookPoker("底牌", poker, DiPai);
    }

    //创建一个看牌的方法，提高代码的复用性
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ":");
        //循环遍历各玩家的ArrayList(存放的扑克索引)
        for (Integer key :
                list) {
            //通过遍历到的索引key，用map集合poker的get方法获取到对应的value值
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        //获取完所有的牌后换行
        System.out.println("");
    }
}
