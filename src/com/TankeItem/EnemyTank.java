package com.TankeItem;

import java.util.Vector;

/**
 * @author 彭文成
 * @version 1.0
 */
public class EnemyTank extends Tank implements Runnable{
    public EnemyTank(int x, int y){
        super(x,y);
    }

    //敌方坦克使用Vector保存多个Shot
    Vector<Shot> shots = new Vector<>();

    //生命属性
    public boolean isLive = true;

    @Override
    public void run() {
        while (true){
            //敌方发射多颗子弹
            if (isLive && shots.size() < 10){
                Shot s = null;
                switch (getDirection()){
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                }
                shots.add(s);
                new Thread(s).start();
            }

            switch (getDirection()){
                case 0:
                    //保持一个方向多走几步
                    for (int i = 0; i < 30; i++) {
                        if (getY() >0){
                            moveUP();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 100 < 1000){
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 120 < 750){
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0){
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }
            //随机改变坦克方向
            setDirection((int)(Math.random() * 4));
//            setDirection(3);
            //多线程一定要定义销毁
            if (!isLive){
                break;
            }
        }
    }
}
