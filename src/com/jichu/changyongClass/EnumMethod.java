package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * Enum成员方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season02 autumn = Season02.AUTUMN02;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season02[] values = Season02.values();
        for(Season02 season02: values){
            System.out.println(season02);
        }
        Season02 autumn01 = Season02.valueOf("AUTUMN02");
        System.out.println(autumn01==autumn);
        System.out.println(Season02.AUTUMN02.compareTo(Season02.SUMMER02));
    }
}
