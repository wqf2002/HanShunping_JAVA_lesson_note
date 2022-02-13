package indi.wqf;
import java.util.Scanner;
public class p109DoubleBranch {
    public static void ticket(String[] args) {
        //判断一个年份是否是闰年(多分支)
        Scanner years = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = years.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是 闰年");
        } else {
            System.out.println(year + "不是 闰年");
        }


        //通过信用分判断信用情况（多分支）
        //先对输入的信用分进行一个范围的有效判断1-100否则提示错误
        Scanner marks = new Scanner(System.in);
        System.out.println("请输入信用分数：");
        int mark = marks.nextInt();
        if (0 <= mark && mark <= 100) {
            if (mark == 100) {
                System.out.println("信用良好");
            } else if (80 < mark && mark <= 99) {
                System.out.println("信用优秀");
            } else if (60 <= mark && mark <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("信用分需要在1-100，请重新输入：");
        }


        //应用案例【嵌套分支（最多嵌套三层）】
        //参加歌手比赛,如果初赛成绩大于8.0进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组
        Scanner genders = new Scanner(System.in);
        Scanner scores = new Scanner(System.in);
        System.out.println("请输入该歌手成绩：");
        double score = scores.nextInt();
        if (score > 8.0) {
            System.out.println("请输入性别：");
            char gender = genders.next().charAt(0);
            if (gender == '男') {
                System.out.println("请进入男子组");
            } else if (gender == '女') {
                System.out.println("请进入女子组");
            } else {
                System.out.println("性别输入有误");
            }
        } else {
            System.out.println("你被淘汰了");
        }
    }

    public static void main(String[] args){
        // 出票系统：
        // 根据旺淡季的月份和年龄打印票价 旺（4-10）:成人（18-60）：60，儿童（18<）:半价，老人（>60）:1/3 淡：成人：40 其他：20
        int money = 0;
        Scanner months = new Scanner(System.in);
        Scanner ages = new Scanner(System.in);
        System.out.println("请输入购票月份");
        int month = months.nextInt();
        System.out.println("请输入购票人年龄：");
        int age = ages.nextInt();
        if(4 <= month && month <= 10){
            if(0 <= age && age < 18){
                money = 30;
            }else if(18 <= age && age <= 60){
                money = 60;
            }else if(60 < age ){
                money = 30;
            }else{
                System.out.println("输入年龄有误");
            }
        }else if(1 <= month && month <= 4 || 10 <= month && month <= 12){
            if(18 <= age && age <= 60){
                money = 40;
            }else if(0 <= age && age < 18 || 60 < age){
                money = 20;
            }else{
                System.out.println("输入年龄有误");
            }
        }else{
            System.out.println("输入的月份有误");
        }
        System.out.println(money);
    }
}
