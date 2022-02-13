package indi.wqf;

public class p39plus {
    public static void main(String[] args){
        //程序中加号的使用
        /**
         * 当左右两边都是数值型时则作加法运算
         * 当左右两边有一方是字符串则作拼接运算
         */
        //text
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 98 + "HELLO");
        System.out.println("hello" + 100 + 98);

    }
}
