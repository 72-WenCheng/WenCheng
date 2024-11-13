package com.mvc.service;
/**
 * 使用数组存储数据
 */

import com.mvc.model.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 0;//记录当前有多少个房源信息
    private int idcounter = 0;//id自增
//定义房源数量
    public HouseService(int size) {
        houses = new House[size];
    }
//显示房源
    public House[] list(){
        return houses;
    }
//新增
    public boolean add(House newHouse){
        if (houseNum == houses.length){
            System.out.println("数组已满");
            return false;
        }
        houses[houseNum++] = newHouse;
        newHouse.setId(++idcounter);
        return true;
    }
//删除
    public boolean del(int delId){
        //查找删除id对应的下标
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index ==  -1){
            return false;
        }
        //删除数组元素
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }
    //查找
    public House findById(int findId){
        for (int i = 0; i < houseNum; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
