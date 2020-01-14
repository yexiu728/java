package day10.test2;

public class Test2 {
    public static void main(String[] args) {
        Person person = new Person("张三", 23);
        Person person2 = new Person("张三", 23);

        System.out.println(person == person2);
        System.out.println(person.equals(person2));

        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        System.out.println("Ma".hashCode()); // 2484
        System.out.println("NB".hashCode()); // 2484

        new Object().equals("");
        new Integer(1);
    }
}
