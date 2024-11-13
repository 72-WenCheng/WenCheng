package com.jichu.fanxing;

/**
 * @author 彭文成
 * @version 1.0
 * 自定义泛型
 * class 接口<T,R...>{}
 * 接口中，静态成员不能使用泛型
 * 泛型接口的类型，在继承接口或者实现接口时确定
 * 没有指定类型，默认为Object
 */
public class generic05 {
    public static void main(String[] args) {

    }
}

interface IUsb<U,R>{
    int n = 10;
//    U name; 接口属性中是final static修饰的
    R get(U u);
    void hi(R r);
    void run (R r1, R r2, U u1, U u2);
    //在jdk8中，可以在接口中使用默认方法
    default R method(U u){
        return null;
    }
}

interface Per extends IUsb<String, Double>{

}

class AA implements Per{
//实现Per接口时，Per继承了IUsb，指定U为String，R为Double
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

class BB implements IUsb<Integer, Float>{
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

class CC implements IUsb{//没有定义<>，则为Object
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}
