package com.OOP.duixiang.Extends;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){
        return "cpu："+cpu+"\n"+"memorsy："+memory+"\n"+"disk："+disk;
    }
}
