package indi.wqf;
import java.util.Scanner;
public class p86input {
    public static void main(String[] args){
        //演示接受用户的输入
        //步骤
        //Scanner类表示简单文本扫描器，在Java.util包
        //1、导入Scanner类所在包
        //2、创建Scanner对象，new创建一个对象
        //3、接收用户的输入，使用相关方法
        //当程序执行到next会等待用户输入
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水：");
        double money = myScanner.nextDouble();
        System.out.println("人的信息如下：");
        System.out.println("名字:"+ name + "年龄：" + age + "薪水" + money);

    }
}
