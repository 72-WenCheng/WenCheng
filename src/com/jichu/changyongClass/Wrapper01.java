package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 包装类
 * 针对八种基本定义相应的引用类型
 * 具有类的特点，可以调用其方法
 * boolean Boolean
 * char Character
 * 以下其父类是Number
 * byte Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * 包装类与基本数据类型转换
 * 包装类与String类型的转换
 */
public class Wrapper01 {
    public static void main(String[] args) {
        //包装类与基本数据类型转换
        //int -- Integer的装箱和拆箱
        int n1 = 120;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        int i = integer.intValue();

        //jdk5后自动装箱和拆箱
        int n2 = 200;
        Integer integer2 = n2;

        int n3 = integer2;

        //测试面试题
        Double d = 100d;
        Float f = 1.5f;

        Object obj01 = true?new Integer(1):new Double(2.0);//三元运算符是一个整体
        System.out.println(obj01);

        Object obj02;
        if (true){
            obj02 = new Integer(1);
        }else {
            obj02 = new Double(2.0);
        }
        System.out.println(obj02);

        //包装类与String类型的转换
        Integer b = 100;
        //方式一
        String str1 = b + " ";
        //方式二
        String str2 = b.toString();
        //方式三
        String str3 = String.valueOf(i);
        //方式四
        String str4 = "123";
        Integer i2 = Integer.parseInt(str4);
        //方式五
        Integer i3 = new Integer(str4);

        //Integer面试题
        Integer a1 = new Integer(1);
        Integer m1 = new Integer(1);
        System.out.println(a1 == m1);

        Integer p = 1;
        Integer c = 1;
        System.out.println(p == c);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
