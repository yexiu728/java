package day14.test3;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("子线程：" + Thread.currentThread().getName());
    }
}
