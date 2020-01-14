package day2;

public class Test7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
        remain(a, b);
    }

    public static void add(int a, int b) {
        System.out.println(a + " 与" + b + " 的和为：" + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println(a + " 与" + b + " 的差为：" + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println(a + " 与" + b + " 的积为：" + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println(a + " 与" + b + " 的商为：" + (a / b));
    }

    public static void remain(int a, int b) {
        System.out.println(a + " 与" + b + " 的余数：" + (a % b));
    }
}
