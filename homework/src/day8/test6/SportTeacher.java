package day8.test6;

public class SportTeacher extends Teacher implements Sport {

    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + this.age + " 岁的" + this.name + "老师在打篮球");
    }
}
