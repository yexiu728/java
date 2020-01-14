package day15;

public class Test2 {
    public static void main(String[] args) {

        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + " 等待: " + (i + 1));

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "wait线程").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " 唤醒: " + (i + 1));
                    obj.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "notify线程").start();
    }
}
