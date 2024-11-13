package com.jichu.changyongClass;

import java.util.Scanner;

/**
 * @author 彭文成
 * @version 1.0
 * 异常处理最佳实践
 */
public class Exceptionsty05 {
    public static void main(String[] args) {
        //如果用户输入的不是一个整数，就提示它反复输入，直到输入一个整数为止
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true){
            System.out.println("请输入一个整数：");
            int num;
            name = scanner.next();
            try {
                num = Integer.parseInt(name);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数！");
            } finally {
            }
        }
    }
}
