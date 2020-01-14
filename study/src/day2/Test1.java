package day2;

public class Test1 {
    public static void main(String[] args) {
        /*System.out.println(7 % 3); // 1
        System.out.println(7 % -3); // 1
        System.out.println(-7 % 3); // -1
        System.out.println(-7 % -3); // -1*/

        /*short f1 = 10;
        short f = (short) (f1 + 20);*/

        float f = 10.1F;
        long l = 2147483648L;

        getItem(1234);

    }

    public static void getItem(int num) {

        int g = 0; // 个位
        int s = 0; // 十位
        int b = 0; // 百位
        int q = 0; // 千位

        if (num < 1000 || num >= 10000) {
            System.out.println(num + " 不在范围");
            return;
        }

        // 1234
        g = num % 10;
        s = num / 10 % 10;
        b = num / 100 % 10;
        q = num / 1000 % 10;

        System.out.println("千位:" + q + ", 百位:" + b + ", 十位:" + s + ", 个位:" + g);

    }
}
