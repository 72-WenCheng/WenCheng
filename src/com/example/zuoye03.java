package com.example;

public class zuoye03 {
    public static void main(String[] args) {
        //第一题
//        String foo = "blue";
//        boolean[] bar = new boolean[2];
//        if (bar[0]){
//            foo = "grenn";
//        }
//        System.out.println(foo);

        //第二题
//        int num = 1;
//        while (num<10){
//            System.out.println(num);
//            if (num>5){
//                break;
//            }
//            num += 2;
//        }

        //第三题
//        //已知有个升序的数组，要求插入一个元素，该数组的顺序依然是升序
//        //[10,12,45,90]添加23后，[10,12,23,45,90]
//        //定义已有数组
//        int[] arr = {10,12,45,90};
//        //增加加数组的长度是重新定义一个数组
//        int[] myarr = new int[arr.length + 1];
//        //遍历初始数组的值并赋值给新数组
//        for (int i = 0; i < arr.length;i++){
//            myarr[i] = arr[i];
//        }
//        //然后通过冒泡排序法比较添加的值，排序重新得到升序的数组
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你要添加的数：");
//        int num = scanner.nextInt();
//        myarr[myarr.length-1] = num;
//        for (int i = 0; i < myarr.length -1; i++){
//            for (int j = 0; j < myarr.length -1 -i; j++){
//                //定义一个存放最大值的变量
//                int temp = 0;
//                if (myarr[j] > myarr[j+1]){
//                    temp = myarr[j];
//                    myarr[j] = myarr[j+1];
//                    myarr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println("---添加后的数组通过排序后为---");
//        System.out.print("{");
//        for (int i = 0; i < myarr.length; i++){
//            System.out.print(myarr[i]);
//            System.out.print("\t");
//        }
//        System.out.print("}");

        //第四题
        //随机生成10个整数(1-100)保存到数组，并倒序打印，以及求平均值，求最大值以其下标，并查找里面是否有8
        //使用Random类
//        Random random = new Random();
//        //定义最大最小值变量
//        int MAX = 100,MIN = 1;
//        //定义初始数组arr1
//        int[] arr1 = new int[10];
//        //把随机生成的数赋值给数组arr1
//        System.out.println("随机数组成的数组为：");
//        for (int i = 0; i < 10; i++){
//            arr1[i] = random.nextInt(MAX-MIN);
//            System.out.print(arr1[i]+"\t");
//        }
//        //先定义一个存放逆序后的新数组arr2
//        int[] arr2 = new int[10];
//        //逆序遍历arr1并将元素值赋值给arr2
//        for (int i = arr1.length-1,j = 0; i >= 0; i--,j++){
//            arr2[j] = arr1[i];
//        }
//        //后令arr2指向arr1
//        arr1 = arr2;
//        System.out.println("");
//        System.out.println("倒序后的数组为：");
//        for (int i = 0; i < 10; i++){
//            System.out.print(arr1[i]+"\t");
//        }
//        System.out.println("");
//        //求数组arr1的平均值=遍历arr1，并累加元素的值求和/arr.length
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++){
//            sum += arr1[i];
//        }
//        System.out.println("arr1的平均值="+sum/arr1.length);
//        //求数组arr1元素的最大值=冒泡排序后取最后一个元素
//        int temp = 0;
//        for (int i = 0; i < arr1.length - 1; i++){
//            for (int j = 0; j < arr1.length - 1 - i; j++){
//                if (arr1[j] > arr1[j+1]){
//                    temp = arr1[j];
//                    arr1[j] = arr1[j+1];
//                    arr1[j+1] = temp;
//                }
//            }
//        }
//        //取最大值所在的索引
//        System.out.println("数组arr1的最大值为："+arr1[arr1.length-1]+" "+"索引为："+(arr1.length-1));
//        //查找
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你要查找的元素");
//        String findName = scanner.next();
//        int index = -1;
//        for (int i = 0; i < arr1.length; i++){
//            if (findName.equals(arr1[i])){
//                System.out.println("恭喜你找到了"+arr1[i]);
//                index = i;
//                break;
//            }
//        }
//        if (index == -1){
//            System.out.println("很遗憾没有这个元素");
//        }
     }
}
