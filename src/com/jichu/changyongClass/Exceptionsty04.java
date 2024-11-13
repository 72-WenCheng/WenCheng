package com.jichu.changyongClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 彭文成
 * @version 1.0
 * 对于异常处理
 * try-catch-finally：
 * 对于捕获发生的异常，自行处理
 * 细节：
 * 如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch
 * 如果异常没有发生，则顺序执行try的代码块，不会进入到catch
 * 如果希望无论是否发生异常，都执行某语句（例如关闭连接、释放资源等）
 * 使用finally
 * throws：
 * 将发生的异常抛出，交给调用者（方法）或调用者的父类来处理
 * 最顶级的处理者就是JVM
 * 细节：
 * 对于编译异常，程序必须处理
 * 对于运行时异常，程序中没有处理的语句，默认throws，抛出异常给JVM
 * 继承的异常规定，子类所抛出的异常类型要么和父类抛出的一致，要么是其子类
 * 自定义异常：
 * 错误信息并没有在Throwable子类中描述处理，可自行设计异常类
 * 定义异常类名继承Exception或者RuntimeException
 * throws与throw区别：
 * throws异常处理的一种方式，在声明处，并定义异常类型
 * throw手动生成异常对象的关键字，在方法体，并定义对象
 */
public class Exceptionsty04 {
    public static void main(String[] args) {
        try {
            String str = "文成";
            int a =Integer.parseInt(str);
            System.out.println("转化数字："+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息："+e.getMessage());
        } finally {
            System.out.println("释放资源...");
        }
        System.out.println("程序继续...");

        int age = 180;
        if (!(age >=18 && age <= 120)){
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄正确");
    }

//    public void a1() {
//        FileInputStream fis = new FileInputStream("d://SSM.txt");
//    }

    public void f1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://SSM.txt");
    }

    public void f2() throws Exception {
        FileInputStream fis = new FileInputStream("d://SSM.txt");
    }

    public void f3() throws FileNotFoundException,NumberFormatException {
        FileInputStream fis = new FileInputStream("d://SSM.txt");
    }

    public static void f4(){
        f5();
    }

    public static void f5() throws ArithmeticException{

    }
}

class Father01{
    public void method() throws RuntimeException{

    }
}

class Son01{
    public void method() throws NumberFormatException{

    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}

