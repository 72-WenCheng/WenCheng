package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 常见运行时异常
 * NullpointerException空指针异常
 * 当应用程序试图需要对象的地方使用null时
 * ArithmeticExceptionsty数学运算异常
 * 当出现异常的运算条件时
 * ArrayIndexOutOfBoundsException数组下标越界异常
 * 用非法索引访问数组时抛出的异常，如果索引为负或大于数组大小
 * ClassCastException类型转换异常
 * 当试图将对象强制转换为不是实例的子类时
 * NumberFormatException数字格式不正常异常
 * 当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为合适格式时
 */
public class Exceptionsty02 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int[] arr = {1,2,3};
            int a = arr[3];
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String name = "文成";
            int num = Integer.parseInt(name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        P p = new B();
        B b = (B)p;
        C c = (C)p;
    }
}
class P{}
class B extends P{}
class C extends P{}
