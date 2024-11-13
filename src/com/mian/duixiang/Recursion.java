package com.mian.duixiang;

import java.util.Scanner;

/**
 * 方法递归调用
 * 方法自己调用自己，每次调用时传入不同的变量
 * 有助于编程者解决复制问题，同时可以让代码变得简洁
 * 例如8皇后问题、汉偌塔，阶乘问题、迷宫问题、球和篮子
 * 算法题：快排、归并排序、二分查找、分治算法
 * 使用栈解决（栈的原理就是先进后出,每一个栈都要执行完）
 * 递归规则：
 * 执行一个方法时，创建一个新的受保护的独立空间（）栈空间
 * 方法的局部变量是独立的，不会相互影响
 * 如果方法中使用的是引用类型变量，就会共享该引用类型的数据
 * 递归必须向退出递归的条件逼近，否则就是无限递归
 * 当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果放回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕
 */
public class Recursion {
    public static void main(String[] args) {
        //打印问题
        T t1 = new T();
        t1.test(4);

        //阶乘问题
        D d1 = new D();
        int res = d1.factorial(5);
        System.out.println("res="+res);

        //斐波那契数1,1,2,3,5,8,13 定义n求值
        X x1 = new X();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要询问那一位数对应的斐波那契数：");
        int tre = scanner.nextInt();
        System.out.println("斐波那契数：" + x1.fibonacci(tre));

        //猴子吃桃问题
        Br br = new Br();
        System.out.println("请输入你需要询问哪一天有多少个桃子：");
        int day = scanner.nextInt();
        int peachNum = br.peach(day);
        System.out.println("第"+day+"天有"+br.peach(day)+"个桃子");
    }
}

//打印问题
class T{
    public void test(int n){
        if (n > 2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
}

//阶乘问题
class D{
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
}

//斐波那契数1,1,2,3,5,8,13 定义n求值
class X {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else {
            System.out.println("输入有误");
            return -1;
        }
    }
}

//猴子吃桃问题：有若干个桃子，猴子第一天吃其中的一半，并再吃一个
//往后的每一天都是这样的吃法，到第十天只有一个了
//求有多少个桃子
//思路：逆推
//day=10;tao=1
//day=9;tao=(day10+1)*2
//得出规律：前一天的桃子=(后一天的桃子+1)*2
//递归问题
class Br{
    public int peach(int day){
        if (day == 10){
            return 1;
        }else if(day>=1 && day <=9){
            return (peach(day+1)+1) * 2;
        }else {
            System.out.println("输入有误");
            return -1;
        }
    }
}
