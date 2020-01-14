package day12.part2.test4;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        set.add(new Student("张三", 23, "男"));
        set.add(new Student("张三", 23, "男"));
        set.add(new Student("李四", 34, "男"));
        set.add(new Student("李四", 34, "男"));
        set.add(new Student("王五", 25, "男"));
        set.add(new Student("赵六", 26, "女"));
        set.add(new Student("钱七", 17, "男"));
        set.add(new Student("孙八", 18, "男"));
        set.add(new Student("小明", 20, "男"));
        set.add(new Student("小红", 22, "女"));
        set.add(new Student("小蓝", 23, "男"));
        set.add(new Student("小美", 18, "女"));

        Iterator<Student> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("===============");

        for (Student s : set) {
            System.out.println(s);
        }
        System.out.println();

    }
}
