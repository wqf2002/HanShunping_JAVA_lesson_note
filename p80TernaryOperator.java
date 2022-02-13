package indi.wqf;
//三元运算符练习
public class p80TernaryOperator {
    public static void main(String[] args) {
        //案例：求三个数的最大值
        //思路：
        //1.先得到n1和n2中的最大值保存到max1
        //2.再求出max1和n3中的最大数，保存到max2
        int n1 = 4;
        int n2 = 2;
        int n3 = 5;
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数为"+max2);

        //使用一条语句实现
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println("最大数为"+max2);


    }
}
