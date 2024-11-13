package com.jichu.fanxing;

/**
 * @author 彭文成
 * @version 1.0
 * 自定义泛型
 * 修饰符<T, R> 返回类型 方法名(参数列表){}
 * 泛型方法，可以定义在普通类中，也可以定义在泛型类
 * 当泛型方法被调用时，类型确定
 * public void eat(E e){}属于使用了泛型
 */
public class generic06 {
    public void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100000);
        car.fly(100000, "宝马");
        Fish<Object, Object> objectObjectFish = new Fish<>();
        objectObjectFish.eat("小鱼", "吃鱼");

    }
}
class Car{
    public void run(){}

    public<T, R> void fly(T t, R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<B, D>{
    public<O, P> void eat(O o, P p){
        System.out.println(o.getClass());
        System.out.println(p.getClass());
    }

    public void hi(B b){}//使用了泛型
    public<D> void hello(D d){}//泛型方法，可以使用泛型类的类型，也可以自己定义
}
