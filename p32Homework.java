package indi.wqf;

public class p32Homework {
    public static void main (String[]args ){
        //01
        //编写hello，world程序
        System.out.println("Hello World");


        //02
        //将个人的基本信息（姓名，性别，籍贯，住址）打印到控制台上输出，各信息分别占一行
        System.out.println("姓名\t性别\t籍贯\t住址\n张三\t男\t北京\t北京");


        //03
        //jdk,jre,jvm的关系
        /*
        答案：
            1、jdk = jre + java开发工具
            2、jre = jvm + 核心类库
         */


        //04
        //环境变量path的配置及其作用
        /*
        作用：环境变量的作用是为了在dos的任意目录，可以去使用Java和javac命令
        配置：先配置JAVA_HOME = 指向jdk安装主目录
             编辑path环境变量，增加%JAVA_HOME%\bin
         */


        //05
        //Java编写步骤
        /*
        1、编写Java的原文件
        2、javac编译，得到对应的.class字节码文件
        3、Java运行，本质就是把.class加载到jvm运行
         */


        //06
        //java编写的7个规范
        /*
        1、类，方法的注释，使用javadoc的方式，及文档注释
        2、非javadoc注释，往往是对代码的说明（给维护者）说明如何修改，注意事项
        3、使用tab，整体将代码右移，使用shift + tab整体左移
        4、运算符和 = 的两边加空格，代码看上去更加清楚，如：int n = 1 + 4；
        5、源码文件使用utf-8编码
        6、行宽字符不超过80
        7、代码编程风格有两个：次行风格，行尾风格（推荐）两者皆可
         */


        //07
        //初学者易犯的错误
        /*
        1、编译或者运行时，找不到文件 javac hello.java，把文件名或者目录找对
        2、主类名和文件名不一致，修改时保持一致即可
        3、缺少；
        4、拼写错误1 -> l,o -> 0
         */
    }
}
