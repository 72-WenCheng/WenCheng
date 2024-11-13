package com.mian.duixiang;

/**
 * 重载
 * 同一个类中，可以存在多个同名方法，要求形参不一致
 * 好处减轻了起名的麻烦
 * 注意细节
 * 方法名必须相同
 * 参数列表必须不同（参数类型或个数或顺序，参数名无要求）
 * 返回类型无要求
 */
public class day03 {
    public static void main(String[] args) {
        day03 hy = new day03();

        int res1 = hy.calculate(1,1);
        System.out.println(res1);

        int res2 = hy.calculate(1,1,1);
        System.out.println(res2);

        double res3 = hy.calculate(1,2.0);
        System.out.println(res3);
    }
    public int calculate(int n1, int n2){
        return n1+n2;
    }
    public int calculate(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double calculate(int n1, double n2){
        return n1+n2;
    }
}
