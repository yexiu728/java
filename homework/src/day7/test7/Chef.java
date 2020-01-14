package day7.test7;

public class Chef extends Employee {

    public Chef() {
    }

    public Chef(String workNo, String name, double salary) {
        super(workNo, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getWorkNo() + ", 姓名为：" + getName() + ", 工资为：" + getSalary() + "的厨师在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getWorkNo() + ", 姓名为：" + getName() + ", 工资为：" + getSalary() + "的厨师在工作，炒菜");
    }
}
