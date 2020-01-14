package day12.part2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.addAll(list);

        list.clear();

        list.addAll(set);

        System.out.println(list);

    }
}
