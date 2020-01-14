package day7.test7;

public abstract class Employee {
    private String workNo;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String workNo, String name, double salary) {
        this.workNo = workNo;
        this.name = name;
        this.salary = salary;
    }

    public abstract void eat();

    public abstract void work();

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
