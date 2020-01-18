package test;

import java.util.Scanner;

// 证明在控制台输出的内容不属于用户输入，不会混乱
public class SysIn {
    public static void main(String[] args) {
        new Thread(() -> {
            Scanner scan = new Scanner(System.in);
            while (true) {
                String str = scan.nextLine();
                System.out.println("输入了：" + str);
            }
        }).start();

        while (true) {
            System.out.println("hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
