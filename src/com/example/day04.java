package com.example;

/**
 * 数据类型；在内存中分配不同大小的空间（字节）
 * 基本数据类型：
 * 数值型byte1字节 short2字节 int4字节 long8字节
 * 字符型char单字符
 * 布尔型boolean ture或false
 * 浮点型float单精度 双精度double
 * 引用数据类型：
 * 类class
 * 接口interface
 * 数组【】
 */
public class day04 {
    //具有存放的范围，与二进制有关
    byte a = 1;
    short b = 1;
    int c = 1;
    long d = 1;
    //java的整型常量默认为int，声明long常量须后加’l‘ ’L‘
    //int n = 1l;（不可行，除强转）
    long n = 1l;
    //计算机最小存储单位bit byte=8bit

    //浮点数在机器中存放形式=符号位+指数位+尾数位
    //尾数部分可能丢失，造成精度损失（小数都是近似值）
    //浮点型默认是double，声明float，需后加’f‘ ’F‘
    //float num1 = 1.1F; 会造成精度丢失
    //表示方法两种：十进制、科学技术法5.12e2（5.12*10的2次方） 5.12E-2（5.12/10的2次方）
    float num2 = 1.1F;
    double num3 = 1.1;
    double num4 = 1.1f;
    double num5 = 0.1;
    double num6 = .1;
    double num7 = 5.12e2;

    public static void main(String[] args) {
        double num8 = 2.1234567891;
        float num9 = 2.1234567891F;
        System.out.println(num8);
        System.out.println(num9);

        //浮点数使用陷阱,以精度返回值
        double num10 = 2.7;
        double num12 = 8.1/3;
        System.out.println(num10);
        System.out.println(num12);
        //对运算结果是小数的比较要小心，要以两个数的差值的绝对值，在某个精度范围内判断
        if(num8==num9){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }

        if (Math.abs(num8 - num9)<0.001){
            System.out.println("差值很小，认为相等");
        }

        //字符类型可以直接存放一个数字,会输出代表97的字母
        //char本质是一个整数，在输出时，是unicode码对应的字符,具体查看编码表ASCII
        char c1 = 97;
        char c2 = 'a';
        char c3 = '\t';
        char c4 = '成';
        char c5 = 25991;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println((int)c4);
        System.out.println(c5);
        System.out.println('a'+100);

        //判断成绩是否通过案例
        boolean isPass = true;
        if (isPass == true){
            System.out.println("考试通过");
        }else {
            System.out.println("考试失败");
        }
    }
}
