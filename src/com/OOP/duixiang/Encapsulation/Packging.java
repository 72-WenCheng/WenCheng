package com.OOP.duixiang.Encapsulation;

/**
 * 面向对象三大特征：封装、继承、多态
 * 封装：
 * 就是把抽象的数据【属性】和对数据的操作方【方法】封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作【方法】，才能对数据进行操作
 * 隐藏实现的细节
 * 可以对数据进行验证，保证安全合理
 * 实现步骤：
 * 将属性私有化private
 * 提供一个公共的set方法，用于对属性判断并赋值
 *     public void setxxx(形参){
 *         //加入数据验证的业务逻辑
 *         属性=参数名（用this关键字）
 *     }
 * 提供一个公共的get方法，用于获取属性的值
 *     public xx getxxx(){
 *         //用于权限判断
 *         return xx;
 *     }
 */
public class Packging {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackjackjack");
        person.setAge(2000);
        person.setSalary(30000);
        System.out.println(person.info());
    }
}
class Person{
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("名字过长！");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1 && age<=150){
            this.age = age;
        }else {
            System.out.println("年龄需要在1-150！使用默认年龄");
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以添加权限判断工资是否可以查看
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //打印信息
    public String info(){
        return "---信息为---"+"\n"+"名字："+name+"\n"+"年龄："+age+"\n"+"薪水："+salary;
    }
}
