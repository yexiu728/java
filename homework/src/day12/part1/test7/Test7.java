package day12.part1.test7;

import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("张三", 23));
        set.add(new Person("李四", 24));
        set.add(new Person("王五", 15));
        set.add(new Person("赵六", 16));
        set.add(new Person("赵六", 16));

        for (Person p : set) {
            System.out.println(p);
        }

    }
}
