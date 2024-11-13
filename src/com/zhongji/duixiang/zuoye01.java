package com.zhongji.duixiang;

/**
 * 如何重写equals方法
 */
public class zuoye01 {
    public static void main(String[] args) {
        Per per1 = new Per("wc",18,'t');
        Per per2 = new Per("wc",18,'t');
        //继承object，使用的是它的方法判断地址是否相等，需要重写
        System.out.println(per1.equals(per2));
    }
}
class Per{
    private String name;
    private int age;
    private char gemder;

    public Per(String name, int age, char gemder) {
        this.name = name;
        this.age = age;
        this.gemder = gemder;
    }

    //重写object的equals方法
    public boolean equals(Object obj){
        //如果是相同对象，值相等
        if (this == obj) {
            return true;
        }
        //判断是否为该对象
        if (obj instanceof Per){
            Per p = (Per)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gemder == p.gemder;
        }else {
            return false;
        }
    }
}