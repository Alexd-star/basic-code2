package com.itheima06.FileAndRecursion.demo02.Recursion;

import java.util.Scanner;
/*
    计算1~n之间和(使用递归)

    注意：
        使用递归求和，main方法调用sum方法,sum方法会一直调用sum方法
        导致在内存中有多个sum方法(频繁的创建方法，调用方法，销毁方法)效率低下

        如果仅仅是计算1~n之间的和，不推荐递归，使用for循环即可
 */
public class Demo02Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        //1~num
        int num = sc.nextInt();

        //调用sum方法
        System.out.println(sum(num));
    }

    private static int sum(int num) {
        if (num==1){
            return 1;
        }

        //递归调用sum方法 num+sum(num-1); => 3+2+1
        return num+sum(num-1);
    }
}
