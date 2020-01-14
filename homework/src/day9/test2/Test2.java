package day9.test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张老师");
        Student s1 = new Student("小红", "上课");
        Student s2 = new Student("小亮", "上课");
        Student s3 = new Student("小明", "旷课");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Clazz clazz = new Clazz("Java", t, students);
        clazz.show();

    }
}
