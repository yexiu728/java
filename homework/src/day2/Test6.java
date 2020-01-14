package day2;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        printString();
    }

    public static void printString() {
        int num = 11;
        String str = num + " 是" + (num % 2 == 0 ? "偶数" : "奇数");
        System.out.println(str);
    }

}
