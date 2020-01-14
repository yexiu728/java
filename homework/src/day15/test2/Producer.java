package day15.test2;

// 生产者
public class Producer implements Runnable {

    private BaoZi baoZi;

    private Producer() {
    }

    public Producer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                baoZi.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baoZi) {

                if (baoZi.getNum() >= 10) {
                    Thread.yield();
                    continue;
                }

                baoZi.setNum(baoZi.getNum() + 1);
                System.out.println(Thread.currentThread().getName() + " 生产了一个包子, 共有: " + baoZi.getNum() + " 个");

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
