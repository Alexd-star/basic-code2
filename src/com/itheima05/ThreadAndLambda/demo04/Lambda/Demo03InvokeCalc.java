package com.itheima05.ThreadAndLambda.demo04.Lambda;
/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo03InvokeCalc {
    public static void main(String[] args) {
        //匿名内部类方式
        invokeCalc(10, 15, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用Lambda 表达式调用invokeCalc方法，完成10+15的相加运算
        invokeCalc(120,130,(int a ,int b)->{
                return a+b;
        });
    }

    private static void invokeCalc(int a ,int b,Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是:"+result);
    }
}
