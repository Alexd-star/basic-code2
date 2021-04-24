package com.itheima06.FileAndRecursion.demo02.Recursion;
/*
    计算1~n之间乘积(使用递归)
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int avg = avg(4);
        System.out.println(avg);
    }

    private static int avg(int n) {
        if (n==1){
            return 1;
        }
        return n*avg(n-1);
    }
}
