package day14.test5;

import day13.test2.part2.test3.Test;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {

        ShanDong sd = new ShanDong();
        ArrayList<Thread> people = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            people.add(new Thread(sd, "人类 " + (i + 1) + " 号"));
        }

        for (Thread t : people) {
            t.start();
        }

    }
}
