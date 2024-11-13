package com.jichu.fanxing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * @author 彭文成
 * @version 1.0
 */
@SuppressWarnings("all")
public class generic03 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",18000,new MyDate(2003,02,06)));
        employees.add(new Employee("date",19000,new MyDate(2003,03,12)));
        System.out.println("employees="+employees);
        System.out.println("---排序---");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                if (!(em1 instanceof Employee && em2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }

                int i = em1.getName().compareTo(em2.getName());
                if (i != 0){
                    return i;
                }
                return em1.getBirthday().compareTo(em2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }

        int moth = month - o.getMonth();
        if (moth != 0){
            return moth;
        }
        return day - o.getDay();
    }
}
