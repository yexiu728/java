package day8.test6;

public class SportStudent extends Student implements Sport {

    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + this.age + " 岁的" + this.name + "学生在打篮球");
    }
}
