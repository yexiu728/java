package day7.test7;

public class Message extends Employee {

    public Message() {
    }

    public Message(String workNo, String name, double salary) {
        super(workNo, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getWorkNo() + ", 姓名为：" + getName() + ", 工资为：" + getSalary() + "的经理在吃鱼");
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getWorkNo() + ", 姓名为：" + getName() + ", 工资为：" + getSalary() + "的经理在工作，管理其他人");
    }
}
