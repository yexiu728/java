package day5;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        Random ran = new Random();
        for(int i = 0; i < 5; i++) {
            System.out.println(ran.nextInt(10) + 1);
        }

    }
}
