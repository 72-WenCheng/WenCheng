package com.mvc.utils;

/**
 * 当方法是static时，就是静态方法，通过类.方法调用
 */
public class TestUtility {
    public static void main(String[] args) {
        //测试类，使用后销毁

        //要求输入一个字符串，长度最大为3
//        String s1 = Utility.readString(3);
//        System.out.println("s="+s1);

        //要求输入一个字符串，长度最大为3，如果用户回车，就给一个默认值
        String s2 = Utility.readString(10,"pwc");
        System.out.println("s2="+s2);
    }
}
