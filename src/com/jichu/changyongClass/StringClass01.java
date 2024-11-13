package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * String类
 * 用于保存字符串，也就是一组字符序列
 * 字符串常量对象是用双引号括起的字符序列
 * 使用Unicode字节编码，一个字符（不区分字母还是汉字）占两个字节
 * String类常用构造方法：
 * String s1 = new String();
 * String s2 = new String(String original);
 * String s3 = new String(char[] a);
 * String s1 = new String(char[] a int startIndex,int count);
 * 实现了接口Serializable，得以串行化
 * 实现了接口Comparable，得以比较对象大小
 * String是final类，不能被继承
 * String有属性private final char value[] 用于存放字符串内容，地址不可修改
 * 创建String对象的两种方式：
 * String s = "文成";
 * String s = new String("文成");
 * String的特性：
 * String是一个final类，代表不可变的字符序列
 * 字符串是不可变的，一个字符串对象一旦被分配，其内容是不可变的
 * String常用方法
 * String类是保存字符串常量的，每次更新都需要重新开辟空间，效率低，因此java设计者提供了
 * StringBuilder和StringBuffer来增强String的功能
 */
public class StringClass01 {
    public static void main(String[] args) {
        final char value[] = {'a','b'};
        value[0] = 'c';
        char[] v2 = {'t','y'};
//        value = v2;

        String s1 = "文成";
        String s2 = new String("文成");

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        String c = "pwc";
        String v = new String("pwc");
        System.out.println(c.equals(v));
        System.out.println(c == v);
        System.out.println(c == v.intern());
        System.out.println(v == v.intern());

        String s3 = "java";
        String s4 = "pwc";
        String s5 = "pwc";
        String s6 = new String("pwc");
        System.out.println(s4 == s6);
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s6));
        System.out.println(s3 == s4);

        Prty p1 = new Prty();
        p1.name = "wc";
        Prty p2 = new Prty();
        p2.name = "wc";
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "wc");

        String d1 = new String("abcd");
        String d2 = new String("abcd");
        System.out.println(d1 == d2);

        //创建了两个对象，改变指向
        String n1 = "hello";
        n1 = "haha";
        System.out.println(n1);

        String f = "hello"+"abc";//创建了一个对象

        //三个对象
        String j = "hello";
        String h = "abc";
        String z = j+h;
        System.out.println(z);

        String x1 = "oop";
        String x2 = "ccd";
        String x3 = "edg";
        String x4 = (x1+x2).intern();
        System.out.println(x3 == x4);
        System.out.println(x3.equals(x4));

        Test ex = new Test();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);

        String g = new String("");
        for (int i = 0; i < 1000; i++) {
            g += "hello";
        }
    }
}

class Prty{
    String name;

    public String getName() {
        return name;
    }
}

class Test{
    String str = new String("pwc");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str = "java";
        ch[0] = 'h';
    }
}
