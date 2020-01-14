package day15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test4 {
    public static void main(String[] args) {

        Shower shower = new Shower();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        shower.show1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        shower.show2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Shower {

    ReentrantLock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Integer count = 0;

    public void show1() throws InterruptedException {
        lock.lock();
        if(count == 1) {
            c1.await();
        }

        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();

        count = 1;
        c2.signal();
        lock.unlock();
    }

    public void show2() throws InterruptedException {
        lock.lock();

        if(count == 0) {
            c2.await();
        }

        System.out.print("虽");
        System.out.print("远");
        System.out.print("必");
        System.out.print("诛");
        System.out.println();

        count = 0;
        c1.signal();
        lock.unlock();
    }
}
