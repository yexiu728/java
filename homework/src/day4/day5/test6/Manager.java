package day4.day5.test6;

public class Manager {
    private String name;
    private String gongHao;
    private int salary;
    private int jiangJin;

    public void intro() {
        System.out.println("经理姓名：" + this.name);
        System.out.println("工号：" + this.gongHao);
    }

    public Manager(String name, String gongHao, int salary, int jiangJin) {
        this.name = name;
        this.gongHao = gongHao;
        this.salary = salary;
        this.jiangJin = jiangJin;
    }

    public void showSalary() {
        System.out.println("基本工资为" + this.salary + ", 奖金为" + this.jiangJin);
    }

    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
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

    public int getJiangJin() {
        return jiangJin;
    }

    public void setJiangJin(int jiangJin) {
        this.jiangJin = jiangJin;
    }
}
