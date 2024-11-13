package com.OOP.duixiang.Extends;

public class PC extends Computer {
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String print(){
        return getDetails()+"\n"+"brand："+brand;
    }
}
