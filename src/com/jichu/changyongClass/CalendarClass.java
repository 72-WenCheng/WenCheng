package com.jichu.changyongClass;

import java.util.Calendar;

/**
 * @author 彭文成
 * @version 1.0
 * Calendar第二代日期类
 * 作为抽象类，它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR等
 * 日历字符之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法
 * 特征：
 * 是一个抽象类，并且构造器是private
 * 可以通过getInstance()来获取实例
 * 提供大量的方法和字段
 * 无专门格式化的方法，需要自己组合字段
 */
public class CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("c="+c);
        //获取日历对象的某个字段
        System.out.println("年="+c.get(Calendar.YEAR));
        System.out.println("月="+(c.get(Calendar.MONTH)+1));//按照0开始编号
        System.out.println("日="+c.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时="+c.get(Calendar.HOUR));
        System.out.println("时="+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分="+c.get(Calendar.MINUTE));
        System.out.println("秒="+c.get(Calendar.SECOND));
    }
}
