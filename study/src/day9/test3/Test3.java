package day9.test3;

public class Test3 {
    public static void main(String[] args) {
        new Person(){
            @Override
            public void eat() {
                System.out.println("吃饭了吗，我吃了");
            }

            @Override
            public void sleep() {

            }
        }.eat();

        Teacher teacher = new Teacher();
        teacher.sleep();

        Teacher.Mouth  mouth = new Teacher().new Mouth();
        // mouth = teacher.new Mouth();
        mouth.speak();

    }
}
