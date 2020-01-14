package day2;

public class Test8 {
    public static void main(String[] args) {
        char ch = 'J';
        ch = (char)(ch + 32);
        System.out.println("J 转换成小写后为：" + ch);

        char ch2 = 'a';
        ch2 -= 32;
        System.out.println("a 转换成大写后为：" + ch2);

        double d3 = 10.1;
        int i3 = 20;
        double sum3 = d3 + i3;
        System.out.println(sum3 + " 去掉小数部分后为：" + (int)sum3);

        double d4 = 2.2;
        int i4 = 3;
        double mul4 = d4 * i4;
        System.out.println(mul4 + " 去掉小数部分后为：" + (int)mul4);
    }
}
