package day12.part3;

import java.util.LinkedHashSet;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        Random ran = new Random();

        while(set.size() < 6) {
            set.add(ran.nextInt(33) + 1);
        }
        while(set.size() < 7) {
            set.add(ran.nextInt(16) + 1);
        }

        System.out.println("双色球号码为：" + set);

    }
}
