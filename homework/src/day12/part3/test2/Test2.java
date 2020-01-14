package day12.part3.test2;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Student> clazz1 = new HashSet<>();
        HashSet<Student> clazz2 = new HashSet<>();
        HashSet<HashSet<Student>> subject = new HashSet<>();

        clazz1.add(new Student("1班张三", 23));
        clazz1.add(new Student("1班李四", 24));

        clazz2.add(new Student("2班小明", 20));
        clazz2.add(new Student("2班小红", 18));

        subject.add(clazz1);
        subject.add(clazz2);

        // 使用迭代器遍历
        Iterator<HashSet<Student>> itOut = subject.iterator();
        while(itOut.hasNext()) {
            HashSet<Student> c = itOut.next();
            Iterator<Student> itIn = c.iterator();
            while(itIn.hasNext()) {
                System.out.print(itIn.next() + "  ");
            }
            System.out.println();
        }

        // 分割线
        System.out.println("==========");

        // 使用增强for 遍历
        for (HashSet<Student> c : subject) {
            for (Student s : c) {
                System.out.print(s + "  ");
            }
            System.out.println();
        }

    }
}
