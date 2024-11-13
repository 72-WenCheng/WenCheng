package com.mvc.view;

import com.mvc.model.House;
import com.mvc.service.HouseService;
import com.mvc.utils.Utility;

/**
 * 显示初始菜单界面
 * 接收用户输入选择功能
 * 调用HouseService完成相应操作
 * 完成退出系统
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(3);
    //主菜单方法
    public void mianMenu(){
        do {
            System.out.println("------房屋出租系统-----");
            System.out.println("\t1.新增房源");
            System.out.println("\t2.查找房屋");
            System.out.println("\t3.删除房屋信息");
            System.out.println("\t4.修改房屋信息");
            System.out.println("\t5.显示房屋信息");
            System.out.println("\t6.退出系统");
            System.out.println("请输入编号（1-6）");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("/新增");
                    this.addHouse();
                    break;
                case '2':
                    System.out.println("/查找");
                    this.findHouse();
                    break;
                case '3':
                    System.out.println("/删除");
                    this.delHouse();
                    break;
                case '4':
                    System.out.println("/修改");
                    this.update();
                    break;
                case '5':
                    System.out.println("/显示");
                    this.listHouses();
                    break;
                case '6':
                    System.out.println("/退出");
                    break;
            }
        }while (loop);
    }
    //显示方法
    public void listHouses(){
        System.out.println("------------------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态\t");
        House[] list = houseService.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null){
                break;
            }
            System.out.println(list[i]);
        }
    }
    //增加
    public void addHouse(){
        System.out.println("------------------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String ress = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, ress, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    //删除
    public void delHouse(){
        System.out.println("请选择删除的房屋编号id（-1退出）");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("退出删除");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("删除成功");
            }else {
                System.out.println("没有该房源");
            }
        }else {
            System.out.println("放弃删除");
        }
    }
    //查找
    public void findHouse(){
        System.out.println("请输入你要查找房源的id");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("不存在");
        }
    }
    //修改
    public void update(){
        System.out.println("请输出待修改房屋的编号id");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("放弃修改");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("房源不存在");
            return;
        }
        System.out.println("姓名（"+house.getName()+"）:");
        String name = Utility.readString(8,"");
        if(" ".equals(name)){
            house.setName(name);
        }

        System.out.println("电话（"+house.getPhone()+"）:");
        String phone = Utility.readString(12,"");
        if(" ".equals(phone)){
            house.setPhone(phone);
        }

        System.out.println("地址（"+house.getAddress()+"）:");
        String address = Utility.readString(18,"");
        if(" ".equals(address)){
            house.setAddress(address);
        }

        System.out.println("租金（"+house.getRent()+"）:");
        int rent = Integer.parseInt(Utility.readString(12,""));
        if(" ".equals(rent)){
            house.setRent(rent);
        }

        System.out.println("状态（"+house.getSate()+"）:");
        String sate = Utility.readString(12,"");
        if(" ".equals(sate)){
            house.setSate(sate);
        }
    }
}
