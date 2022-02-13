package com.company;
//转义字符的应用
public class p21changechar {
    public static void main(String[] args){
        //\t一个制表位，实现对齐功能
        System.out.println("\\t一个制表位，实现对齐功能");
        System.out.println("ww\tee\trr\thh");
        //\n换行符
        System.out.println("\\n换行符");
        System.out.println("ww\tee\trr\thh");
        //\\一个\
        System.out.println("\\\\一个\\");
        System.out.println("ww\\ee\\rr\\hh");
        //一个\'输出一个‘，一个\”输出一个“
        System.out.println("一个\\'输出一个‘，一个\\”输出一个“");
        System.out.println("他说:'哈哈哈'");
        System.out.println("他说:\"哈哈哈\"");
        //\r一个回车，光标从字符串尾部移动到头部，并继续输出字符
        System.out.println("一二三四五\r\n六七");
        //例：书名 作者  价格 销量
        //   三国 罗贯中 120 1000
        //注：未对齐可适当增加\t
        System.out.println("书名\t作者\t\t价格\t销量\n三国\t罗贯中\t120\t1000");
    }

}
