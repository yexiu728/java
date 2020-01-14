package day5;

public class Person {
    private String name;
    private int salary;

    public Person() {
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void show() {
        System.out.println("姓名：" + this.name + ", 工资：" + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
