package day12.part2.test10;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();
        set.add(new Student("张三", 23, 90));
        set.add(new Student("李四", 24, 100));
        set.add(new Student("王五", 28, 80));
        set.add(new Student("赵六", 27, 70));
        set.add(new Student("钱七", 26, 85));

        Iterator<Student> it = set.iterator();
        Student stu = null;

        if(it.hasNext()) {
            stu = it.next();
        }

        int max = stu.getScore();
        int min = stu.getScore();
        int count = 0;

        for (Student s : set) {
            count += s.getScore();
            if(max < s.getScore()) {
                max = s.getScore();
            }
            if(min > s.getScore()) {
                min = s.getScore();
            }
        }
        double avg = (double)count / set.size();

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("总分：" + count);
        System.out.println("平均分：" + avg);

    }
}
