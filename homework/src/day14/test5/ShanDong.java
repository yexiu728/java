package day14.test5;

import java.util.concurrent.locks.ReentrantLock;

public class ShanDong implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 已经通过山洞");
        }

    }
}
