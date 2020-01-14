package day14.test3;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    int num = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 加锁
            // lock.lock();

            synchronized (this) {
                if (num <= 0) {
                    System.out.println(Thread.currentThread().getName() + " 票已卖完");
                    // 解锁
                    // lock.unlock();
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 卖票: " + num);
                num--;
            }

            // 解锁
            // lock.unlock();

        }
    }
}
