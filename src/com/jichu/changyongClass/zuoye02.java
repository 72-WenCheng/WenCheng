package com.jichu.changyongClass;

import java.util.Scanner;

/**
 * @author 彭文成
 * @version 1.0
 * 输入信息，正确则提示注册成功，否则生成异常对象
 */
public class zuoye02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        System.out.println("请输入邮箱：");
        String email = scanner.next();
        try {
            userRegister(name,pwd,email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email){
        int userLength = name.length();
        if ((userLength >= 2 && userLength <= 4)){
            throw new RuntimeException("用户名长度范围2-4");
        }

        if(!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码长度为6且是数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i>0 && j>1)){
            throw new RuntimeException("邮箱格式不正确");
        }
    }

    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
