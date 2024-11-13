package com.jichu.changyongClass;

import java.math.BigDecimal;

/**
 * @author 彭文成
 * @version 1.0
 */
public class BigDecimalClass {
    public static void main(String[] args) {
        double d = 1999.9999999999999999999999999999999999999999999999999999;
        System.out.println(d);

        BigDecimal bigDecimal01 = new BigDecimal("1999.9999999999999999999999999999999999999999999999999999");
        BigDecimal bigDecimal02 = new BigDecimal("1999.9999999999999999999999999999999999999999999999999999");
        System.out.println(bigDecimal01.add(bigDecimal02));
        System.out.println(bigDecimal01.subtract(bigDecimal02));
        System.out.println(bigDecimal01.multiply(bigDecimal02));
        System.out.println(bigDecimal01.divide(bigDecimal02));
        //保留精度
        System.out.println(bigDecimal01.divide(bigDecimal02, BigDecimal.ROUND_CEILING));
    }
}
