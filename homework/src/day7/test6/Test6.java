package day7.test6;

public class Test6 {
    public static void main(String[] args) {
        Chicken chicken = new Chicken(2, "红色");
        chicken.eat();
        chicken.daMing();

        Duck duck = new Duck(1, "黑色");
        duck.eat();
        duck.swim();
    }
}
