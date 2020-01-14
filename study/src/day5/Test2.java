package day5;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int result = ran.nextInt(10) + 1;

        System.out.println("========== 猜数游戏 ==========");

        while (true) {
            System.out.print("你猜：");
            int guess = scan.nextInt();

            if(guess > result) {
                System.out.println("大了");
            } else if(guess < result) {
                System.out.println("小了");
            } else {
                System.out.println("========== 猜中了: " + result + " ==========");
                break;
            }
        }

    }
}
