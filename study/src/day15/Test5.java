package day15;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test5 {

    public static void main(String[] args) {
        MyCall myCall = new MyCall();
        FutureTask<Object> task = new FutureTask<>(myCall);
        new Thread(task).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}

class MyCall implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        return "hello";
    }

}
