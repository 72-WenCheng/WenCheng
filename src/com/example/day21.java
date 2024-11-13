package com.example;

/**
 * 排序
 * 将一群数据，依指定的顺序进行排列的过程
 * 内部排序法
 * 指将需要处理的所有数据都加载到内部存储器中进行排序，包括（
 * 交换式排序法、选择式排序法和插入式排序法）
 * 外部排序法
 * 数据量过大，无法全部加载到内存中，需要借助外部存储进行排序，包括（
 * 合并排序法、直接合并排序法）
 * 冒泡排序：通过对待排序序列从后向前（从索引较大的元素开始），
 * 依次比较相邻元素的值，若发现逆序则交换，使值较大的元素
 * 逐渐从前移向后部
 */
public class day21 {
    public static void main(String[] args) {
        //无序序列：23，12，85，1，3
        //使用冒泡排序思路
//         int[] arr = {23,12,85,1,3};
           //第一轮比较
//         //进行了4次排序
//         for (int j = 0; j < 4; j++){
//             //第一轮比较，前面数>后面数就交换
//             //定义int temp = 0; 用于辅助交换
//             int temp = 0;
//             if (arr[j] > arr[j+1]){
//                 temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//        System.out.println("第一轮比较");
//         for (int j = 0; j < arr.length; j++){
//             System.out.println(arr[j]);
//         }

        //第二轮比较
        //进行了3次排序
//        for (int j = 0; j < 3; j++){
//            //第一轮比较，前面数>后面数就交换
//            //定义int temp = 0; 用于辅助交换
//            int temp = 0;
//            if (arr[j] > arr[j+1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        System.out.println("第二轮比较");
//        for (int j = 0; j < arr.length; j++){
//            System.out.println(arr[j]);
//        }

        //以此类推
        //再加一个外层循环
        int[] arr = {23,12,85,1,3};
        for (int i = 0; i <= arr.length-1; i++){
            for (int j = 0; j < 4-i; j++){
                    int temp = 0;
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        for (int j = 0; j < arr.length; j++){
            System.out.print("冒泡排序成功："+arr[j]);
        }
    }
}
