package day6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        System.out.println("请输入一个字符串");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str.replace(mgc, "*"));

    }
}
