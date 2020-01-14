package day12.part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        Random ran = new Random();

        while(set.size() < 10) {
            set.add(ran.nextInt(20) + 1);
        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
