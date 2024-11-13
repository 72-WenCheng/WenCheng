package com.OOP.duixiang.Polymorphism;

/**
 * 多态数组
 * 数组的定义类型为父类类型,里面保存的实际元素类型为子类类型
 */
public class PloyArray {
    public static void main(String[] args) {
        //父类的引用可以指向子类的对象
        Personser[] personsers = new Personser[5];
        personsers[0] = new Personser("jack",20);
        personsers[1] = new Studentser("mao",18,100);
        personsers[2] = new Studentser("smith",19,200);
        personsers[3] = new Teachar("scott",25,40000);
        personsers[4] = new Teachar("tao",30,100000);

        for (int i = 0; i < personsers.length; i++) {
            System.out.println(personsers[i].say());
            if (personsers[i] instanceof Studentser){
                Studentser studentser = (Studentser)personsers[i];
                studentser.stent();
            }else if(personsers[i] instanceof Teachar){
                Teachar teachar = (Teachar)personsers[i];
                teachar.tent();
            }else if(personsers[i] instanceof Personser){
            }
            System.out.println("---------");
        }
    }
}
