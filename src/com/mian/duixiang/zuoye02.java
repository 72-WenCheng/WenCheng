package com.mian.duixiang;

/**
 * 克隆对象
 */
public class zuoye02 {
    //编写类MyToolse类，定义方法可以打印二维数组
    //编写方法copyOerson，可以复制一个Presonse对象，返回复制的对象
    //注意新对象和原来的对象是两个独立的对象，属性相同
    public static void main(String[] args) {
        Personse p = new Personse();
        p.name = "米兰";
        p.age = 18;
        MyToolse myToolse = new MyToolse();
        Personse p2 = myToolse.copy(p);
        //p 和 p2 是两个独立的Personse类实例对象
        System.out.println("p的属性"+"\n"+p.name+" "+p.age);
        System.out.println("p2的属性"+"\n"+p2.name+" "+p2.age);
    }
}

class Personse{
    String name;
    int age;
}
class MyToolse{
    public Personse copy(Personse p){
        //创建一个新对象
        Personse p2 = new Personse();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}