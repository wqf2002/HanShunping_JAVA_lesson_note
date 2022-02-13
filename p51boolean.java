package indi.wqf;
/**
 * 1。布尔类型也叫Boolean类型，Boolean类型数据只允许取值true和false，无null
 * 2.boolean类型占一个字符
 * 3.boolean类型适用于逻辑运算，一般用于程序流程控制[后面详细介绍]
 * √ if条件控制语句
 * √ while循环控制语句
 * √ do-while循环控制语句
 * √ for循环控制语句
 */
public class p51boolean {
    public static void main(String[] args) {
        //演示判断成绩是否通过的案例
        //定义一个布尔变量
        boolean isPass = true;
        if(isPass){
            System.out.println("考试通过");
        }
        else{
            System.out.println("考试没有通过");
        }
    }
}
