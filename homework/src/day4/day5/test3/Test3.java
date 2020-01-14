package day4.day5.test3;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("周老师", 30, "Java面向对象");
        Student s = new Student("韩同学", 18, "Java面向对象");

        t.eat();
        t.teach();

        s.eat();
        s.study();
    }
}
