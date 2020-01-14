package day4.day5.test6;

public class Coder {
    private String name;
    private String gongHao;
    private int salary;

    public Coder() {
    }

    public Coder(String name, String gongHao, int salary) {
        this.name = name;
        this.gongHao = gongHao;
        this.salary = salary;
    }

    public void intro() {
        System.out.println("程序员姓名：" + this.name);
        System.out.println("工号：" + this.gongHao);
    }

    public void showSalary() {
        System.out.println("基本工资为" + this.salary + ", 奖金无");
    }

    public void work() {
        System.out.println("正在努力写代码....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGongHao() {
        return gongHao;
    }

    public void setGongHao(String gongHao) {
        this.gongHao = gongHao;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
