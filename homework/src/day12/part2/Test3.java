package day12.part2;

import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};

        LinkedList<String> list = new LinkedList<>();

        for (String str : strs) {
            if(!list.contains(str)) {
                list.add(str);
            }
        }

        for (String str : list) {
            System.out.print(str + "  ");
        }

        System.out.println();

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

    }
}
