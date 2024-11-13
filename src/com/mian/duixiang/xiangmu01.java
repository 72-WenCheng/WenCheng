package com.mian.duixiang;

import java.util.Random;

/**
 * 迷宫问题
 * 路线的方式可以定义：下右上左等等
 * 测试回溯现象
 * 如何求出最短路径
 */
public class xiangmu01 {
    public static void main(String[] args) {
        //思路：
        //创建迷宫，用二维数组，定义8*7方块图形 int[][] map = new int[8][7]
        //规定map数组的元素值：0表示可以走，1表示障碍物
        int[][] map = new int[8][7];
        //将上下两行设置为障碍物
        for (int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将左右两行设置为障碍物
        for (int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置map[3][1]和设置map[3][2]也为障碍物
//        map[3][1] = 1;
//        map[3][2] = 1;
        //设置生成1-4个随机障碍物
        Random random = new Random();
        int ar = random.nextInt(2);
        int ar3 = random.nextInt(4)+1;
        System.out.println(ar3);
        int q = 1;
        while (q<=ar3){
            int ar1 = random.nextInt(6)+1;
            int ar2 = random.nextInt(5)+1;
            if (ar1 != 1 || ar2 != 1){
                map[ar1][ar2] = ar;
            }
            q++;
        }
//        while (i<)
        //输出当前地图
        System.out.println("=====当前地图情况=====");
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }

        Hr hr = new Hr();
        hr.findWay(map,1,1);
        System.out.println("\n====路径情况如下====");
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

class Hr{
    //使用递归回溯的思想来解决迷宫
    //findWay就是找出迷宫的路径
    //如果找到就返回true，否则false
    //i,j代表二维坐标，初始位置(1,1)
    //规定map数组各个值的含义
    //0表示可以走通，1表示障碍物，2表示是否真的可以走通，3表示走过但是走不通
    //当map[6][5] = 2说明找到终点，结束游戏
    //定义探测路线的方式：下右上左等等
    public boolean findWay(int[][] map, int i, int j){
        if (map[6][5] == 2){
            return true;
        }else{
            if (map[i][j] == 0){
                //假设可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下右上左
                if(findWay(map,i+1,j)){
                    return true;
                }else if (findWay(map,i,j+1)){
                    return true;
                }else if (findWay(map,i-1,j)){
                    return true;
                }else if (findWay(map,i,j-1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
