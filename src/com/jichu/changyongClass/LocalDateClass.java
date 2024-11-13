package com.jichu.changyongClass;

import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author 彭文成
 * @version 1.0
 * Local第三代日期类
 * LocalDate获取日期/年月日
 * LocalTime获取时间/时分秒
 * LocalDateTime年月日时分秒
 * LocalDateTime ldt = LocalDateTime.now();
 * DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
 * String format = dateTimeFormatter.format(ldt);
 * System.out.println(format);
 */
public class LocalDateClass {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年="+ldt.getYear());
        System.out.println("月="+ldt.getMonth());
        System.out.println("月="+ldt.getMonthValue());
        System.out.println("日="+ldt.getDayOfMonth());
        System.out.println("时="+ldt.getHour());
        System.out.println("分="+ldt.getMinute());
        System.out.println("秒="+ldt.getSecond());

        //格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);
    }
}
