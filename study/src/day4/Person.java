package day4;

public class Person {
    // 姓名
    String name;
    // 年龄
    int age;
    // 性别
    char sex;

    public void speak() {
        System.out.println(name + " 在聊天");
    }

    public void eat() {
        System.out.println(age + " 岁的 " + name + " 在吃饭");
    }

    public void sleep() {
        System.out.println("再坚强的 " + sex + " 性也要睡觉");
    }

}
