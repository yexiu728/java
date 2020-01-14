package day12;

public class User implements Comparable<User> {
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        return o.getAge() - this.getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
