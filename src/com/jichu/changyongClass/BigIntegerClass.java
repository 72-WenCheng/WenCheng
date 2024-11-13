package com.jichu.changyongClass;

import java.math.BigInteger;

/**
 * @author 彭文成
 * @version 1.0
 * BigInteger
 * add加
 * subtract减
 * multiply乘
 * divide除
 */
public class BigIntegerClass {
    public static void main(String[] args) {
//        long l = 123545654556156;
        BigInteger bigInteger01 = new BigInteger("14561565656565656565656565656565656565656");
        BigInteger bigInteger02 = new BigInteger("14561565656565656565656565656565656565656");
        System.out.println(bigInteger01);

        BigInteger add = bigInteger01.add(bigInteger02);
        BigInteger subtract = bigInteger01.subtract(bigInteger02);
        BigInteger multiply = bigInteger01.multiply(bigInteger02);
        BigInteger divide = bigInteger01.divide(bigInteger02);
    }
}
