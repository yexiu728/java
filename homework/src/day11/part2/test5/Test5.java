package day11.part2.test5;

import java.util.ArrayList;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 23, 1.70));
        list.add(new Person("李四", 24, 1.50));
        list.add(new Person("王五", 25, 1.60));
        list.add(new Person("赵六", 26, 1.53));
        list.add(new Person("钱七", 20, 1.65));

        Iterator<Person> it = list.iterator();

        while(it.hasNext()) {
            Person p = it.next();
            p.setAge(p.getAge() + 2);
        }

        for (Person p : list) {
            System.out.println(p);
        }

    }
}
