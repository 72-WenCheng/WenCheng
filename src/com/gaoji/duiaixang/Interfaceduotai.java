package com.gaoji.duiaixang;

/**
 * 接口多态特征：
 * (InterfaceUsb interfaceUsb)可以接收类的对象实例
 * 多态参数
 * 多态数组
 * 多态传递
 */
public class Interfaceduotai {
    public static void main(String[] args) {
        IF if01 = new Monster();
        IF if02 = new Car();

        IP ip = new Teachar();
        IH ih = new Teachar();

        PF[] pfarr = new PF[2];
        pfarr[0] = new Phone();
        pfarr[1] = new Camera();
        for (int i = 0; i < pfarr.length; i++) {
            pfarr[i].work();
            if (pfarr[i] instanceof Phone){
                ((Phone) pfarr[i]).call();
            }
        }
    }
}

//多态参数
interface IF{}
class Monster implements IF{}
class Car implements IF{}
//多态传递
interface IH{}
interface IP extends IH{}
class Teachar implements IP{}

//多态数组
interface PF{
    public void work();
}

class Phone implements PF{
    public void call(){
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机在工作中");
    }
}

class Camera implements PF{
    @Override
    public void work() {
        System.out.println("相机在工作中");
    }
}

