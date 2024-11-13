package com.mvc.model;

/**
 * House的对象表示一个房屋信息
 */
public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String sate;

    public House(int id, String name, String phone, String address, int rent, String sate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.sate = sate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getSate() {
        return sate;
    }

    public void setSate(String sate) {
        this.sate = sate;
    }

    //输出对象信息，使用toString
    @Override
    public String toString() {
        return id +
                "\t" + name +
                "\t" + phone +
                "\t" + address +
                "\t" + rent +
                "\t" + sate;
    }
}
