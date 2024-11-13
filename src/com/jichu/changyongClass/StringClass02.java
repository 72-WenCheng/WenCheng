package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * StringBuffer
 * 代表可变的字符序列，可以对字符串内容进行增删
 * 大多方法与String相同，但StringBuffer是可变长度的
 * 是一个容器
 * 继承AbstractStringBuilder，具有属性char[] value，没有final修饰
 * 该value数组存放字符串内容，存放在堆中，如变化不是每次创建新对象，效率高于String
 * 实现Serializable接口，对象可以串行化（网路传递、保存文件）
 * StringBuffer有final修饰，不能被继承
 * StringBuffer构造器
 * StringBuffer与String转换
 * StringBuffer常见方法：
 * 增append、删delete(start,end)、改replace(start,end,string)
 * 查找字符在字符串第一次出现的索引indexOf
 * 插insert、获取长度length
 * StringBuilder结构分析
 * 方法与StringBuffer一致
 * 可以串行化、不能被继承、存放在堆中、方法没有做互斥处理（synchronized）
 * 单线程使用
 * 效率：StringBuilder>StringBuffer。String
 * 三者使用原则：
 * 如果字符串存在大量修改，一般使用StringBuffer或String
 * 如果字符串存在大量修改，并在单线程情况，一般使用StringBuilder
 * 如果字符串存在大量修改，并在多线程情况，一般使用StringBuffer
 * 如果字符串存在少量修改，被多个对象引用情况，一般使用String
 */
public class StringClass02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer01 = new StringBuffer();

        StringBuffer stringBuffer02 = new StringBuffer(100);

        StringBuffer stringBuffer03 = new StringBuffer("hello");

        String str = "hello";

        StringBuffer stringBuffer04 = new StringBuffer(str);

        StringBuffer stringBuffer05 = new StringBuffer();
        StringBuffer append = stringBuffer05.append(str);

        StringBuffer stringBuffer06 = new StringBuffer("string");

        String s = stringBuffer06.toString();
        String sr = new String(stringBuffer06);

        StringBuffer src = new StringBuffer("he");
        src.append(',');
        src.append("llo").append(100).append(true).append(10.5);
        System.out.println(src);
        src.delete(3,5);
        System.out.println(src);
        src.replace(1,2,"wa");
        System.out.println(src);
        int index = src.indexOf("wa");
        System.out.println(src);
        src.insert(9,"we");
        System.out.println(src);

        String s1 = null;
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        System.out.println(s1);
        StringBuffer sv = new StringBuffer(s1);
        System.out.println(sv);
    }
}
