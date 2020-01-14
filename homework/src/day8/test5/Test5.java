package day8.test5;

public class Test5 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.eat();
        c.eat();

        if(d instanceof Dog) {
            ((Dog)d).lookHome();
        }

        if(c instanceof Cat) {
            ((Cat)c).catchMouse();
        }

    }
}
