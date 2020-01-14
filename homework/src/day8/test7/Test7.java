package day8.test7;

public class Test7 {
    public static void main(String[] args) {
        Manager m = new Manager("张小强", 9000.0);
        Coder c = new Coder("李小亮", 5000.0);
        Company company = new Company(1000000.0);

        company.paySalary(m);
        company.paySalary(c);
    }
}
