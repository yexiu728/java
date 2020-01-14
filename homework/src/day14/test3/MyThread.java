package day14.test3;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("子线程：" + Thread.currentThread().getName());
    }
}
