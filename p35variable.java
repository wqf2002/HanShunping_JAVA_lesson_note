package indi.wqf;

import java.util.TooManyListenersException;

public class p35variable {
    public static void main(String[] args){
        //原理
        int a = 1;//定义了一个变量，类型int整型，名称a值1
        int b = 3;//定义了一个变量，类型int整型，名称a值3
        b = 89;//把89值赋给b变量
        System.out.println(a);
        System.out.println(b);
        //概念
        //变量相当于内存中一个数据存储空间的表示。

        //案例一
        //声明变量
        int c;
        c = 100;
        System.out.println(c);
        //另一种声明变量的方法
        int d;
        d = 800;
        System.out.println(d);

        //定义变量
        int e = 20;//整型
        double f = 88.6;//小数
        char g = '男';//字符
        String h = "Tom";//字符串

        //案例二
        //记录人的信息
        byte age = 30;
        double score = 88.6;
        char gender = '男';
        String name = "king";
        System.out.println("人的信息如下：");
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);
        System.out.println(name);

        //变量细节
        /**
         * 变量必须先声明在使用
         * 该区域的数据（值）可以在同一类型范围内不断变化
         * 变量在同一作用域内不能重名
         * 变量 = 变量名 + 值 + 数据类型（变量三要素）
         */



    }
}
