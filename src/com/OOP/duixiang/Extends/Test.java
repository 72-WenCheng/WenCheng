package com.OOP.duixiang.Extends;

public class Test {
    public static void main(String[] args) {
//        Computer computer = new Computer("amdr7-5000",4,8);
//        computer.setCpu("amdr7-5000");
//        computer.setDisk(4);
//        computer.setMemory(8);
//        System.out.println(computer.getDetails());

        PC pc = new PC("amdr7-5000",4,8,"小新");
        System.out.println(pc.print());
    }
}