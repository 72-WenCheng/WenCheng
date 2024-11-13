package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        Person p1 = new Person("唐僧",new Hores());
        System.out.println(p1.getName());
        p1.common();
        p1.passRiver();
    }
}

interface Vegicles{
    void work();
}
class Hores implements Vegicles{
    @Override
    public void work() {
        System.out.println("陆地使用马");
    }
}

class Boat implements Vegicles{
    @Override
    public void work() {
        System.out.println("河流使用小船");
    }
}

class VehiclesFactory{
    public static Hores getHores(){
        return new Hores();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}

class Person{
    private String name;
    private Vegicles vegicles;

    public Person(String name, Vegicles vegicles) {
        this.name = name;
        this.vegicles = vegicles;
    }

    public void passRiver(){
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        if (!(vegicles instanceof Boat)){
            vegicles = VehiclesFactory.getBoat();
        }
        vegicles.work();
    }

    public void common(){
//        Hores hores = VehiclesFactory.getHores();
//        hores.work();

        if (!(vegicles instanceof Hores)){
            vegicles = VehiclesFactory.getHores();
        }
        vegicles.work();
    }

    public String getName() {
        return name;
    }
}

