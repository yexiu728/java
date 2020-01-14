package day12.part1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=====");

        for (String str : set) {
            System.out.println(str);
        }

    }
}
