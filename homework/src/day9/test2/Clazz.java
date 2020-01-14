package day9.test2;

import java.util.ArrayList;

public class Clazz {
    private String clazzName;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Clazz() {
    }

    public Clazz(String clazzName, Teacher teacher, ArrayList<Student> students) {
        this.clazzName = clazzName;
        this.teacher = teacher;
        this.students = students;
    }

    public void show() {
        System.out.println("课程名称：" + clazzName);
        System.out.println("授课老师：" + teacher.getName());
        for (Student stu : students) {
            System.out.println(stu.getChuQin() + "：" + stu.getName());
        }
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
