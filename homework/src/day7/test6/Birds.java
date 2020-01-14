package day7.test6;

public abstract class Birds {

    private int age;
    private String color;

    public Birds() {
    }

    public Birds(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
