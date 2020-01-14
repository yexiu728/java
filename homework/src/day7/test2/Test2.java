package day7.test2;

public class Test2 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("马化腾");
        Teacher teacher = new Teacher();
        teacher.setName("马云");

        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("----------");
        teacher.eat();
        teacher.sleep();
        teacher.teach();

    }
}
