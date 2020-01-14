package day4.day5.test6;

public class Test6 {
    public static void main(String[] args) {
        Manager m = new Manager("James", "9527", 15000, 3000);
        Coder c = new Coder("Kobe", "0052", 10000);

        m.intro();
        m.showSalary();
        m.work();

        c.intro();
        c.showSalary();
        c.work();
    }
}
