package day14.test8;

public class Ticket implements Runnable {

    private int num = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (num <= 0) {
                    break;
                }

                System.out.println("当前窗口为: " + Thread.currentThread().getName() + " , 卖了一张票, 剩余票数为" + --num);
            }
        }
    }
}
