package com.example;
/**
 * 基本数据类型和String类型的转换
 */
public class day06 {
    public static void main(String[] args) {
        //基本数据类型转换String
        int n1 = 100;
        float f1 = 1.1f;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        System.out.println(s1);
        //String转换基本数据类型
        String s2 = "123";
        int num = Integer.parseInt(s2);
        System.out.println(num);
        //字符串转换成char
        System.out.println(s2.charAt(0));
        //要确保String转换成有效的数据类型，如果格式不正确就会抛出异常,程序终止
        String j1 = "hello";
        int k1 = Integer.parseInt(j1);
        System.out.println(k1);
    }
}
