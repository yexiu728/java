package day12.part1;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 33, 11, 77, 55);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        for (Integer i : list) {
            System.out.print(i + "  ");
        }

    }
}
