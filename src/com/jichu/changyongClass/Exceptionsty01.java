package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 异常
 * 可将代码块选中ctrl+alt+t
 * 开发过程中语法错误和逻辑错误不是异常
 * 异常事件有两类：
 * Error错误，java虚拟机无法解决的严重问题（程序崩溃）
 * Exception其他因编程错误或偶然的外在因素导致的一般性问题，分为运行时异常和编译时异常
 * 例如空指针、访问不存在的文件、网络连接中断等
 * Exception又分为运行时异常和编译时异常
 * 运行时异常，编译器检测不出来，一般指编程时的逻辑错误，是程序员应该避免的出现的异常
 * java.lang.RuntimeException类以及子类都是运行时异常
 * 对于运行时异常，可以不作处理，因为这类异常很普遍，若全处理可能会对程序的可读性和运行效率产生影响
 * 编译时异常，是编译器要求必须处置的异常
 * 异常体系图
 * Throwable所有异常的父类
 */
public class Exceptionsty01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //将代码块选中ctrl+alt+t
        try {
            int res = num1 / num2;//抛出异常ArithmeticExceptionsty
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("异常原因");//输出异常信息
        }
        System.out.println("程序继续运行...");
    }
}
