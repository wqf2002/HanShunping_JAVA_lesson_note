package indi.wqf;

public class p100BitOperator {

    public static  void main(String[]args){
        //正数三码合一
        //推导2&3
        //1.先得到2的补码=> 2的原码 00000000 00000000 00000000 00000010
        //                2的补码 00000000 00000000 00000000 00000010
        //2.再得到         3的原码 00000000 00000000 00000000 00000011
        //                3的补码 00000000 00000000 00000000 00000011
        //3.按位&                 00000000 00000000 00000000 00000010
        //                       00000000 00000000 00000000 00000011
        //                       00000000 00000000 00000000 00000010  & 运算后的补码
        //                       00000000 00000000 00000000 00000010  & 运算后的源码
        //4.结果是2
        System.out.println(2&3);

        //推导
        //1.先得到 -2的原码   10000000 00000000 00000000 00000010
        //2.-2的反码（补码-1）11111111 11111111 11111111 11111101
        //3.-2的补码（反码+1）11111111 11111111 11111111 11111110
        //4.~-2操作         00000000 00000000 00000000 00000001
        //5.运算后的原码为    00000000 00000000 00000000 00000001
        //结果是 1
        System.out.println(~-2);

        //推导
        //1.得到2的补码 00000000 00000000 00000000 00000010
        //2.~2操作     11111111 11111111 11111111 11111101
        //3.运算后的反码11111111 11111111 11111111 11111100
        //4.运算后的原码10000000 00000000 00000000 00000011
        //3.结果 -3
        System.out.println(~2);

    }
}
