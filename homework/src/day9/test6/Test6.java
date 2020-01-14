package day9.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 额外作业：
    student(name,age，score)
    List<Student>list=new ArrayList<>();
    List<Student>list2=new ArrayList<>();
    班级a有若干学生
    班级b有若干学生

    1.打印总共有多少姓张的学生的个数
    2.先按年龄降序，再按成绩升序排序
    3.打印2个班级中前3个姓张且年龄小于18岁的学生信息
* */
public class Test6<T> {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        ArrayList<Student> b = new ArrayList<>();

        a.add(new Student("张三丰", 30, 80));
        a.add(new Student("张四丰", 10, 70));
        a.add(new Student("张五丰", 15, 50));
        a.add(new Student("赵三丰", 40, 70));
        a.add(new Student("钱三丰", 20, 50));
        a.add(new Student("孙三丰", 5, 30));

        b.add(new Student("张三郎", 15, 80));
        b.add(new Student("张四郎", 20, 70));
        b.add(new Student("张五郎", 10, 50));
        b.add(new Student("赵三郎", 40, 70));
        b.add(new Student("钱三郎", 20, 20));
        b.add(new Student("孙三郎", 20, 30));

        Stream<Student> students = Stream.concat(a.stream(), b.stream());

        // 1.打印总共有多少姓张的学生的个数
        System.out.println("姓张的学生的个数为：" + students.count() + " 个");

        // 2.年龄降序，成绩升序
        // 流已经关闭，需要再次获得流
        students = Stream.concat(a.stream(), b.stream());
        List<Student> stuList1 = students.sorted((stu1, stu2) -> {
            if(stu1.getAge() == stu2.getAge()) {
                return stu1.getScore() - stu2.getScore();
            }
            return stu2.getAge() - stu1.getAge();
        }).collect(Collectors.toList());
        System.out.println("排序后：" + stuList1);

        // 3.打印2个班级中前3个姓张且年龄小于18岁的学生信息
        // 流已经关闭，需要再次获得流
        students = Stream.concat(a.stream(), b.stream());
        List<Student> stuList2 = students.filter(student -> {
            return student.getName().startsWith("张") && student.getAge() < 18;
        }).limit(3).collect(Collectors.toList());
        System.out.println("姓张且年龄小于18的三个学生：" + stuList2);

    }

}
