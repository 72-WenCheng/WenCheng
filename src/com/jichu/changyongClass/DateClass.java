package com.jichu.changyongClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 彭文成
 * @version 1.0
 * Date第一代日期类
 * 精确到毫秒，代表特定的瞬间
 * SimpleDateFormat：格式和解析日期的类
 * 允许进行格式化（日期--文本）
 * 解析（文本--日期）
 * Date d1 = new Date();获取当前系统时间，默认国外系统时间格式
 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
 * String format = sdf.format(d1);//将日期格式转换成指定格式的字符串
 * 可以把格式化的字符串转换对应的Date
 * String s = "1996年01月01日 10:20:30 星期一";
 * Date parse = sdf.parse(s);
 * System.out.println(sdf.format(parse));
 */
public class DateClass {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);//获取当前系统时间

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
        String format = sdf.format(d1);//将日期格式转换成指定格式的字符串
        System.out.println(format);

        //可以把格式化的字符串转换对应的Date
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(sdf.format(parse));
    }
}
