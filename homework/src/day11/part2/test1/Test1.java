package day11.part2.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三", 23, 93));
        list.add(new Student("李四", 24, 44));
        list.add(new Student("王五", 25, 85));
        list.add(new Student("赵六", 26, 96));
        list.add(new Student("钱七", 27, 77));

        // 总分
        int sum = 0;
        // 平均分
        double avg = 0;
        // 最高分
        int max = list.get(0).getScore();
        // 最低分
        int min = list.get(0).getScore();

        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            sum += s.getScore();
            if(s.getScore() > max) {
                max = s.getScore();
            }
            if(s.getScore() < min) {
                min = s.getScore();
            }
        }
        avg = (double) sum / list.size();

        System.out.println("总分为" + sum);
        System.out.println("平均分为：" + avg);
        System.out.println("最高分为：" + max);
        System.out.println("最低分为：" + min);

    }
}
