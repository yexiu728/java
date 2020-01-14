package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(t);
        e.submit(t);
        e.submit(t);
        e.submit(t);
        e.submit(t);

        // 关闭线程池
        e.shutdown();
    }
}
