package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * Math
 * 包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
 * abs绝对值
 * pow求幂
 * ceil向上取整
 * floor向下取整
 * round四舍五入
 * sqrt求开方
 * random求随机数（0~1之间的随机小数）
 * max、min
 * 计算机特征（前闭后开、就进原则）
 */
public class MathClass {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        double pow = Math.pow(2,4);
        double ceil = Math.ceil(-3.01);
        double floor = Math.floor(-4.99);
        double round = Math.round(4.1);
        double sqrt = Math.sqrt(4.23);
        System.out.println(sqrt);
        double random = Math.random();
        System.out.println(random);

        //求a-b之间的一个随机整数，例如a=2，b=7
        //(int)(a + Math.random() * (b - a + 1))
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2 + Math.random() * (7-2+1)));
        }
    }
}
