package day15.test2;

// 消费者
public class Customer implements Runnable {

    private BaoZi baoZi;

    private Customer() {
    }

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (baoZi) {
                if (baoZi.getNum() <= 5) {
                    Thread.yield();
                    continue;
                }
                baoZi.setNum(baoZi.getNum() - 1);
                System.out.println(Thread.currentThread().getName() + " 吃了一个包子, 还剩: " + baoZi.getNum());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public BaoZi getBaoZi() {
        return baoZi;
    }

    public void setBaoZi(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
}
