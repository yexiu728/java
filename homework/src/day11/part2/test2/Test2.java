package day11.part2.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 23, 1.80));
        list.add(new Person("李四", 24, 1.60));
        list.add(new Person("王五", 25, 1.70));
        list.add(new Person("赵六", 26, 1.73));
        list.add(new Person("钱七", 20, 1.65));

        Person maxHeight= list.get(0);
        Person minHeight = list.get(0);

        Iterator<Person> it = list.iterator();

        while(it.hasNext()) {
            Person p = it.next();

            if(maxHeight.getHeight() < p.getHeight()) {
                maxHeight = p;
            }
            if(minHeight.getHeight() > p.getHeight()) {
                minHeight = p;
            }
        }

        System.out.println("最高的人是 " + maxHeight);
        System.out.println("最矮的人是 " + minHeight);

    }
}
