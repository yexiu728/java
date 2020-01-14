package day14.test6;

public class Cup implements Runnable {

    int cupNum = 100;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(cupNum <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 卖出水杯第 " + (100 - --cupNum) + " 个, 总共剩余 " + cupNum + " 个");
            }
        }
    }
}
