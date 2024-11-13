package com.OOP.duixiang;

public class zuoye01 {
    public static void main(String[] args) {
        double d = 13.4;
        long i = (long)d;
        System.out.println(i);

        //编译错误
//        int in = 5;
//        boolean b = (boolean)in;

        //向上转型
        Object obj = "Hello";

        //向下转型
        String objStr = (String)obj;
        System.out.println(objStr);

        //编译错误
        Object objPri = new Integer(5);
        String str = (String)objPri;

        //编译成功
        Integer str1 = (Integer)objPri;
    }
}
