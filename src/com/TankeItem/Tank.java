package com.TankeItem;

/**
 * @author 彭文成
 * @version 1.0
 */
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标
    private int direction;//移动方向
    public static final int speed = 10;
    boolean isLive = true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    //上下左右
    public void moveUP(){
        y -= speed;
    }

    public void moveRight(){
        x += speed;
    }

    public void moveDown(){
        y += speed;
    }

    public void moveLeft(){
        x -= speed;
    }
}
