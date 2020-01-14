package day7.test3;

public class Test3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.eat();
        dog.lookHome();

        System.out.println("----------");

        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.eat();
        cat.catchMouse();

    }
}
