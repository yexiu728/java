package day14;

public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 500; i++) {
                System.out.println("t1: " + i);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                if(i == 50) {
                    try {
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
