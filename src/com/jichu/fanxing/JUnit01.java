package com.jichu.fanxing;

import org.junit.Test;

/**
 * @author 彭文成
 * @version 1.0
 * 单元测试
 * @Test
 * 一个类有很多代码需要测试，为了测试，就需要写入到main方法中
 * 如果有多个功能代码测试，就需要来回注释，切换很麻烦
 * 如果可以直接运行一个方法，就方便很多，并且给出相关信息
 */
public class JUnit01 {
    public static void main(String[] args) {
//        new JUnit01().m1();
//        new JUnit01().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1()被调用");
    }

    @Test
    public void m2(){
        System.out.println("m2()被调用");
    }
}
