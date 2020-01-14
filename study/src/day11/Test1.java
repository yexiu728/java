package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("马云");
        list.add("马化腾");
        list.add("马赛克");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=====");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        new HashMap<>();

    }
}
