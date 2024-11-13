package com.example;

public class zuoye01 {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10/5);
        System.out.println(10%2);
        System.out.println(5%3);
        //-10.5%3=-10.5-(-10)/3*3=-1.5，套用公式a % b = a - a / b * b，小数运算得到的结果都是近似值
        System.out.println(-10.5%3);

        int i = 66;
        System.out.println(++i+i);

        //int num1 = (int)"18" 错误，应该Integer.parseInt("18")
        //int num2 = 18.0; 错误 优先级不支持自动转换
        double num3 = 3d;//定义double类型
        double num4 = 4f;//定义float类型
        double num5 = 4;//自动转换
        //int p = 40;
        //char c = i+1; char只能转换String
        //byte b = 19;
        // short s = b + 1; 结果字节空间大于short类型，需换更大的类型接收
        //char转换String的方法
        char b = '文';
        String str = b + "成";
        System.out.println(str);
    }

}