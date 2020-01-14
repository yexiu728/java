package day7.test6;

public class Chicken extends Birds {

    public Chicken() {
    }

    public Chicken(int age, String color) {
        super(age, color);
    }

    public void daMing() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在打鸣");
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在啄米");
    }

}
