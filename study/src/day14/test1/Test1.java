package day14.test1;

public class Test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread对象");
        Thread t2 = new Thread(new MyRunnable(), "MyRunnable对象");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " Runnable: " + i);
                }
            }
        }, "ThreadRunnable匿名方式");

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " Runnable: " + i);
            }
        }, "ThreadRunnableLambda表达式");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " main: " + i);
        }
    }
}
