package day15;

public class Test1 {


    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName() + " s1");
                        synchronized (s2) {
                            System.out.println(Thread.currentThread().getName() + " s2");
                        }
                    }
                }
            }
        }, "线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + " s1");
                        synchronized (s1) {
                            System.out.println(Thread.currentThread().getName() + " s2");
                        }
                    }
                }
            }
        }, "线程2").start();

    }
}

