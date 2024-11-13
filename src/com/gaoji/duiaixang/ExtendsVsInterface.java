package com.gaoji.duiaixang;

/**
 * 实现接口/继承类
 * java提供的接口实现机制就是对单继承的补充
 * 接口和继承解决的问题不同：
 * 继承的价值主要在于：解决代码的复用性和可维护性
 * 接口的价值主要在于：设计好各种规范（方法），让其他类实现这些方法
 * 接口比继承更加的灵活：
 * 继承是满足is-a的关系
 * 而接口只需要满足like-a的关系
 * 接口在一定程度上实现代码的解耦
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
    }
}
//猴子
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(getName()+"会爬山...");
    }

    public String getName() {
        return name;
    }
}

class LittleMonkey extends Monkey implements Fish{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习会游泳...");
    }
}

//学习鱼的技能
interface Fish{
    public void swimming();
}