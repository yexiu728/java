package day14.test3;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("主线程：" + Thread.currentThread().getName());

        MyThread t1 = new MyThread();

        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

    }
}
