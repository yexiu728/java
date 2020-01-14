package day14.test7;

public class Car implements Runnable {

    private int num = 80;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(num <= 0) {
                    break;
                }

                System.out.println(Thread.currentThread().getName() + " 上车---还剩 " + (--num) + " 个座");

            }
        }
    }
}
