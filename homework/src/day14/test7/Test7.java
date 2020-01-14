package day14.test7;

public class Test7 {
    public static void main(String[] args) {
        Car car = new Car();

        Thread t1 = new Thread(car, "前门");
        Thread t2 = new Thread(car, "中门");
        Thread t3 = new Thread(car, "后门");

        t1.start();
        t2.start();
        t3.start();

    }
}
