package day12;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(23));
        list.add(new User(12));
        list.add(new User(11));
        list.add(new User(15));

        new Integer(1);
        Collections.sort(list);
        System.out.println(list);
    }
}
