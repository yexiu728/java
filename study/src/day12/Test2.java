package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 3, 8, 5);

        // sort1(list);
        // sort2(list);
        sort3(list);

    }

    public static void sort3(ArrayList<Integer> list){
        Collections.sort(list, (Integer a, Integer b) -> {
            return b - a;
        });
        System.out.println(list);
    }

    public static void sort2(ArrayList<Integer> list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }

    public static void sort1(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
}
