package day12.part2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        String[] arr={"abc","bad","abc","aab","bad","cef","jhi"};

        HashSet<String> set = new HashSet<>();

        for (String str : arr) {
            set.add(str);
        }

        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);

        for (String str : list) {
            System.out.println(str);
        }

    }
}
