package day8.test7;

public class Company implements Money {

    double money;

    public Company() {
    }

    public Company(double money) {
        this.money = money;
    }

    @Override
    public void paySalary(Employee e) {
        money -= e.getSalary();
        System.out.println("给" + e.getName() + "发工资 " + e.getSalary() + " 元，公司剩余：" + money + "元");
    }
}
