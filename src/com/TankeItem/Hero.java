package com.TankeItem;

import java.util.Vector;

/**
 * @author 彭文成
 * @version 1.0
 */
public class Hero extends Tank{
    public Hero(int x, int y){
        super(x,y);
    }

    //定义一个Shot对象
    Shot shot = null;

    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    //射击，以坦克位置、方向来创建Shot对象
    public void shotEnemyTank(){

        //控制发射数
        if (shots.size() == 5){
            return;
        }

        switch (getDirection()){//得到Hero坦克方向
            case 0:
                shot = new Shot(getX()+20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX()+60, getY()+20, 1);
                break;
            case 2:
                shot = new Shot(getX()+20, getY()+60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY()+20, 3);
                break;
        }

        //加入集合
        shots.add(shot);

        //启动子弹线程
        new Thread(shot).start();
    }
}
