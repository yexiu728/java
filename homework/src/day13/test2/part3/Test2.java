package day13.test2.part3;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            int count = 0;
            Random ran = new Random();

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    int num = ran.nextInt(900) + 100;
                    System.out.print(num + "  ");
                    count += num;
                }
                System.out.println();
                System.out.println(count);
            }
        }).start();
    }

}
