package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 输入：Peng wen Cheng
 * 输出：Cheng,Peng,W
 */
public class zuoye03 {
    public static void main(String[] args) {
        String name = "Peng wen Cheng";
        printName(name);
    }

    public static void printName(String str){
        if (str == null){
            System.out.println("不能为空");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3){
            System.out.println("格式不正确");
            return;
        }

        String format = String.format("%s,%s,%s",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}