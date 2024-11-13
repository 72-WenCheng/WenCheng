package com.example;

/**
 * 运算符：
 * 算数运算符
 * 赋值运算符
 * 关系运算符
 * 逻辑运算符
 * 位运算符（需要二进制基础）
 * 三元运算符
 */
public class day07 {
    //+正号 -负号 +加 -减 *乘 /除 %取余 ++自增 --自减 +拼接
    public static void main(String[] args) {
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        double d = 10 / 4;
        System.out.println(d);
        //取余的本质 a % b = a - a / b * b，得到的小数是近似值
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);
        //作为独立语句使用前++和后++等价与 i = i + 1
        int i = 1;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        //作为表达式使用，前++先自增后赋值，后++先赋值后自增
        int j = 1;

//        int k = ++j;
//        System.out.println(j);
//        System.out.println(k);

        int h = j++;
        System.out.println(j);
        System.out.println(h);

//        经典题面试题，使用临时变量temp = i i = i + 1 i = temp
//        int i = 1;
//        i = i++;
//        System.out.println(i);

//        int i = 1;
//        i = ++i;
//        System.out.println(i);

//        练习题
//        int i1 = 10;
//        int i2 = 20;
//        System.out.println("i="+i);
//        System.out.println("i2="+i2);
//        i = --i2;
//        System.out.println("i="+i);
//        System.out.println("i2="+i2);

        //假如还有59天放假，还有xx个星期xx天
        //思路分析：
        //定义int days保存天数
        //定义int day = days / 7保存星期
        //定义int da = days % 7保存天
        int days = 59;
        int day = days / 7;
        int da = days % 7;
        System.out.println("假如还有59天放假，还有" + day + "个星期" + da + "天");

        //定义一个变量保存华氏摄氏度，华氏摄氏度转换摄氏温度的公式5/9*（华氏摄氏度-100），请求出华氏摄氏度对应的摄氏温度
        //要考虑java的计算特性5/9 5.0/9
        double wendus = 234.5;
        double wendu;
        wendu = 5.0 / 9 * (wendus - 100);
        System.out.println(wendu);

        //关系运算符结果都是boolean型，通常使用在条件、循环语句中
        //== ！= < > <= >= instanceof检查是否是类的对象
        int a = 9;
        int b = 8;
        boolean flag = a > b;
        System.out.println(flag);


        //逻辑运算符用于连接多个关系表达式，最终结果也是boolean值
        //a&b 逻辑与 a与b同时为true则结果为true，否则为false，后面条件仍执行
        //a&&b 短路与 a与b同时为true则结果为true，否则为false，后面条件仍执行
        //a|b 逻辑或 当a与b有一个为true则结果为true，否则为false，后面条件仍执行
        //a||b 短路或 当a与b有一个为true则结果为true，否则为false，后面条件仍执行
        //!a 取反 当a为true结果为false，当a为false则结果为true
        //a^b 逻辑异或 当a与b不同时结果为true，当a与b相同时结果为false
        int age = 21;
        if (age > 20 && age < 90) {
            System.out.println(age);
        }
        if (age > 20 & ++age < 30) {
            System.out.println(age);
        }

        //基本赋值运算符 int a = 10;
        //复合运算符 a += b等于a = a + b
        //运算顺序从右往左
        //复合赋值运算符会进行类型转换 p = (byte)(p+1)

        //三元运算符
        int q = 10;
        int n = 11;
        int result = q > n ? q++ : n++;
        int result1 = q > n ? (int)1.1 : (int)1.2;
        System.out.println(result);
        System.out.println(result1);
    }
}
