package com.jichu.changyongClass;

import java.time.Instant;
import java.util.Date;

/**
 * @author 彭文成
 * @version 1.0
 * Instant时间戳
 * 类似于Date，提供一系列和Date类转换的方式
 * Instant now = Instant.now();
 * System.out.println(now);
 * Date date = Date.from(now);
 * System.out.println(date);
 * Instant instant = date.toInstant();
 * System.out.println(instant);
 */
public class InstantClass {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        System.out.println(date);
        Instant instant = date.toInstant();
        System.out.println(instant);
    }
}
