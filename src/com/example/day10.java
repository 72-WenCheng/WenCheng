package com.example;
import java.util.Scanner;

/**
 * 键盘输入语句
 * 在编程中，需要接收用户输入的数据，就可以使用该语句获取
 * 需要一个扫描器Scanner
 */
public class day10 {
    public static void main(String[] args) {
        //演示接受用户输入
        //引入Scanner类
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        //接受用户输入
        System.out.println("请输入文字：");
        String name = scanner.next();
        System.out.println(name);
    }
}
