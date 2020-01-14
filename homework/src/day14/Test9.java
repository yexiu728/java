package day14;

public class Test9 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 10; i++) {
                num *= i;
            }
            System.out.println("10! = " + num);
        });

        Thread t2 = new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 5; i++) {
                num *= i;
            }
            System.out.println("5! = " + num);
        });

        Thread t3 = new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 8; i++) {
                num *= i;
            }
            System.out.println("8! = " + num);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
