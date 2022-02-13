package indi.wqf;

public class p102BitOperator {
    public static void main(String[] args){
        System.out.println(1 >> 2);//0
        System.out.println(1 << 2);//4
        System.out.println(4 << 3);// 4 * 2 * 2 * 2 = 32
        System.out.println(15 >> 2);// 15 / 2 / 2 = 3

        System.out.println(-10.4%3);// -1.4(近似值)‘

        int i = 66;
        System.out.println(++i+i);// ++i = i + 1 = 67 => +i = i + i = 67 + 67 = 134

    }
}
