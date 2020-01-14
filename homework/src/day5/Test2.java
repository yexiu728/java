package day5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        int a = scan.nextInt();
        System.out.print("请输入第二个数：");
        int b = scan.nextInt();
        System.out.print("请输入第三个数：");
        int c = scan.nextInt();

        int max = (a > b ? a : b);
        max = (max > c ? max : c);

        System.out.println("三个数的最大值：" + max);

    }
}
