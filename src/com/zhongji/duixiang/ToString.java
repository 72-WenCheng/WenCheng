package com.zhongji.duixiang;

/**
 * toString
 * 默认返回：全类名+@哈希值的十六进制
 * 子类重写toString方法，用于返回对象的属性信息
 * 重写toStrong，打印对象或拼接对象时，都会自动调用该对象的toString形式
 * 当直接输出一个对象时，toString方法会被默认的调用
 */
public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString());
        System.out.println(monster);
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写
//    @Override
//    public String toString() {
//        return "Monster{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                ", sal=" + sal +
//                '}';
//    }
}